public class Test1 {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Person1 person1=new Person1(bank);
        Person2 person2=new Person2(bank);
        person1.start();
        person2.start();
    }
}
