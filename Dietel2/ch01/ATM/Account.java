public class Account
{
  private int accountNumber;
  private int pin;
  private double availableBalance;
  private double totalBalance;

  public Account(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    this.accountNumber = paramInt1;
    this.pin = paramInt2;
    this.availableBalance = paramDouble1;
    this.totalBalance = paramDouble2;
  }

  public boolean validatePIN(int paramInt)
  {
    if (paramInt == this.pin) {
      return true;
    }
    return false;
  }

  public double getAvailableBalance()
  {
    return this.availableBalance;
  }

  public double getTotalBalance()
  {
    return this.totalBalance;
  }

  public void credit(double paramDouble)
  {
    this.totalBalance += paramDouble;
  }

  public void debit(double paramDouble)
  {
    this.availableBalance -= paramDouble;
    this.totalBalance -= paramDouble;
  }

  public int getAccountNumber()
  {
    return this.accountNumber;
  }
}
