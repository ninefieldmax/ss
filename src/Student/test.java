package Student;

public class test {
    public static void main(String[] args) {
        for (Stud a:Stud.hashMap.values()
             ) {
            System.out.println(a.name);
        }
        System.out.println("ek的性别为："+Stud.hashMap.get("ek").sex);
    }
}
