

import java.util.Random;
import java.util.Scanner;

public class lab2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter password length ");
        int length = in.nextInt();
        System.out.print("Enter password quantity ");
        int quantity = in.nextInt();
        for(int i = 1; i <= quantity; i++)
            System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        String passSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();

        char[] password = new char[len];
        for (int i = 0; i < len; i++)
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }
}

