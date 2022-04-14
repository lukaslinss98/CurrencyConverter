import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterController {

    private CurrencyModel currencyModel;
    private CurrencyConverterView currencyConverterView;

    public CurrencyConverterController(CurrencyModel currencyModel, CurrencyConverterView currencyConverterView){
        this.currencyModel = currencyModel;
        this.currencyConverterView = currencyConverterView;

        currencyConverterView.addActionListener(currencyConverterView.getConvertButton(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String baseCurrency = currencyConverterView.getBaseCurrency();
                currencyModel.setCurrency(CurrencyConstant.valueOfCurrencyName(baseCurrency));
                currencyModel.setAmount(currencyConverterView.getBaseAmount());

                String converterCurrency = currencyConverterView.getCovertCurrency();
                CurrencyModel convertedCurrencyModel =
                        currencyModel.convertCurrency(CurrencyConstant.valueOfCurrencyName(converterCurrency));
                
                currencyConverterView.setConvertNumberField("" + convertedCurrencyModel.getAmount());
            }
        });
    }
}
