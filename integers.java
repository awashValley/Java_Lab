// [06MAR2016] length of an integer (from Stackoverflow, by Dmitry Brant)
  int n = 1000;
  int length = (int)(Math.log10(n)+1);
  
  
// [06MAR2016] Convert an integer to an array
  public int[] convertToArray(int number) {
    int i = 0;
    int length = (int) Math.log10(number);
    int divisor = (int) Math.pow(10, length);
    int temp[] = new int[length + 1];

    while (number != 0) {
        temp[i] = number / divisor;
        if (i < length) {
            ++i;
        }
        number = number % divisor;
        if (i != 0) {
            divisor = divisor / 10;
        }
    }
    return temp;
  }
