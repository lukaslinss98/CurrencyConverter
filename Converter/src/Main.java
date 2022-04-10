public class Main {

    public static void main(String[] args) {
        CurrencyModel dollar = new CurrencyModel(10, CurrencyConstant.DOLLAR);
        System.out.println(dollar.toString());

        CurrencyModel euro = dollar.convertCurrency(CurrencyConstant.FRANC);
        System.out.println(euro.toString());
    }
}
