import java.util.*;
public class FainanceTracker {
  private List<Transaction> transaction = new ArrayList<>();
   
 public void addTransaction(String data,String category, String type, double amount)
 {
   transaction.add(new Transaction(type, category, amount, data));
   
 }

 public void showTransaction()
 {
  if(transaction.isEmpty()){
    System.out.println("No transactions Yet!!");
    return; 
  }
  for (Transaction t: transaction)
  {
    System.out.println(t);
  }
 }
  public double calculate_Balance()
  {
    double Balance =0;
    for (Transaction t: transaction)
    {
      Balance +=t.getAmount();
    }
    return Balance;
  }

}
