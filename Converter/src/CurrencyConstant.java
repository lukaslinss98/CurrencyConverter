public enum CurrencyConstant {


    EURO("EUR"), DOLLAR("USD"), FRANC("CHF"), AUSTRALIEN_DOLLAR("AUD");

    private final String countryCode;

    private CurrencyConstant(String countryCode){
        this.countryCode = countryCode;
    }

    public String getCountryCode(){
        return countryCode;
    }

}
