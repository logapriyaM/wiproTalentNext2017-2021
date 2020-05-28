import java.util.*;
public class Repchar
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int index,i;
String reverse=" ";
StringBuilder sb=new StringBuilder();
for( i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	index=s.indexOf(ch,i+1);
	if(index==-1)
	{
		sb.append(ch);
	}
}
for(i=sb.length()-1;i>=0;i--)
{
	char ch1=sb.charAt(i);
	reverse+=ch1;
}
System.out.println(reverse);
}
}
			
