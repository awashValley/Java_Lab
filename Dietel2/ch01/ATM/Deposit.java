public class Deposit extends Transaction
{
  private double amount;
  private Keypad keypad;
  private DepositSlot depositSlot;
  private static final int CANCELED = 0;

  public Deposit(int paramInt, Screen paramScreen, BankDatabase paramBankDatabase, Keypad paramKeypad, DepositSlot paramDepositSlot)
  {
    super(paramInt, paramScreen, paramBankDatabase);

    this.keypad = paramKeypad;
    this.depositSlot = paramDepositSlot;
  }

  public void execute()
  {
    BankDatabase localBankDatabase = getBankDatabase();
    Screen localScreen = getScreen();

    this.amount = promptForDepositAmount();

    if (this.amount != 0.0D)
    {
      localScreen.displayMessage("\nPlease insert a deposit envelope containing ");

      localScreen.displayDollarAmount(this.amount);
      localScreen.displayMessageLine(".");

      boolean bool = this.depositSlot.isEnvelopeReceived();

      if (bool)
      {
        localScreen.displayMessageLine("\nYour envelope has been received.\nNOTE: The money just deposited will not be available until we verify the amount of any enclosed cash and your checks clear.");

        localBankDatabase.credit(getAccountNumber(), this.amount);
      }
      else
      {
        localScreen.displayMessageLine("\nYou did not insert an envelope, so the ATM has canceled your transaction.");
      }

    }
    else
    {
      localScreen.displayMessageLine("\nCanceling transaction...");
    }
  }

  private double promptForDepositAmount()
  {
    Screen localScreen = getScreen();

    localScreen.displayMessage("\nPlease enter a deposit amount in CENTS (or 0 to cancel): ");

    int i = this.keypad.getInput();

    if (i == 0) {
      return 0.0D;
    }

    return i / 100.0D;
  }
}
