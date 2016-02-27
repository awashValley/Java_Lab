public class Withdrawal extends Transaction
{
  private int amount;
  private Keypad keypad;
  private CashDispenser cashDispenser;
  private static final int CANCELED = 6;

  public Withdrawal(int paramInt, Screen paramScreen, BankDatabase paramBankDatabase, Keypad paramKeypad, CashDispenser paramCashDispenser)
  {
    super(paramInt, paramScreen, paramBankDatabase);

    this.keypad = paramKeypad;
    this.cashDispenser = paramCashDispenser;
  }

  public void execute()
  {
    int i = 0;

    BankDatabase localBankDatabase = getBankDatabase();
    Screen localScreen = getScreen();
    do
    {
      this.amount = displayMenuOfAmounts();

      if (this.amount != 6)
      {
        double d = localBankDatabase.getAvailableBalance(getAccountNumber());

        if (this.amount <= d)
        {
          if (this.cashDispenser.isSufficientCashAvailable(this.amount))
          {
            localBankDatabase.debit(getAccountNumber(), this.amount);

            this.cashDispenser.dispenseCash(this.amount);
            i = 1;

            localScreen.displayMessageLine("\nPlease take your cash now.");
          }
          else
          {
            localScreen.displayMessageLine("\nInsufficient cash available in the ATM.\n\nPlease choose a smaller amount.");
          }

        }
        else
        {
          localScreen.displayMessageLine("\nInsufficient funds in your account.\n\nPlease choose a smaller amount.");
        }

      }
      else
      {
        localScreen.displayMessageLine("\nCanceling transaction...");
        return;
      }
    }
    while (i == 0);
  }

  private int displayMenuOfAmounts()
  {
    int i = 0;

    Screen localScreen = getScreen();

    int[] arrayOfInt = { 0, 20, 40, 60, 100, 200 };

    while (i == 0)
    {
      localScreen.displayMessageLine("\nWithdrawal Menu:");
      localScreen.displayMessageLine("1 - $20");
      localScreen.displayMessageLine("2 - $40");
      localScreen.displayMessageLine("3 - $60");
      localScreen.displayMessageLine("4 - $100");
      localScreen.displayMessageLine("5 - $200");
      localScreen.displayMessageLine("6 - Cancel transaction");
      localScreen.displayMessage("\nChoose a withdrawal amount: ");

      int j = this.keypad.getInput();

      switch (j)
      {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        i = arrayOfInt[j];
        break;
      case 6:
        i = 6;
        break;
      default:
        localScreen.displayMessageLine("\nIvalid selection. Try again.");
      }

    }

    return i;
  }
}
