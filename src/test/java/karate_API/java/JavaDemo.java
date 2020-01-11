package karate_API.java;

import java.util.HashMap;
import java.util.Map;

public class JavaDemo {

    public Map<String,Object> doWork(String fromJS){

        Map<String, Object> map = new HashMap<>();
        map.put("someKey","value"+ fromJS);
        return map;

    }

    public  static String doSometin(String fromJs){
        return "ho"+ fromJs;
    }
}
