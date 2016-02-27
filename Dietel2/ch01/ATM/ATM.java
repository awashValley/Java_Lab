public class ATM
{
  private boolean userAuthenticated;
  private int currentAccountNumber;
  private Screen screen;
  private Keypad keypad;
  private CashDispenser cashDispenser;
  private DepositSlot depositSlot;
  private BankDatabase bankDatabase;
  private static final int BALANCE_INQUIRY = 1;
  private static final int WITHDRAWAL = 2;
  private static final int DEPOSIT = 3;
  private static final int EXIT = 4;

  public ATM()
  {
    this.userAuthenticated = false;
    this.currentAccountNumber = 0;
    this.screen = new Screen();
    this.keypad = new Keypad();
    this.cashDispenser = new CashDispenser();
    this.depositSlot = new DepositSlot();
    this.bankDatabase = new BankDatabase();
  }

  public void run()
  {
    while (true)
      if (!this.userAuthenticated)
      {
        this.screen.displayMessageLine("\nWelcome!");
        authenticateUser();
      }
      else {
        performTransactions();
        this.userAuthenticated = false;
        this.currentAccountNumber = 0;
        this.screen.displayMessageLine("\nThank you! Goodbye!");
      }
  }

  private void authenticateUser()
  {
    this.screen.displayMessage("\nPlease enter your account number: ");
    int i = this.keypad.getInput();
    this.screen.displayMessage("\nEnter your PIN: ");
    int j = this.keypad.getInput();

    this.userAuthenticated = this.bankDatabase.authenticateUser(i, j);

    if (this.userAuthenticated)
    {
      this.currentAccountNumber = i;
    }
    else
      this.screen.displayMessageLine("Invalid account number or PIN. Please try again.");
  }

  private void performTransactions()
  {
    Transaction localTransaction = null;

    int i = 0;

    while (i == 0)
    {
      int j = displayMainMenu();

      switch (j)
      {
      case 1:
      case 2:
      case 3:
        localTransaction = createTransaction(j);

        localTransaction.execute();
        break;
      case 4:
        this.screen.displayMessageLine("\nExiting the system...");
        i = 1;
        break;
      default:
        this.screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
      }
    }
  }

  private int displayMainMenu()
  {
    this.screen.displayMessageLine("\nMain menu:");
    this.screen.displayMessageLine("1 - View my balance");
    this.screen.displayMessageLine("2 - Withdraw cash");
    this.screen.displayMessageLine("3 - Deposit funds");
    this.screen.displayMessageLine("4 - Exit\n");
    this.screen.displayMessage("Enter a choice: ");
    return this.keypad.getInput();
  }

  private Transaction createTransaction(int paramInt)
  {
    Object localObject = null;

    switch (paramInt)
    {
    case 1:
      localObject = new BalanceInquiry(this.currentAccountNumber, this.screen, this.bankDatabase);

      break;
    case 2:
      localObject = new Withdrawal(this.currentAccountNumber, this.screen, this.bankDatabase, this.keypad, this.cashDispenser);

      break;
    case 3:
      localObject = new Deposit(this.currentAccountNumber, this.screen, this.bankDatabase, this.keypad, this.depositSlot);
    }

    return localObject;
  }
}
