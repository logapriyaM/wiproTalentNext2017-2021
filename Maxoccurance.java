import java.util.*;
public class Maxoccurance
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] array=new int[100];
int max,i,count=0;
//to get a array elements
for( i=0;i<10;i++)
{
	array[i]=sc.nextInt();
}
//to find the maximum element
max=array[0];
for(i=0;i<10;i++)
{
	if(array[i]>max)
	{
		max=array[i];
	}
}
System.out.println("The maximum element in array" +max);
//to find the no of times the maximum value occurs
for(i=0;i<10;i++)
{
	if(array[i]==max)
	{
		count++;
	}
}
//to print the no of ocuurance of maximum element
System.out.println("The no of occurance maximum element in array" +count);
}
}
 