import java.io.DataInputStream;
class Cal
{
    void pascal(int a)
    {
        int i,j;
        int n=1;
        int sp=a;
        for(i=0;i<a;i++)
        {
            for(int s=0;s<sp;s++)
            {
                System.out.print(" ");
            }
            sp--;
            for(j=0;j<=i;j++)
            {
                System.out.print(n+ " ");
                n=n*(i-j)/(j+1);
            }
            n=1;
            System.out.println();
        }
    }
}
class Pascal
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream in=new DataInputStream(System.in);
            System.out.print("Enter the no of lines:");
            int a=Integer.parseInt(in.readLine());
            Cal c1=new Cal();
            c1.pascal(a);
        }
        catch(Exception e)
        {}
    }
}