// Ruwa Nofta Sabilla
// A11.2019.12063

import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Masukkan Kata : ");
        Scanner in = new Scanner(System.in);
        String origString = in.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<origString.length(); i++)
        {
            stack.push(origString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty())
        {
            reverseString = reverseString + stack.pop();
        }

        if (origString.equals(reverseString))
        {
            System.out.println("Kata Termasuk Palindrome");
        }
        else 
        {
            System.out.println("Kata Bukan Termasuk Palindrome");
        }
    }

}