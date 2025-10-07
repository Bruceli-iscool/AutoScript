package dev.desktop.AutoScript;

import java.util.*;

public class Variables {
    public static HashMap<String, String> wordVars = new HashMap<>();
    public static HashMap<String, Integer> numVars = new HashMap<>();

    public static void createVariable(String variableName, String variableValue) {
        wordVars.put(variableName, variableValue);
    }

    public static void createVariable(String variableName, int value) {
        numVars.put(variableName, value);
    }

    public static String getWord(String variableName) {
        if (wordVars.containsKey(variableName)) {
            return wordVars.get(variableName);
        } else {
            System.out.println(variableName + " does not exist!");
            return "";
        }
    }

    public static int getNum(String variableName) {
        if (numVars.containsKey(variableName)) {
            return numVars.get(variableName);
        } else {
            System.out.println(variableName + " does not exist!");
            return 0;
        }
    }
}
