import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class CurrencyConverterView extends JFrame {

    private final JPanel panel = new JPanel();
    private JButton convertButton = new JButton();
    private JComboBox<CurrencyConstant> baseCurrency = new JComboBox<>(CurrencyConstant.getAll());
    private JComboBox<CurrencyConstant> convertCurrency = new JComboBox<>(CurrencyConstant.getAll());
    private JTextField baseNumberField = new JTextField();
    private JTextField convertNumberField = new JTextField();


    public CurrencyConverterView() {
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(2, 3));

        panel.add(baseCurrency);
        panel.add(baseNumberField);

        convertButton.setText("Convert");
        panel.add(convertButton);

        panel.add(convertCurrency);
        panel.add(convertNumberField);




        this.add(panel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Currency Converter");
        this.pack();
        this.setVisible(true);
    }

    public void addActionListener(JButton button, ActionListener action){
        button.addActionListener(action);
    }

    public CurrencyConstant getBaseCurrency(){
        return (CurrencyConstant) baseCurrency.getSelectedItem();
    }

    public CurrencyConstant getCovertCurrency(){
        return (CurrencyConstant) convertCurrency.getSelectedItem();
    }

    public double getBaseAmount(){
        return Double.parseDouble(baseNumberField.getText());
    }

    public JButton getConvertButton(){
        return this.convertButton;
    }

    public void setConvertNumberField(String str){
        convertNumberField.setText(str);
    }
}
