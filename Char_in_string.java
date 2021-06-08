package JavaCodes;

import java.util.Scanner;

public class Char_in_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int n=s.length();
        int count=0;

        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) != ' ')
                count++;
        }
        System.out.println("Characters are "+count);
    }
}
