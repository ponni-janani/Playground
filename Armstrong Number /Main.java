import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int cd=n;
      int dc=0;
      if(n==0)
      {
        System.out.println(n);
      }
      else
      {
        while(n>0)
        {
          dc++;
          n=n/10;
        }
      }
      n=cd;
      int sum=0;
      int pre=1;
      while(n>0)
      {
        int rem=n%10;
        for(int count=1;count<=dc;count++)
        {
          pre=pre*rem;
        }
        sum=sum+pre;
        pre=1;
        n=n/10;
      }
      if(sum==cd)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
	}
    }
}