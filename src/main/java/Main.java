import InputFile.ReadCurrenciesFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... main) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();

        ReadCurrenciesFile.setPathc(numa);
        System.out.println(ReadCurrenciesFile.readCurrenciesFile().get(0));
    }
}
