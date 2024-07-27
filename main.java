import easyMath.easy;
import hardMath.hard;
import java.util.*;
import mediumMath.medium;

class main {
    static void makeEasy()
    {
        System.out.println("Difficulty level ----> EASY\n");
        while (easy.getScore() < 100) {
            Random rd = new Random();
            int temp = Math.abs(rd.nextInt(4));
            try {
                switch (temp) {
                case 0:
                    easy.add();
                    break;
                case 1:
                    easy.sub();
                    break;
                case 2:
                    easy.mult();
                    break;
                case 3:
                    easy.div();
                    break;
                }
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("---------------------------CONGRATS!! GAME FINISHED!!-------------------------");
    }

    static void makeMedium()
    {
        System.out.println("Difficulty level ----> MEDIUM\n");
        while (medium.getScore() < 100) {
            Random rd = new Random();
            int temp = Math.abs(rd.nextInt(5));
            try {
                switch (temp) {
                case 0:
                    medium.add();
                    break;
                case 1:
                    medium.sub();
                    break;
                case 2:
                    medium.mult();
                    break;
                case 3:
                    medium.div();
                    break;
                case 4:
                    medium.fact();
                }
            } catch (Throwable e) {
                System.out.println("exited");
            }
        }

        System.out.println("----------------------------CONGRATS!! GAME FINISHED!!-------------------------------");
    }

    static void makeHard()
    {
        System.out.println("Difficulty level ----> HARD\n");

        while (hard.getScore() < 100){
        	try {
        		hard.expression();
        	} catch (Throwable e){
        		System.out.println("exception occured. TRY AGAIN!!!" + e.getMessage());
        	}
        }

        System.out.println("-------------------CONGRATS!! GAME FINISHED!!--------------------");
    }

    public static void main(String[] args)
    {
        System.out.println("Java Math Game by Vedant Patel and Pujan Patel");
        System.out.println("Enter difficulty Level \n1. Easy \n2. Medium \n3. Hard");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("-----------------------------GAME STARTS------------------------------");
        try {
            switch (n) {
            case 1:
                makeEasy();
                break;
            case 2:
                makeMedium();
                break;
            case 3:
                makeHard();
                break;
            default:
                System.out.println("enter valid value!!");
            }
        } catch (Exception e) {
            System.out.println("enter numbers only");
        }
    }
}
