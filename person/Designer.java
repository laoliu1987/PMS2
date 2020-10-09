package person;

import device.IDevice;
import device.Printer;

public class Designer extends Person implements IShow{

    private double bonus;
    private String position="设计师";
    private boolean situation=false;
    IDevice idv=new Printer();
    private String devicename;
    private int deviceNumber;
    public Designer(){

    }
    public Designer(String name,int age,double salary,double bonus,String devicename,int deviceNumber){
        super(name, age,salary);
        this.bonus=bonus;
        this.devicename=devicename;
        this.deviceNumber=deviceNumber;
    }

    public String getPosition() {
        return position;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
        String a=(s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary())+s.changeLength(getSituation())+s.changeLength(getBonus())+s.changeLength(""));
        return a;
    }

    @Override
    public String showTeam() {
        String b=(s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary())+s.changeLength(getBonus()));
        return b;
    }

    @Override
    public String showDevice() {
        return null;
    }
}
