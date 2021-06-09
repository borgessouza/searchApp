package br.com.ks.labs.search;

import br.com.ks.labs.search.config.Bucket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SearchEngine {

    private Bucket bucket = new Bucket();
    private ArrayList<String> fileList = new ArrayList<>();

    public Boolean findInLine(List<String> list, String line) {
        List<String> lineList = Arrays.asList(line.split(" "));
        if (lineList.containsAll(list)) {
            return true;
        }
        return false;
    }

    public ArrayList<String> initEngine(List args) throws IOException {

        Map<String, String> map = bucket.listFiles();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (findInLine(args, entry.getValue())) {
                fileList.add(entry.getKey());
            }
        }
        return fileList;

    }
}

