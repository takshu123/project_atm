import java.util.Scanner;


class Bankaccount{
    public int balance;
    public Bankaccount(int initialamount){
        this.balance=initialamount;


    }
    public int balance(int amount){
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println(balance);
            System.out.println("depoite of "+amount+"RS was succesful");
        }
        else{
            System.out.println("invalid entry");

        }
    }
    public void withdraw(int amount){
        if(amount>0&&amount<=balance){
            System.out.println("withdraw succesfull of"+amount+"RS");
            amount-=balance;
        }
        else {
            System.out.println("invalid entry");
        }

    }


}

public class atm_interface {
    public static void main(String[] args) {

        Bankaccount useraccount=new Bankaccount(3000);
        atm atm=new atm(useraccount);
        atm.run();

    }




}

class atm{

    private Bankaccount account;
    public atm(Bankaccount account){
        this.account=account;

    }
    public void display(){
        System.out.println("______WELCOME______");
        System.out.println("SELECT OPTIONS");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Checkbalance");
        System.out.println("4.leave");

    }
    public  void run(){




        Scanner sc=new Scanner(System.in);
        int option;
        do{
            display();
            System.out.println("Pick an option");
            option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Current balance"+account.balance);
                    break;
                case 2:
                    System.out.println("Enetr amount to deposit");
                    int depositeamount=sc.nextInt();
                    account.deposit(depositeamount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                    int withdrawamount=sc.nextInt();
                    account.withdraw(withdrawamount);
                    break;
                case 4:
                    System.out.println("thanks for working");
                    break;
                default:
                    System.out.println("invalid entry");


            }

        } while(option!=4);
    }
}
