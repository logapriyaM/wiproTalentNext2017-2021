//to find a no is positive or negative or zero
import java.util.*;
public class PNZ
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
{
	System.out.println("Positive");
}
else if(n==0)
{
	System.out.println("Zero");
}
else
{
	System.out.println("Negative");
}

}
}


//to find odd or even

mport java.util.*;
public class EO
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
{
	System.out.println("Even");
}
else 
{
	System.out.println("Odd");
}
}
}

// if examples based command line argument

import java.util.*;
public class Command
{
public static void main(String[] args)
{
if(args.length==0)
{
System.out.println("No values");
}
else
{
System.out.print(args[0]);
for(int i=1;i<args.length;i++)
{
System.out.print(","+args[i]);
}
}
}
}

// to sort 2 character varaible
import java.util.*;
public class Command
{
public static void main(String[] args)
{
if(args.length==0)
{
System.out.println("No values");
}
else
{
System.out.print(args[0]);
for(int i=1;i<args.length;i++)
{
System.out.print(","+args[i]);
}
}
}
}
