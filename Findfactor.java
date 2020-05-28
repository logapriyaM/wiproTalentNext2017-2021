import java.util.*;
public class Findfactor
{
public static void main(String[] args)
{
int[] array =new int[100];
Scanner sc=new Scanner(System.in);
// enter a no
int n=sc.nextInt();
int j=0;
//enter a pth element to be reutrun
int p=sc.nextInt();
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		array[j]=i;
		j++;
	}
}
for(int i=0;i<j;i++)
{
	System.out.print(array[i]+"\t");
}
if(p>j)
{
	System.out.println("\n0");	
}
else 
{
	System.out.println("\n"+array[p-1]);
}
}
}
