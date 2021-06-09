package br.com.ks.labs.search;


import br.com.ks.labs.search.utils.UtilsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            App.help();
            System.exit(0);
        }

        SearchEngine engine = new SearchEngine();
        List argsList = UtilsString.transformIntoList(args);

        ArrayList<String> fileList  = engine.initEngine(argsList);

        System.out.println(String.format("Foram encontradas %s ocorrências pelo termo \"%s\"",fileList.size(), UtilsString.format(argsList)));
        System.out.println(String.format("Os arquivos que possuem %ssão: ", UtilsString.format(argsList)));
        Collections.sort(fileList);
        fileList.forEach(x->  System.out.println( x ));

    }


    public static void help() {
        System.out.println("Favor utilizar:");
        System.out.println("java -jar searchApp [args...]");
    }


}
