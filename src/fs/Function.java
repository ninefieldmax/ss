package fs;

import javax.lang.model.element.Name;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
public class Function {
    public static void main(String[] args) throws Exception {
        try {
            People p1 = new People();
            People p2 = new People();
            People p3 = new People();
            People p4 = new People();
            People inf[] = {p1, p2, p3, p4};
            p1.setName("ss");
            p1.tel = "1111111111";
            p1.sex = "man";
            p2.name = "as";
            p2.tel = "1221211122";
            p2.sex = "man";
            p3.name = "aa";
            p3.tel = "2121332121";
            p3.sex = "woman";
            p4.name = "ds";
            p4.tel = "1232345524";
            p4.sex = "man";
            ClassLoader classLoader = Function.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("fs/pz.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
//            获取类
            String classNameValue = properties.getProperty("className");
            Class cls = Class.forName(classNameValue);
            Object obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            String a1 = "get" + fields[0].getName().substring(0, 1).toUpperCase() + fields[0].getName().substring(1);
            System.out.println(a1);
            String a2 = "get" + fields[1].getName().substring(0, 1).toUpperCase() + fields[1].getName().substring(1);
            String a3 = "get" + fields[2].getName().substring(0, 1).toUpperCase() + fields[2].getName().substring(1);
            Method method =cls.getDeclaredMethod(a1);
            Method method2 =cls.getDeclaredMethod(a2);
            Method method3 =cls.getDeclaredMethod(a3);
            for(int i=0;i<inf.length;i++)
            {
                obj=inf[i];
               String s1=(String)method.invoke(obj);
               String s2=(String)method2.invoke(obj);
               String s3=(String)method3.invoke(obj);
               System.out.println(s1+"  "+s2+"  "+"  "+s3);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
