import java.io.PrintStream;

public class Screen
{
  public void displayMessage(String paramString)
  {
    System.out.print(paramString);
  }

  public void displayMessageLine(String paramString)
  {
    System.out.println(paramString);
  }

  public void displayDollarAmount(double paramDouble)
  {
    System.out.printf("$%,.2f", new Object[] { Double.valueOf(paramDouble) });
  }
}
