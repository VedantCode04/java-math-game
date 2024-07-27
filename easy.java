package easyMath;
import java.util.*;

public class easy {
    public static int score = 0;

    public static void add() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a = Math.abs(rd.nextInt(100));
        int b = Math.abs(rd.nextInt(100));
        int sol = a + b;

        System.out.print(a + "+" + b + " = ");

        int x = sc.nextInt();

        if (x == sol) {
            score = score + 5;
            System.out.println("correct. Your SCORE = " + score);
        } else {
            score = score - 5;

            System.out.println("incorrect. Correct Soultion is " + sol + " SCORE = " + score);
        }
    }

    public static void sub() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a = Math.abs(rd.nextInt(100));
        int b = Math.abs(rd.nextInt(100));
        int sol = a - b;

        System.out.print(a + "-" + b + " = ");

        int x = sc.nextInt();

        if (x == sol) {
            score = score + 5;
            System.out.println("correct. Your SCORE = " + score);
        } else {
            score = score - 5;
            System.out.println("incorrect. Correct Soultion is " + sol + " SCORE = " + score);
        }
    }

    public static void mult() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a = Math.abs(rd.nextInt(10));
        int b = Math.abs(rd.nextInt(15));
        int sol = a * b;

        System.out.print(a + "*" + b + " = ");

        int x = sc.nextInt();

        if (x == sol) {
            score = score + 10;
            System.out.println("correct. Your SCORE = " + score);
        } else {
            score = score - 10;
            System.out.println("incorrect. Correct Soultion is " + sol + " SCORE = " + score);
        }
    }

    public static void div() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

		double arr[] = new double[2];
        arr[0] = rd.nextInt(21);
        arr[1] = rd.nextInt(6) + 1;

        double sol = arr[0] / arr[1];
        sol = Math.round(sol * 100D)/ 100D;
        
        System.out.print(arr[0] + " / " + arr[1] + " = ");
        double x = sc.nextDouble();

        if (x == sol) {
            score = score + 10;
            System.out.println("correct. Your SCORE = " + score);
        } else {
            score = score - 10;
            System.out.println("incorrect. Correct Soultion is " + sol + " SCORE = " + score);
        }
    }

    public static int getScore()
    {
        return score;
    }
}