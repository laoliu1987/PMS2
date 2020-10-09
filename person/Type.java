package person;

public class Type {
    private String type;
    private  Type(String type){
        this.type=type;
    }
    public static final Type Free=new Type("FREE");
    public static final Type BUSY=new Type("BUSY");

    @Override
    public String toString() {
        return type;
    }
}
