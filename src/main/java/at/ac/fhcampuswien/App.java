package at.ac.fhcampuswien;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        double z = 0;
        int y = 1;
        double x;

        do {
            System.out.print("Number " + y + ": ");
            x = sc.nextDouble();
            if (x <= 0 && y == 1) {
                System.out.println("No number entered.");
                return;
            } else if (x > z) {
                z = x;
            }
            y++;
        }
        while (1 < x);
        System.out.printf("The largest number is %.2f",z);
        System.out.println();
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int c = 1;
        int a = sc.nextInt();
        if (a > 0) {
            System.out.print("n: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(c + " ");
                    c++;
                }
                System.out.println();
            }
        } else {
            System.out.println("n: " + "Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        final int row = 6;
        int k = 0;
        for (int i = 1; i<=row;i++, k = 0){
            for (int j = 1; j<=row-i;++j){
                System.out.print(" ");
            }
            while (k != 2 * i -1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        // char = c = scan.next().char@(0)
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x;
        int y=1;
        int z=0;
        int i;
        int b=0;
        float a;
        do {
            System.out.print("Mark "+y+": ");
            x = sc.nextInt();
            if (x>5 || x<0){
                System.out.println("Invalid mark!");
            }
            else{
                z = x;
            }
            if (x == 5){
                b++;
            }
            y++;
            i =z+x;
        }
        while (x<5 && x>0);
        a =  i/y;
        System.out.println("Average: "+ a);
        System.out.println("Negative marks: "+b);
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int n, s = 1, num, sum=0;
        System.out.print("n: ");
        n = sc.nextInt();
        num = n;
        while (num != 1 && num!=4){
            while (num > 0){
                s = num % 10;
                sum += Math.pow(s,2);
                num = num /10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1){
            System.out.println("Happy number!");
        }
        else{
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}