package device;

import java.util.HashMap;
import java.util.Map;

public class Printer implements Device{
    private String name;

    Map map =new HashMap() {
        {
            put(1,"东芝");
        }
    };

    @Override
    public String device(int i) {
        name=(String)map.get(i);
        return name;
    }
}
