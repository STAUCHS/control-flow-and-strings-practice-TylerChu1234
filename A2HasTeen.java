class A2HasTeen extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    int intAge1;
    int intAge2;
    int intAge3;

    intAge1 = readInt ("enter age 1: ");
    intAge2 = readInt ("enter age 2: ");
    intAge3 = readInt ("enter age 3: ");

    if (intAge1 >= 13 && intAge1 <= 19 ) 
      System.out.println("true");
    else if (intAge2 >= 13 && intAge2 <= 19)
      System.out.println("true");
    else if (intAge3 >= 13 && intAge3 <= 19)
      System.out.println("true");
    else
      System.out.println("false");
  }
}
