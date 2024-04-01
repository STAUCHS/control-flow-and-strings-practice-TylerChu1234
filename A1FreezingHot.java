class A1FreezingHot extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    int intTemp1;
    int intTemp2;





    intTemp1 = readInt("enter temperature one: ");
    intTemp2 = readInt("enter temperature two: ");


    if (intTemp1 > 100 && intTemp2<=0 || intTemp1<=0 && intTemp2>100)
      System.out.println(" true"); 
    else
      System.out.println(" false");
  


  }

}