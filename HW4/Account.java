// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10
import java.util.Date;

public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;
  public Account() {
    id = 0;
    balance = 1000;
    annualInterestRate = 4.50;
    dateCreated = = new Date();
  }
  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    annualInterestRate = 4.50;
    dateCreated = = new Date();
  }
  public int getId() {
    return id;
  }
  public double getBalance() {
    return balance;
  }
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setId(int newId) {
    id = newId;
  }
  public void setBalance(double newBalance) {
    balance = newBalance;
  }
  public void setAnnualInterestRate(double newAnnualRate) {
    annualInterestRate = newAnnualRate;
  }
  public double getMonthlyInterestRate() {
    double monthlyRate = annualInterestRate / 12;
    return monthlyRate;
  }
  public void withDraw(double amount) {
    if (amount < balance) {
      balance -= amount;
    } else {
      System.out.println("Your balance is too low to make this withdrawal. Please refill your account of withdraw a lesser amount.");
    }
  }
  public void deposit(double amount) {
    balance += amount;
  }
}
