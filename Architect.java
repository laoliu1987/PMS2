public class Architect extends Person implements IShow{

    private double bonus;
    private int shares;
    private boolean situation=false;
    private String position="架构师";
    public String getPosition() {
        return position;
    }



    public Architect(String name,int age,double salary,double bonus,int shares){
        super(name, age,salary);
        this.bonus=bonus;
        this.shares=shares;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
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

    public String show() {
        String a= s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary())+s.changeLength(getSituation())+s.changeLength(getBonus())+s.changeLength(getShares());
        return a;
    }

    @Override
    public String showTeam() {
        String b= s.changeLength(getName())+s.changeLength(getAge())+s.changeLength(getPosition())+s.changeLength(getSalary())+s.changeLength(getBonus())+s.changeLength(getShares());
        return b;
    }
}
