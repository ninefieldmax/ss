public class Person1 extends Thread{
    public Person1(Bank bank){
        this.bank=bank;
    }
    public Bank bank;

    public void run(){
        while(bank.money-200>0) {
          bank.takemoney(200);
        }
    }
}
