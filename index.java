import java.util.Scanner;

class ATM {

    int PIN = 7895;
    String name;
    int accountNumber;
    float bal = 100000f;
    int transaction = 0;
    String transactionHistory;

    public void checkPIN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name-:");
        this.name = sc.nextLine();
        System.out.println("enter the pin-:");
        // Scanner sc=new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if (enteredPIN == PIN) {
            //
        } else {
            System.out.println("Please!enter the correct PIN\n");
        }
        menu();
    }

    public void menu(){
        System.out.println("enter your choice-:");
        System.out.println("1. press to withdraw money-:");
        System.out.println("2. press to deposite money-:");
        System.out.println("3. cor checking the balance-:");
        System.out.println("4. press for trans..history-:");
        System.out.println("5. EXIT");

        Scanner sc=new Scanner(System.in);
        int otp=sc.nextInt();

        if(otp==1){
            withdraw();
        }
        else if(otp==2){
            deposit();
        }
        else if(otp==3){
            check();
        }
        else if(otp==4){
            tHistory();
        }
        else if(otp==5){
            return;
        }
        else{
            System.out.println("Please! enter a valid choice");
        }
    }

    public void withdraw() {
        System.out.println("enter the amount to be withdrawn-:");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        try {
            if (bal > amt) {
                transaction++;
                bal = bal - amt;
                System.out.println("amount withdrawn succesfully!");
                String str = amt + " Rs widthdrawn\n";
                transactionHistory = transactionHistory.concat(str);

            } else {
                System.out.println("Insufficient balance");
            }
        } catch (Exception e) {

        }
        

    }

    public void deposit(){
        System.out.println("enter the amount to deposite-:");
        Scanner sc=new Scanner(System.in);
        float amt=sc.nextFloat();
        try{
            if(amt<=100000f){
                transaction++;
                bal=bal+amt;
                System.out.println("amount deposited succesfully");
                String str=amt+"Rs deposited\n";
                transactionHistory=transactionHistory.concat(str);
            }
            else{
                System.out.println("sorry limit is 100000");
            }
        }
        catch(Exception e){

        }
        
    }

    public void check(){
        System.out.println("\n"+bal+"Rs");
    }
    public  void tHistory(){
        if(transaction==0){
        System.out.println("\n empty");
        }
        else{
            System.out.println("\n"+transactionHistory);
        }
        
    }
}
 
public class index{
    public static void main(String[] args) {
        System.out.println("\n------welcome to Utkarsh's bank--------");
        ATM obj= new ATM();
            obj.checkPIN();
            
    }
   

   
}
