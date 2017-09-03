package Structur;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class OperatingList {
    private static volatile Map OperatingList = new HashMap<String,Double>();

    public static synchronized void addOperatingList(String key,Double value){
        OperatingList.put(key,value);
    }

    public static Double valueOperatingList(String key){

        return (Double) OperatingList.get(key);
    }
}
