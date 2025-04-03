import java.util.Scanner;

public class Main {
  public static void main(String ar[])
  {
    Scanner sc =new Scanner(System.in);
    FainanceTracker tracker= new FainanceTracker();
    while(true){
      System.out.println("\nPersonal Finance Tracker");
      System.out.println("1. Add Transaction");
      System.out.println("2. View Transactions");
      System.out.println("3. View Balance");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");

      int choice=sc.nextInt();
      sc.nextLine();

      switch (choice){
        case 1:
        System.out.print("Enter type (income/expense): ");
        String type = sc.nextLine();
        System.out.print("Enter category: ");
        String category = sc.nextLine();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();
        tracker.addTransaction(date, category, type, amount);
        System.out.println("Transaction added Successfully!!!");
        break;
        case 2:
        System.out.println("\n Your transaction histroy:");
        tracker.showTransaction();
        break; 
        case 3:
        System.out.println("Your Current balance is : "+ tracker.calculate_Balance());
        break;
        case 4:
        System.out.println("Exiting.....Have a great day!!");
        break;
        default:
        System.out.println(" Worng choice of number Try again. ");
      }

    }
  }
}
