package mediumMath;
import java.util.*;

public class medium {

    public static int score = 0;

    public static void add() throws Exception
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand, size, sum = 0;

        size = r.nextInt(6) + 3;

        for (int i = 0; i < size; ++i) {
            rand = r.nextInt(15);

            if (i < size - 1) {
                System.out.print(rand + " + ");
            } else {
                System.out.print(rand + " = ");
            }

            sum = sum + rand;
        }

        int ans = s.nextInt();

        if (ans == sum) {
            score = score + 5;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 5;
            System.out.println("Incorrect. Correct ans is: " + sum + " Score is " + score);
        }
    }

    public static void sub() throws Exception
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand, size, sum = 0;

        size = r.nextInt(6) + 3;

        for (int i = 0; i < size; ++i) {
            rand = r.nextInt(16);
            if (i < size - 1) {
                System.out.print(rand + " - ");
            } else {
                System.out.print(rand + " = ");
            }

            if (i == 0) {
                sum = rand;
            } else {
                sum = sum - rand;
            }
        }

        int ans = s.nextInt();

        if (ans == sum) {
            score = score + 5;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 5;
            System.out.println("Incorrect. Correct ans is: " + sum + " Score is " + score);
        }
    }

    public static void div() throws Exception
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand;

        float arr[] = new float[2];
        arr[0] = r.nextInt(101);
        arr[1] = r.nextInt(50) + 1;

        double sum = arr[0] / arr[1];
        System.out.print(arr[0] + " / " + arr[1] + " = ");
        double ans = s.nextDouble();
        sum = Math.round(sum * 100D) / 100D;

        if (ans == sum) {
            score = score + 15;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 10;
            System.out.println("Incorrect. Correct ans is: " + sum + " Score is " + score);
        }
    }

    public static void mult() throws Exception
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand, size, sum = 1;

        size = r.nextInt(4) + 3;

        for (int i = 0; i < size; ++i) {
            rand = r.nextInt(11);
            if (i < size - 1) {
                System.out.print(rand + " * ");
            } else {
                System.out.print(rand + " = ");
            }
            sum = sum * rand;
        }

        int ans = s.nextInt();

        if (ans == sum) {
            score = score + 10;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 10;
            System.out.println("Incorrect. Correct ans is: " + sum + " Score is " + score);
        }
    }

    public static void fact() throws Exception
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int rand = r.nextInt(12) + 1;

        long fact = 1;
        for (int i = 1; i <= rand; ++i) {
            fact = fact * i;
        }

        System.out.print(rand + "! = ");

        long ans = s.nextInt();

        if (ans == fact) {
            score = score + 10;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 10;
            System.out.println("Incorrect. Correct ans is: " + fact + " Score is " + score);
        }
    }

    public static int getScore()
    {
        return score;
    }
}