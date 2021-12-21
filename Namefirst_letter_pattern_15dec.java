/*
*****
  *
  *
* *
 *
*/






public class first_letter_pattern
{
    public static void main(String args[]);
    {
        int i,j;
        for(i=1;i<5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==2||i==3)
                {
                    if(j==3)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }

                }else if (i==4) {
                    if (j==2||j==4||j==5)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }else if(i==5)
                {
                    if(j==2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }else
                {
                    System.out.print("*");
                }
            }System.out.print("\n");
        }
    }
}