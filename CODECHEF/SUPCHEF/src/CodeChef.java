/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Codechef codechef = new Codechef();
        for (int i = 0; i < num; i++) {
            System.out.println(codechef.answer(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }

    private String answer(int m, int n, int k) {
        return (n * k) < m ? "YES" : "NO";
    }
}
