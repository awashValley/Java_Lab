public class CashDispenser
{
  private static final int INITIAL_COUNT = 500;
  private int count;

  public CashDispenser()
  {
    this.count = 500;
  }

  public void dispenseCash(int paramInt)
  {
    int i = paramInt / 20;
    this.count -= i;
  }

  public boolean isSufficientCashAvailable(int paramInt)
  {
    int i = paramInt / 20;

    if (this.count >= i) {
      return true;
    }
    return false;
  }
}
