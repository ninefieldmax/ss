package testzhujie;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class testzhujiefs {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
       try {
//           加载字节码类
           Class cls = Yunsuan.class;
//           获取Method数组      类.获取方法
           Method method[] = cls.getDeclaredMethods();
//           定义一个MEthod对象
           Method method1;
//           定义注解类数组
           Annotation[] annotations;
           int result;
           int errTimes = 0;
//           Object obj=cls.newInstance();
           Object obj = cls.newInstance();
           for (int i = 0; i < method.length; i++) {
               method1 = method[i];
               annotations = method1.getAnnotations();
               if (annotations.length > 0) {
                   System.out.println("注解方法有" + annotations.length);
                 try { result = (int) method1.invoke(obj, 1, 0);}
                 catch (Exception e) {
                     errTimes++;
                     System.out.println(method1.getName()+"出现了异常"+e.getCause().getMessage());
                 }
               }
           }
           System.out.println("一共出现了"+errTimes+"次异常");
       }
       catch (Exception e){
          e.printStackTrace();
       }
    }
}
