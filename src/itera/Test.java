package itera;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Iterator<Dog> iterator= Dog.set.iterator();
        Dog dog;
        Dog dog0;
       /* while(iterator.hasNext())
        {
            dog=iterator.next();
            System.out.println(dog.name);
        }*/
 /*       for(Object o:Dog.set)
        {
            dog0=(Dog)o;
            System.out.println(dog0.name);
        }*/
        for(Dog o:Dog.set)
        {
            dog0=o;
            System.out.println(dog0.name);
        }
    }
}
