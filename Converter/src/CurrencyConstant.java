public enum CurrencyConstant {

    /**
     * Currency code (ISO 4217)
     */
    AUD("Australian Dollar"), ALL("Lek"), BRL("Real"),
    CHF("Franc"), CNY("Yuan"),DKK("Kroner"),
    DZD("Algerian Dinar"), EUR("Euro"), GBP("British pound sterlin"),
    HRK("Kuna"), JPY("Yen"), KRW("Won"), PLN("Zloty"),
    RUB("Rubel"), SEK("Krona"),USD("US Dollar"), VND("Dong");

    private final String currencyName;

    private CurrencyConstant(String currencyName){
        this.currencyName = currencyName;
    }

    public static CurrencyConstant[] getAll(){

        return  values();
    }

    public String getCurrencyName(){
        return currencyName;
    }


}
