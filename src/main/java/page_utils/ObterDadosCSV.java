package page_utils;

import steps.StepDefinitions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ObterDadosCSV {

    //    private static Object Csv;

    public static String currentDir = System.getProperty("user.dir");
    public static String[] valueCampoCsv;
    public static String[] nameCampoCsv;

    public static HashMap<String, Object> obterDadosCSV() throws IOException {
//        Csv = "classpath:csv";

        String linha;
        Boolean achou = false;
        HashMap<String, Object> hash_map = new HashMap<String, Object>();
        String file = currentDir + "/src/main/resources/data/" + StepDefinitions.massaCsv + ".csv"; //mapeando local do arquivo
//        String file = currentDir + "/src/main/resources/data/" + "efetuarlogin.csv";
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        if ((linha = br.readLine()) != null) {
            if (linha.contains("page")) {
                nameCampoCsv = linha.split(";");
            }
        }
        while ((linha = br.readLine()) != null && !achou) {
            valueCampoCsv = linha.split(";");
//            if (valueCampoCsv[1].equals(cenario)) {
            int nOfColumns = valueCampoCsv.length;
            achou = true;
            for (int k = 0; k < nOfColumns; k++) {
                hash_map.put(nameCampoCsv[k], valueCampoCsv[k]);
                System.out.println(k + " - " + nameCampoCsv[k] + " - " + valueCampoCsv[k]);
            }
//            }
        }
        br.close();
        return hash_map;
    }
}