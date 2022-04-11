public class CurrencyModel {

    private double amount;
    private CurrencyConstant currency;


    public CurrencyModel(){
    }

    public CurrencyModel(CurrencyConstant currency){
        this.currency = currency;
    }
    public CurrencyModel(double amount, CurrencyConstant currency){
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public CurrencyConstant getCurrency() {
        return currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(CurrencyConstant currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CurrencyModel{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }

    public CurrencyModel convertCurrency(CurrencyConstant newCurrency) {

        double conversionRate = ConvertionRateManager.getConversionRate(
                this.currency, newCurrency
        );

        double convertedAmount = Math.round((amount * conversionRate) *100.0) / 100.0;
        return new CurrencyModel(convertedAmount, newCurrency);
    }

}
