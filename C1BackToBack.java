class C1BackToBack extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    String strWord;
    String strLastcha;
    String strNewword;

    strWord = readLine("Enter a word: ");


    strLastcha = strWord.substring(strWord.length() -1);

    strNewword = strLastcha+strWord+strLastcha;

    System.out.println(strNewword);


    
  }
}
