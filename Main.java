package AccountClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountClass humanX = new AccountClass("yxs6542", "YasirSalman",
                5000.00);

        System.out.println(humanX.getID());;
        System.out.println(humanX.getFirstAndLastName());
        System.out.println(humanX.getBalance());
        humanX.creditBalance(500.00);
        System.out.println(humanX.creditBalance(600));
        System.out.println(humanX.getBalance());


        AccountClass humanX2 = new AccountClass("yxs6542", "YasirSalman",
                6000.00);

        System.out.println(humanX2.getBalance());




    }
}








//       Scanner sc = new Scanner(System.in);
//        AccountClass personX = new AccountClass(sc.next());
//        System.out.println("Enter ID:");
//        personX.getID();
//        System.out.println("Enter Name:");
//        personX.getFirstAndLastName();
//        System.out.println("Total Balance:");
//        personX.getBalance();
//        System.out.println("Enter amount you want to credit in:");
//        personX.creditBalance();
//        System.out.println("Enter amount you'd like to debit:");
//        personX.debitBalance();
//
//
//
//    }

