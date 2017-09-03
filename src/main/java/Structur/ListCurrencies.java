package Structur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class ListCurrencies {

    private static int indexCurrenciesList = -1;
    private static List currenciesList = new ArrayList<String>();

    public static void addCurrenciesList(List<String> List){
        currenciesList = List;
    }


    public static String getCurrencies(){
        if (currenciesList.size()==0)
            return null;

        indexCurrenciesList++;

        if(indexCurrenciesList<currenciesList.size()){
            indexCurrenciesList = 0;
        }

        return (String) currenciesList.get(indexCurrenciesList);
    }

}
