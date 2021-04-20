public class Bank {
    public  int money=3000;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public synchronized void  takemoney( int inmoney){
        System.out.println("当前账户余额为" + this.money + "取款" + 100 + "账户余额为" + (this.money - 100));
        this.setMoney(getMoney()-inmoney);
    }
}
