import ApiBittrex.ApiBittrex;
import Flows.Flows;
import InputFile.ReadCurrenciesFile;
import Inquire.Inquire;
import ParseResult.ParseResult;
import Structur.ListCurrencies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... main) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();

        ReadCurrenciesFile.setPathc(numa);
        ListCurrencies.addCurrenciesList(ReadCurrenciesFile.readCurrenciesFile());
        List<Flows> list = new ArrayList<Flows>();

        for (int i = 0; i<20;i++){
            list.add(new Flows());
            list.get(i).start();
            Thread.sleep(1000);
        }

    }
}
