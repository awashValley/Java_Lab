public class BankDatabase
{
  private Account[] accounts;

  public BankDatabase()
  {
    this.accounts = new Account[2];
    this.accounts[0] = new Account(12345, 54321, 1000.0D, 1200.0D);
    this.accounts[1] = new Account(98765, 56789, 200.0D, 200.0D);
  }

  private Account getAccount(int paramInt)
  {
    for (Account localAccount : this.accounts)
    {
      if (localAccount.getAccountNumber() == paramInt) {
        return localAccount;
      }
    }
    return null;
  }

  public boolean authenticateUser(int paramInt1, int paramInt2)
  {
    Account localAccount = getAccount(paramInt1);

    if (localAccount != null) {
      return localAccount.validatePIN(paramInt2);
    }
    return false;
  }

  public double getAvailableBalance(int paramInt)
  {
    return getAccount(paramInt).getAvailableBalance();
  }

  public double getTotalBalance(int paramInt)
  {
    return getAccount(paramInt).getTotalBalance();
  }

  public void credit(int paramInt, double paramDouble)
  {
    getAccount(paramInt).credit(paramDouble);
  }

  public void debit(int paramInt, double paramDouble)
  {
    getAccount(paramInt).debit(paramDouble);
  }
}
