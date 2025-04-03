class Transaction{
  private String type;
  private String category;
  private double amount;
  private String data;

  public Transaction(String type, String category, double amount, String data )
  {
    this.type=type;
    this.amount=amount;
    this.category=category;
    this.data=data;
  }

  public double  getAmount()
  {
    return type.equalsIgnoreCase("income")?amount:-amount;
  }
}