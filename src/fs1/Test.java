package fs1;
import fs1.People;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("fs1/s.properties");
            Properties properties = new Properties();
            People a[] = new People[4];
            People.ff(a);
            properties.load(inputStream);
            String Value = properties.getProperty("classname");
            Class cls = Class.forName(Value);
            Object obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            String aa = "get" + fields[0].getName().substring(0, 1).toUpperCase() + fields[0].getName().substring(1);
            String aaq = "get" + fields[1].getName().substring(0, 1).toUpperCase() + fields[1].getName().substring(1);
            String aas = "get" + fields[2].getName().substring(0, 1).toUpperCase() + fields[2].getName().substring(1);
            Method method = cls.getMethod(aa);
            Method method1 = cls.getMethod(aaq);
            Method method2 = cls.getMethod(aas);
            for (int i = 0; i < a.length; i++) {
                obj=a[i];
                Object s = method.invoke(obj);
                Object as = method1.invoke(obj);
                Object c = method2.invoke(obj);
                System.out.println(s + "   " + as + "  " + c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

