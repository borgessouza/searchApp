package br.com.ks.labs.search.utils;

import java.util.Arrays;
import java.util.List;

public class UtilsString {
    public static List transformIntoList(String[] args) {
        return Arrays.asList(args);
    }

    public static String format(List<String> list) {
        StringBuilder sb = new StringBuilder();
        list.forEach(x -> sb.append(String.format("%s ", x)));
        return sb.toString();
    }
}
