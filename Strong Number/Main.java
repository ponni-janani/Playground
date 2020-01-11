import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int cn=n;
       int sum=0;
      while(n>0)
      {
        int rem=n%10;
        int fact=1;
        for(int count=1;count<=rem;count++)
        {
          fact=fact*count;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(cn==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
	}
}