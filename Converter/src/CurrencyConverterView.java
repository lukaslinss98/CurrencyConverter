import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class CurrencyConverterView extends JFrame {

    private final JPanel panel = new JPanel();
    private JButton convertButton = new JButton();
    private JComboBox<String> baseCurrency = new JComboBox<>(CurrencyConstant.getCurrencyNames());
    private JComboBox<String> convertCurrency = new JComboBox<>(CurrencyConstant.getCurrencyNames());
    private JTextField baseNumberField = new JTextField();
    private JTextField convertNumberField = new JTextField();


    public CurrencyConverterView() {
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(3, 2));

        panel.add(baseCurrency);
        panel.add(baseNumberField);

        panel.add(convertCurrency);
        panel.add(convertNumberField);

        convertButton.setText("Convert");
        panel.add(convertButton);


        this.add(panel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Currency Converter");
        this.pack();
        this.setVisible(true);
    }

    public void addActionListener(JButton button, ActionListener action){
        button.addActionListener(action);
    }

    public String getBaseCurrency(){
        return (String) baseCurrency.getSelectedItem();
    }

    public String getCovertCurrency(){
        return (String) convertCurrency.getSelectedItem();
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
