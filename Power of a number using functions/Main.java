import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      //public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int b = in.nextInt();
      int e=in.nextInt();
      System.out.print(po(b,e));
    }
  public static int po(int b,int e)
  {
    int p=1;
    while(e>=1)
    {
      p=p*b;
      e--;
    }
    return p;
  }
}