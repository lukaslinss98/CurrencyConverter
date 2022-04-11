public enum CurrencyConstant {


    EUR("Euro"), USD("Dollar"), CHF("Franc"), AUD("Australian Dollar");

    private final String countryCode;

    private CurrencyConstant(String countryCode){
        this.countryCode = countryCode;
    }

    public static CurrencyConstant[] getAll(){

        return  values();
    }

    public String getCountryCode(){
        return countryCode;
    }


}
