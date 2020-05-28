import java.util.*;
public class Maximum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] array=new int[100];
int max,i;
//to get a array elements
for( i=0;i<25;i++)
{
	array[i]=sc.nextInt();
}
//to find the maximum element
max=array[0];
for(i=0;i<25;i++)
{
	if(array[i]>max)
	{
		max=array[i];
	}
}

System.out.println("The maximum element in array" +max);
}
}
 
