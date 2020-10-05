public class Programmer extends Person implements IShow{

    private String position="程序员";
    private boolean situation=false;
    public String getPosition() {
        return position;
    }
    public Programmer(String name,int age,double salary){
        super(name, age,salary);
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
    @Override
    public String show() {
        String a=(s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary())+s.changeLength(getSituation()));
        return a;
    }

    @Override
    public String showTeam() {
        String b=(s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary()));
        return b;
    }
}
