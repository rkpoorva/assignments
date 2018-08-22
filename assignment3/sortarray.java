import java.util.Arrays;
import java.util.Scanner;
class array
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("enter a num");
int num=s1.nextInt();
int i;
int arr[]={1,4,6,7,8,9,10};
int flag=0;
for(i=0;i<=6;i++)
{
if(num==arr[i])
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("yes");
}
else if(flag==0)
{
System.out.println("no");
}
}
}