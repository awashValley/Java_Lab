public class BalanceInquiry extends Transaction
{
  public BalanceInquiry(int paramInt, Screen paramScreen, BankDatabase paramBankDatabase)
  {
    super(paramInt, paramScreen, paramBankDatabase);
  }

  public void execute()
  {
    BankDatabase localBankDatabase = getBankDatabase();
    Screen localScreen = getScreen();

    double d1 = localBankDatabase.getAvailableBalance(getAccountNumber());

    double d2 = localBankDatabase.getTotalBalance(getAccountNumber());

    localScreen.displayMessageLine("\nBalance Information:");
    localScreen.displayMessage(" - Available balance: ");
    localScreen.displayDollarAmount(d1);
    localScreen.displayMessage("\n - Total balance:     ");
    localScreen.displayDollarAmount(d2);
    localScreen.displayMessageLine("");
  }
}
