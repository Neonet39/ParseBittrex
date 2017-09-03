package Flows;

import ApiBittrex.ApiBittrex;
import Check.FolowsCheck;
import Inquire.Inquire;
import ParseResult.ParseResult;
import Structur.ListCurrencies;
import Structur.OperatingList;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class Flows extends Thread {


    @Override
    public void run(){
        while (true) {
            String param = ListCurrencies.getCurrencies();

            if (param != null) {
                Inquire inquire = new Inquire();
                inquire.setInquir(String.format(new String(ApiBittrex.getmarketsummary), param));
                inquire.respons();

                String result = inquire.getResult().substring(4, inquire.getResult().length());

                ParseResult parseResult = new ParseResult();
                parseResult.setText(result);
                Double valuePars = parseResult.BaseVolume();


                if (valuePars != null&&valuePars<301) {
                    OperatingList.addOperatingList(param,valuePars);
                    FolowsCheck folowsCheck = new FolowsCheck(param, parseResult.BaseVolume());
                    folowsCheck.check();


                }else {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
