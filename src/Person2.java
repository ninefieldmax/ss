public class Person2 extends Thread{
    public Bank bank;
public Person2(Bank bank){
    this.bank=bank;
}
    public void run(){
        if(bank.money-100>0) {
            bank.takemoney(100);
        }
    }
}
