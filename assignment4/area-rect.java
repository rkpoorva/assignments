import java.util.Scanner;
class rect
{
public static void main(String args[])
{
double l,b,area;
Scanner s1=new Scanner(System.in);
System.out.println("enter l,b");
l=s1.nextDouble();
b=s1.nextDouble();
area=l*b;
System.out.println("area=" +area);
}
}
