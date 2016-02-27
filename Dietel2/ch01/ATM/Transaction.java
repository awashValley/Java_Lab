public abstract class Transaction
{
  private int accountNumber;
  private Screen screen;
  private BankDatabase bankDatabase;

  public Transaction(int paramInt, Screen paramScreen, BankDatabase paramBankDatabase)
  {
    this.accountNumber = paramInt;
    this.screen = paramScreen;
    this.bankDatabase = paramBankDatabase;
  }

  public int getAccountNumber()
  {
    return this.accountNumber;
  }

  public Screen getScreen()
  {
    return this.screen;
  }

  public BankDatabase getBankDatabase()
  {
    return this.bankDatabase;
  }

  public abstract void execute();
}
