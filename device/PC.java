package device;

import java.util.HashMap;
import java.util.Map;

public class PC implements Device{
    private String name="11";

    Map map =new HashMap() {
        {
            put(1,"索尼");
        }
    };

    @Override
    public String device(int i) {
        name=(String)map.get(i);
        return name;
    }
}
