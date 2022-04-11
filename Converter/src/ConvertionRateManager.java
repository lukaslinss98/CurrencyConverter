import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ConvertionRateManager {

    //API endpoint used to get latest conversion rates
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/a74e1cc9fce0e6ee4ce4724d/latest/";

    public static double getConversionRate(CurrencyConstant currencyConstant, CurrencyConstant newCurrency) {

        String urlStr = API_URL + currencyConstant; // https://v6.exchangerate-api.com/v6/a74e1cc9fce0e6ee4ce4724d/latest/YOUR_CURRENCY_CODE
        double result = 0;
        try{
            // making the request
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            System.out.println("API Response: " + request.getResponseMessage());

            // to JSON
            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            String conversionRate = jsonObject.get("conversion_rates")
                                              .getAsJsonObject()
                                              .get(newCurrency.toString())
                                              .getAsString();

            result = Double.parseDouble(conversionRate);

        } catch( Exception e){
            e.printStackTrace();
        }
        return result;

    }

}
