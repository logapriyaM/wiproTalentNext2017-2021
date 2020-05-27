import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lowupp {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        String low=" ";
        String upp=" ";
        char ch;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch>= 'A'  && ch<= 'Z' )
            {
                upp+=ch;
            }
            else
            {
                 low+=ch;
            }
        }
       //add both the strings
        String s1=low+upp;
        //remove the space between the upper and lower case strings
        String s2=s1.replaceAll("\\s","");
        System.out.printf(s2);
    }
}