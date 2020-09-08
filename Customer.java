import java.util.Scanner; 
import java.util.ArrayList;

public class Customer
{
  String accountType, currencyType, info; 
  int customerID, balance, amount;
  Scanner input = new Scanner(System.in);

  public Customer(int customerID, String accountType, String currencyType,  int balance)
  {
    this.accountType = accountType;
    this.currencyType = currencyType; 
    this.customerID = customerID;
    this.balance = balance; 
    this.amount = amount; 
  }

  public int deposit(int amount)
  {
    amount = input.nextInt();
    if (amount >= 500)
    {
      System.out.println("Invalid");
    }
    else
    {
      balance = balance + amount;
    }
    return balance;
  }

  public int withdraw(int amount)
  {
    if (balance < amount)
    {
      System.out.println("Invalid amount.");
    }
    else if (amount >= 500)
    {
      System.out.println("Invalid");
    }
    else 
    {
      balance = balance - amount;
    }
    return balance;
  }


  public void display(ArrayList<Customer> accounts) 
  {
    System.out.println("CustomerID:" + accounts.customerID);
    System.out.println("Account Type:" + accounts.accountType);
    System.out.println("Currency Type: " + accounts.currencyType); 
    System.out.println("Balance:" + accounts.balance);
  }

  public  void balance(ArrayList<Customer> accounts) 
  {
    System.out.println("Balance:" + accounts.balance);
  }
}