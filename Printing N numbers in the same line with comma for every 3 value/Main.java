import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num;
    for(num=1;num<=n;num++)
    {
      System.out.print(num);
    if(num%3==0)
      System.out.print(",");
    }
  }
}