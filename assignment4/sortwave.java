import java.util.Scanner;

public class sortwave
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int tenNums[]=new int[10], orderedNums[]=new int[10];
        int greater;
        String choice;
        System.out.println("Enter 10 integers : ");
        for (int i=0;i<tenNums.length;i++)
        {
            System.out.print(i+1+"=> ");
            tenNums[i] = scan.nextInt();
        }
        System.out.println();

        for(int indexL=0;indexL<tenNums.length;indexL++)
        {
            greater=0;
            for(int indexR=0;indexR<tenNums.length;indexR++)
            {
                if(tenNums[indexL]>tenNums[indexR])
                {
                    greater++;
                }
            }
            orderedNums[greater]=tenNums[indexL];
        }

        System.out.print("Display order :\nA - Ascending\nD - Descending\nEnter your choice : ");
        choice = scan.next();

        if(choice.equalsIgnoreCase("a"))
        {
            for(greater=0;greater<orderedNums.length;greater++)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        }
        else if(choice.equalsIgnoreCase("d"))
        {
            for(greater=9;greater>-1;greater--)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        }
    }
}