package Structur;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class StatisticList {
    private static volatile  Map StatisticList = new HashMap<String,Double>();

    public static synchronized void addStatisticList(String key,Double value){
        StatisticList.put(key,value);
    }

    public static Double valueStatisticList(String key){

        return (Double) StatisticList.get(key);
    }

    public static int Size(){
        return StatisticList.size();
    }

}
