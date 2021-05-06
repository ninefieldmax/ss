import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Stringshow {
    public static void main(String[] args) {

        System.out.println("请输入字符串");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println("字符串的长度为："+s.length());
        char a[]=new char[s.length()];
        s.getChars(0,s.length(),a,0);
        for(int i=0;i<s.length();i++){
        System.out.print(a[i]+" ");
        }
    }
}
