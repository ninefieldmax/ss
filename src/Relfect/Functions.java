package Relfect;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import static java.lang.Class.forName;
//                                                                                            **********反   射   框   架
public class Functions {
    public static void main(String[] args)  throws Exception{
        try {
        ClassLoader classLoader = Functions.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("Relfect/A.properties");
        Properties properties = new Properties();
            properties.load(inputStream);
            String classNameValue = properties.getProperty("classname");
            String methodNameValue = properties.getProperty("fang");
            String methodNameValue1=properties.getProperty("become");
            Class cls = Class.forName(classNameValue);
//            Class cls1=Student.class;
            Object obj = cls.newInstance();
            Method method = cls.getMethod(methodNameValue);
            String nam=(String)method.invoke(obj);
            System.out.println("调用的方法为"+methodNameValue+"学生的名字为"+nam);
            Method method1=cls.getMethod(methodNameValue1,String.class);
            method1.invoke(obj,new String("安安"));
            nam=(String)method.invoke(obj);
            System.out.println("修改过的名字为"+nam);
        }
        catch (ClassNotFoundException | NoSuchMethodException |IllegalArgumentException| IOException e ){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}