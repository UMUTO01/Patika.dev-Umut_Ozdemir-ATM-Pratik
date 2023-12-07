import jdk.jshell.Snippet;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Helper();



        System.out.println("Hello world!");
    }

    public static void Helper(){
        System.out.println("Welcome to Arch Bank, please enter a number for the type of action");
        System.out.println("1- Enter Money \n 2- Withraw Money \n 3- See account balance \n 4-Transfer Money to another id\n 5- To quit");

        double accountBalance = 0;

        boolean apple = true;



        String dant;

        while (apple = true){

            int a = scan.nextInt();


            switch (a) {
                case 1:
                    System.out.println("insert money:");
                    accountBalance += scan.nextDouble();
                  //  System.out.println("Do you want another transaction:  Y N");
                  //  dant = scan.nextLine();
                    //        System.out.println("Do you want another transaction: 1 Y 2 N")
                    //            scan.nextLine();
                    //        dant = scan.nextLine();
                    //        if(dant == "Y"){
                    //            apple = true;
                    //        }
                    //        else {
                    //            System.out.println("Do not forget to take your credit card");
                    //
                    break;
                case 2:
                    System.out.println("Withraw amount: ");
                    double amount = scan.nextDouble();
                    if(amount>accountBalance){
                        System.out.println("Cannot do the action");
                    }
                    else {
                        accountBalance-=amount;
                        System.out.println("Withraw compleated");
                    }
                    //        System.out.println("Do you want another transaction: 1 Y 2 N")
                    //            scan.nextLine();
                    //        dant = scan.nextLine();
                    //        if(dant == "Y"){
                    //            apple = true;
                    //        }
                    //        else {
                    //            System.out.println("Do not forget to take your credit card");
                    //
                    break;
                case 3:
                    System.out.println("Account balance is : "+ accountBalance);

            //        System.out.println("Do you want another transaction: 1 Y 2 N")
            //            scan.nextLine();
            //        dant = scan.nextLine();
            //        if(dant == "Y"){
            //            apple = true;
            //        }
            //        else {
            //            System.out.println("Do not forget to take your credit card");
            //        }
                    break;

                case 4:
                    System.out.println("Transfer amount: ");
                    double amount2 = scan.nextDouble();
                    if(amount2> accountBalance){
                        System.out.println("Cannot do the action");
                    }
                    else {
                        accountBalance-=amount2;
                        System.out.println("Aciton compleated");
                    }
                    //        System.out.println("Do you want another transaction: 1 Y 2 N")
                    //            scan.nextLine();
                    //        dant = scan.nextLine();
                    //        if(dant == "Y"){
                    //            apple = true;
                    //        }
                    //        else {
                    //            System.out.println("Do not forget to take your credit card");
                    //
                    break;

                case 5:
                    System.out.println("Quitting");
                    apple = false;
                    break;
            }

            System.out.println("Any other action?");



        }

    }
}