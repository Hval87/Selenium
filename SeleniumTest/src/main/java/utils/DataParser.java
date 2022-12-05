package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class DataParser {

    private static String SOURCE="src\\main\\resources\\package.json";
    public static  String getValueByKey(String key) {
        String value=null;

        try ( FileReader reader = new FileReader("")) {
            JSONParser parser;parser = new JSONParser();
            JSONObject obj= (JSONObject) parser.parse(reader);
            value=(String) obj.get(key);

        }
        catch (Exception ex){
            System.out.println(ex);
        }
        return value;
    }
}
