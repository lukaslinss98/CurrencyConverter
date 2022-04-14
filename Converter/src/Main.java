import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    CurrencyConverterView view = new CurrencyConverterView();
    CurrencyModel model = new CurrencyModel();
    CurrencyConverterController controller =  new CurrencyConverterController(model, view);
    }
}
