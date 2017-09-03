import ApiBittrex.ApiBittrex;
import InputFile.ReadCurrenciesFile;
import Inquire.Inquire;
import ParseResult.ParseResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... main) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();

        ReadCurrenciesFile.setPathc(numa);
        Inquire inquire = new Inquire();
        inquire.setInquir(String.format(new String(ApiBittrex.getmarketsummary),ReadCurrenciesFile.readCurrenciesFile().get(0)));

        inquire.respons();

        String result = inquire.getResult().substring(4,inquire.getResult().length());
        ParseResult parseResult = new ParseResult();
        parseResult.setText(result);

        System.out.println(parseResult.BaseVolume());
    }
}
