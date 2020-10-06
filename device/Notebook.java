package device;

import java.util.HashMap;
import java.util.Map;

public class Notebook implements Device {

    private String name="11";

    Map map =new HashMap() {
        {
            put(1,"联想");
        }
    };

    @Override
    public String device(int i) {
        name=(String)map.get(i);
        return name;
    }
}
