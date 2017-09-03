package ParseResult;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class ParseResult {
    private String text;

    public void setText(String text){
        this.text = text;
    }

    public Double BaseVolume(){
        try {
            JSONObject jsonObject = new JSONObject(text);
            JSONArray jsonArray = jsonObject.getJSONArray("result");
            JSONObject jsonObject2 = (JSONObject) jsonArray.get(0);
            return jsonObject2.getDouble("BaseVolume");
        }catch (Exception e){
            return null;
        }


    }

}
