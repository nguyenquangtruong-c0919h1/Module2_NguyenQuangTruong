package services;

import java.util.HashMap;
import java.util.Map;

public class directoryServices {
    private static Map<String, String> dic = new HashMap<>();

    static {
        inputdirectory();
    }

    private static void inputdirectory() {
        dic.put("Hello", "Xin Chao");
        dic.put("Good Bye", "Tam Biet");
        dic.put("Hi", "Xin Chao");
    }

    public static Map<String, String> getValueAll() {
        return dic;
    }
}
