package tool;

public class StringChange {
    //字符转换

    public static String changeLength(String str) {
        int length=0;
        for(int i=0;i< str.length();i++){
            int ascii=Character.codePointAt(str,i);
            if(ascii>=0&&ascii<=255)
                length++;
            else
                length+=2;
        }

        int size = length;
        String temp = str;
        for (int i = 0; i < 10 - size; i++) {
                temp += " ";
        }
        return temp;

    }
    public static String changeLength(int INT) {
        String str=Integer.toString(INT);
        int size = str.length();
        String temp = str;
        for (int i = 0; i < 10 - size; i++) {
            temp += " ";
        }
        return temp;
    }
    public static String changeLength(double DOUBLE) {
        String str=Double.toString(DOUBLE);
        int size = str.length();
        String temp = str;
        for (int i = 0; i < 10 - size; i++) {
            temp += " ";
        }
        return temp;
    }
}

