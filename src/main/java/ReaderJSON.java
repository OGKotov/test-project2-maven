
// Class receives data from JSON file



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class ReaderJSON {

    private JSONObject jsonObject;

    //Method read JSONobject from JSON file
    void readerFromJSONFiles(String pathTaskFile) {
        JSONParser parser = new JSONParser();

        try {

            jsonObject = (JSONObject) parser.parse(
                    new FileReader(pathTaskFile));

        }catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
    }

    //Method returns JSONobject
    JSONObject getJsonObject() {
        return jsonObject;
    }
}
