package testzhujie;

import java.util.Scanner;

public class Studentsscore {
      String name;
    double yw;
    double math;
    double english;
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入姓名");
        Studentsscore s1=new Studentsscore();
        Studentsscore s2=new Studentsscore();
        Studentsscore s3=new Studentsscore();
        s1.name=scanner.next();
        s2.name=scanner.next();
        s3.name=scanner.next();
        System.out.println("请输入分数,分数分别为 语文 数学 英语");
        s1.yw  = scanner.nextDouble();
        s1.math = scanner.nextDouble();
        s1.english = scanner.nextDouble();
        s2.yw = scanner.nextDouble();
        s2.math= scanner.nextDouble();
        s2.english  = scanner.nextDouble();
        s3.yw = scanner.nextDouble();
        s3.math = scanner.nextDouble();
        s3.english = scanner.nextDouble();
            System.out.println(s1.name + "三门平均分为" + (s1.yw + s1.math + s1.english) / 3);
            System.out.println(s2.name + "三门平均分为" + (s2.yw + s2.math + s2.english) / 3);
            System.out.println(s3.name+ "三门平均分为" + (s3.yw + s3.math + s3.english) / 3);
            System.out.println("yw的平均分为" + (s1.yw + s2.yw + s3.yw) / 3);
            System.out.println("math的平均分为" + (s1.math + s2.math + s3.math) / 3);
            System.out.println("english的平均分为" + (s1.english + s2.english + s3.english) / 3);







    }

}
