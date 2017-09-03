package InputFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny on 03.09.2017.
 */
public class ReadCurrenciesFile {
    private static String pathc;

    public static void setPathc(String sPatch){
        pathc = sPatch;
    }

    public static List<String> readCurrenciesFile() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(pathc));
        String line;
        List<String> currencies = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            currencies.add(line);
        }
        return currencies;
    }
}
