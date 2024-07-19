package ca.ucalgary.ensf380;

public class Address {
    private String streetName;
    private String cityName;
    private String stateCode;
    private String postalIdentifier;
    private String countryName;

    public Address(String streetName, String cityName, String stateCode, String postalIdentifier, String countryName) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateCode = stateCode;
        this.postalIdentifier = postalIdentifier;
        this.countryName = countryName;
    }

    public boolean isValidAddress() {
        return !isNullOrEmpty(streetName) && !isNullOrEmpty(cityName) && 
               !isNullOrEmpty(stateCode) && !isNullOrEmpty(postalIdentifier) && !isNullOrEmpty(countryName);
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public String toFormattedString() {
        StringBuilder formattedAddress = new StringBuilder();
        formattedAddress.append(streetName).append(", ");
        formattedAddress.append(cityName).append(isNullOrEmpty(stateCode) ? "" : ", " + stateCode).append(" ");
        formattedAddress.append(postalIdentifier).append(", ").append(countryName);
        return formattedAddress.toString();
    }

    // the getters and setters
    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) { this.streetName = streetName; }

    public String getCityName() { return cityName; }
    public void setCityName(String cityName) { this.cityName = cityName; }

    public String getStateCode() { return stateCode; }
    public void setStateCode(String stateCode) { this.stateCode = stateCode; }

    public String getPostalIdentifier() { return postalIdentifier; }
    public void setPostalIdentifier(String postalIdentifier) { this.postalIdentifier = postalIdentifier; }

    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }
}

