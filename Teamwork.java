import java.util.ArrayList;
import java.util.List;

public class Teamwork {
    private static TSUtility ts;
    private static StringChange s;
    private static int ArchitectNum;
    private static int DesignerNum;
    private static int ProgrammerNum;
    private static List TeamList=new ArrayList();
    static List list=new ArrayList();
    //显示当前所有人员信息
    public static void showID(List list){
        System.out.println("ID        姓名      年龄       职位      工资      状态       奖金      股票");
        for(int i=0;i< list.size();i++){
            Person obj= (Person) list.get(i);
            System.out.print(s.changeLength((list.indexOf(obj)+1)));
            System.out.println(obj.show());
        }
        show();
    }

    //显示团队信息
    public static void showTeamID(){
        System.out.println("TID/ID    姓名      年龄       职位      工资      奖金      股票");
        for(int i=0;i< TeamList.size();i++){
            Person objT= (Person)TeamList.get(i);
            String tidid=" "+(TeamList.indexOf(objT)+1)+"/"+(list.indexOf(objT)+1)+" ";
            System.out.print(s.changeLength((tidid)));
            System.out.println(objT.showTeam());
        }
        show();
    }

    //团队列表
    public static void TeamList(){

        if (TeamList.isEmpty())
        {
            System.out.println("----------------------团队成员列表----------------------");
            System.out.println("开发团队没有任何成员！");
            show();
        }
        else showTeamID();
    }

    //添加团队成员
    public static void TeamAdd(){
        System.out.println("请输入添加成员的ID：");
        int ID= ts.readInt();
        try{
            if(TeamList.contains(list.get(ID-1))) {
                System.out.println("已经存在，添加失败");
                show();
            }
            else
            {
                String NAME = list.get(ID-1).getClass().getName();
                if(NAME.equals("Person"))
                {
                    System.out.println("该成员无效");
                }
                if(NAME.equals("Architect")){
                    if(ArchitectNum>=1){
                        System.out.println("不能再添加更多的架构师了");
                    }else{
                        Architect arc=(Architect) list.get(ID-1);
                        arc.setSituation(true);
                        TeamList.add(arc);
                        System.out.println("添加成功");
                        System.out.println(NAME);
                        ArchitectNum++;
                    }
                }
                if(NAME.equals("Designer")){
                    if(DesignerNum>=2){
                        System.out.println("不能再添加更多的设计师了");
                    }else{
                        Designer des=(Designer)list.get(ID-1);
                        des.setSituation(true);
                        TeamList.add(des);
                        System.out.println("添加成功");
                        System.out.println(NAME);
                        DesignerNum++;
                    }
                }
                if (NAME.equals("Programmer")){
                    if(ProgrammerNum>=2){
                        System.out.println("不能再添加更多的程序员了");
                    }else{
                        Programmer pro=(Programmer)list.get(ID-1);
                        pro.setSituation(true);
                        TeamList.add(pro);
                        System.out.println("添加成功");
                        System.out.println(NAME);
                        ProgrammerNum++;
                    }
                }
                show();
            }}catch (Exception e){
            System.out.println("成员不存在");
            show();
        }
    }

    //删除团队成员
    public static void TeamDelete(){
        System.out.println("请输入移除成员的ID：");
        int ID=ts.readInt();
        try{
            Object obj=TeamList.get(ID-1);
            int Num=list.indexOf(obj);
            Object obj1=list.get(Num);
            String str=obj1.getClass().getName();
            if(str.equals("Architect"))
            {
                Architect arc=(Architect)obj1;
                arc.setSituation(false);
            }
            if(str.equals("Designer"))
            {
                Designer des=(Designer)obj1;
                des.setSituation(false);
            }
            if(str.equals("Programmer")){
                Programmer pro=(Programmer)obj1;
                pro.setSituation(false);
            }
            TeamList.remove(ID-1);
            System.out.println("移除成员成功");
            show();
        }catch (Exception e){
            System.out.println("移除成员失败");
            show();
        }
    }

    //显示菜单页面
    public static void show() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-显示所有人状态 5-退出 请选择（1-4)");
        char a=ts.readMenuSelection();
        if(a == '1') {
            TeamList();
        }
        else if(a == '2')
        {TeamAdd();}
        else if(a=='3')
        {TeamDelete();}
        else if(a=='4')
        {
            showID(list);
        }
        else if(a=='5')
        {
            System.out.println("程序已退出");
            System.exit(0);
        }
    }
}
