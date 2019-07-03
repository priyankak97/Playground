import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner (System.in);
      int num=in.nextInt();
      for (int f=1;f<=num;f++)
      {
        if(num%f==0)
        {
          System.out.println(f);
        }
      }
	}
}