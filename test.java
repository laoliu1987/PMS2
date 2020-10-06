import person.Architect;
import person.Designer;
import person.Person;
import person.Programmer;
import team.Teamwork;

public class test {
    //        初始化
    public static Teamwork tm;
    public static void main(String[] args) {
        tm.list.add(new Architect("张三", 22, 9000, 1000.0, 2000,"device.Notebook",1));
        tm.list.add(new Programmer("李四", 21, 12000,"device.Printer",1));
        tm.list.add(new Designer("王五", 24, 10000, 800.0,"device.PC",1));
        tm.list.add(new Person("刘六", 27, 4000));
        tm.list.add(new Architect("张三三", 22, 9000, 1000.0, 2000,"device.PC",1));
        tm.list.add(new Programmer("李四四", 21, 12000,"device.Printer",1));
        tm.list.add(new Designer("王五四", 24, 10000, 800.0,"device.Notebook",1));
        tm.list.add(new Programmer("刘六五", 21, 12000,"device.PC",1));
        tm.list.add(new Programmer("张三六", 21, 12000,"device.Notebook",1));
        tm.list.add(new Programmer("李四五", 21, 12000,"device.PC",1));
        tm.list.add(new Designer("王五六", 24, 10000, 800.0,"",1));
        tm.list.add(new Person("刘六三", 27, 4000));

        tm.showID(tm.list);

    }
}

    //显示当前所有人员