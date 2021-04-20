package Student;

import java.util.HashMap;

public class Stud {
    String fogname;
    String name;
    String sex;
 static   HashMap<String,Stud> hashMap=new HashMap();
 static{
     Stud stud1=new Stud();
     stud1.fogname="ek";
     stud1.name="撒嗄";
     stud1.sex="男";
     Stud stud2=new Stud();
     stud2.fogname="sa";
     stud2.name="阿萨";
     stud2.sex="男";
     Stud stud3=new Stud();
     stud3.fogname="sas";
     stud3.name="阿斯顿";
     stud3.sex="女";
     hashMap.put("ek",stud1);
     hashMap.put("sa",stud2);
     hashMap.put("sas",stud3);
 }
}
