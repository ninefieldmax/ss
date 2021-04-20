package login;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
public class Load {
    @inf
    Class cls=Load.class;
    public Boolean login(String user,String password) throws NoSuchMethodException {
        inf in;
       Method method =cls.getDeclaredMethod("login",String.class,String.class);
       in= method.getAnnotation(inf.class);
        System.out.println("用户信息:"+in.name+in.password);
        Class cl=inf.class;
        Field[] field=cl.getDeclaredFields();
        if(user.equals(in.name)&&password.equals(in.password)){
            System.out.println("登录成功！");}
            else{
            System.out.println("用户信息错误！");
            }
        return true;
    }
    public static void main(String[] args) throws NoSuchMethodException {
            Load load=new Load();
            Scanner scanner=new Scanner(System.in);
        System.out.println("用户名");
            String abc=scanner.next();
        System.out.println("password");
            String ab=scanner.next();
            load.login(abc,ab);
    }
}
