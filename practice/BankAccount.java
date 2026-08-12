package practice;

public class BankAccount {
    long accNum;
    String accHolder;
    double bal;
    public void deposit(double amount){
        bal+=amount;
        System.out.println(amount);
    }
    public void withdraw(double amount){
        if(amount<=bal){
            bal-=amount;
            System.out.println(amount);
        }
        else{
            System.out.println("insuff bal");
        }
    }
    public void checkBal(){
        System.out.println(bal);
    }
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.accNum=2564789;
        b.accHolder="Harshita";
        b.bal=5000;
        System.out.println(b.accHolder);
        System.out.println(b.accNum);
        b.checkBal();
        b.deposit(1500);
        b.checkBal();
        b.withdraw(9000);
        b.checkBal();
        b.withdraw(1000);
        b.checkBal();
    }
}
