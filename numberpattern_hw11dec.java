/*

1
01
101
0101
10101 
 */


class numberpattern_hw11dec
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i==j)
				{
				System.out.print("1");
				}
				else if(i==3&&j==1||i==4&&j==2||i==5&&j==1||i==5&&j==3)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}System.out.print("\n");
		}
	}
}
*/
