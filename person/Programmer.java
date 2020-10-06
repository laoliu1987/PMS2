package person;
public class Programmer extends Person implements IShow{

    private String position="程序员";
    private boolean situation=false;
    private String devicename;
    private int deviceNumber;
    public String getPosition() {
        return position;
    }
    public Programmer(String name,int age,double salary,String devicename,int deviceNumber){
        super(name, age,salary);
        this.devicename=devicename;
        this.deviceNumber=deviceNumber;
    }
    public String getSituation(){
        if(situation==false)
            return "FREE";
        else
            return "BUSY";
    }

    public boolean isSituation() {
        return situation;
    }

    public void setSituation(boolean situation) {
        this.situation = situation;
    }

    public String getDevicename() {
        return devicename;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }
    @Override
    public String show() {
        String a=(s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary())+s.changeLength(getSituation())+s.changeLength("")+s.changeLength(""));
        return a;
    }

    @Override
    public String showTeam() {
        String b=(s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary()));
        return b;
    }
}
