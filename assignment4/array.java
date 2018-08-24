import java.util.Scanner;
class arr
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int arr[]=new int[10];
int i;

for(i=0;i<arr.length;i++)
{
System.out.println("enter" +(i+1)+ "no");
arr[i]=s1.nextInt();
}
}
}
