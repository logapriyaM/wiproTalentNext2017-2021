//program to print a welcome msg in  commamnd line argumnt
public class CommandLine
{
public static void main(String[] args)
{
System.out.println("welcome"+" "+args[0]);
}
}


// to get a 2 strings in command line argument and print Technologies string between them
public class Commandline2
{
public static void main(String[] args)
{
System.out.println(args[0]+" "+"Technologies"+" "+args[1]);
}
}


// programm to print sum of integers passed through command line argument
class Commandline1
{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int sum=a+b;
System.out.println(sum);
}
}
