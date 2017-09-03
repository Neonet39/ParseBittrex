package Check;

import Structur.OperatingList;
import Structur.StatisticList;

import java.util.Map;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class FolowsCheck{

    private String name;
    private Double value;

    public FolowsCheck(String name,Double value){
        this.name = name;
        this.value = value;
    }


    public void check(){
        Double valueStatisticList = StatisticList.valueStatisticList(name);
        if(valueStatisticList!=null){

            Double valueOperatingList = OperatingList.valueOperatingList(name);

                Double difference = valueOperatingList - valueStatisticList;
                 if(difference>1&&difference<11){
                     System.out.println("Event found: "+name+" "+value);
                 }

                 StatisticList.addStatisticList(name,value);

        }else {
            StatisticList.addStatisticList(name,value);
        }

    }

}
