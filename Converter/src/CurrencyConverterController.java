import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterController {

    private CurrencyModel model;
    private CurrencyConverterView view;

    public CurrencyConverterController(CurrencyModel model, CurrencyConverterView view){
        this.model = model;
        this.view = view;

        view.addActionListener(view.getConvertButton(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setCurrency(view.getBaseCurrency());
                model.setAmount(view.getBaseAmount());

                CurrencyModel convertedCurrency = model.convertCurrency(view.getCovertCurrency());
                view.setConvertNumberField("" + convertedCurrency.getAmount());
            }
        });
    }
}
