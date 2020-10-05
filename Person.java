public class Person implements IShow{
    private String name;
    private int age;
    private double salary;
    public static StringChange s;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person(){

    }
    public Person(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String show() {
        String a=(s.changeLength(getName())+s.changeLength(getAge())+"         "+s.changeLength(getSalary()));
        return a;
    }

    @Override
    public String showTeam() {
        return null;
    }
}
