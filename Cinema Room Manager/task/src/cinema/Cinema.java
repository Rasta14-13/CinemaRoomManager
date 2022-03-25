package cinema;
import java.util.Scanner;

public class Cinema {

    static int r;
    static int s;
    static int rNum;
    static int sNum;
    static char[][] arr;
    static int a1;
    final static int two = 2;
    final static int over = 60;
    final static int cost10 = 10;
    final static int cost8 = 8;
    final static int sto = 100;
    static boolean action = true;
    static double countOfTicket;
    static int currentIncome;
    static int totalIncome;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows:\n> ");
        r = sc.nextInt();

        System.out.print("Enter the number of seats in each row:\n> ");
        s = sc.nextInt();

        arr = new char[r][s];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                arr[i][j] = 'S';
            }
        }
        while (action) {
            menu();
            a1 = sc.nextInt();
            if (a1 == 0) {
                exit();
            } else if (a1 == 1) {
                showSeats();
            } else if (a1 == 2) {
                inputNumber();

                arr[rNum - 1][sNum - 1] = 'B';
                countOfTicket++;

                buyTicket();
            } else if (a1 == 3) {
                statistic();
            }

        }
    }

    static void exit() {
        action = false;
    }

    static void showSeats() {
        System.out.println("\nCinema:");
        System.out.print("  ");
        int t = 1;
        while (t <= s) {
            System.out.print(t + " ");
            t++;
        }

        System.out.println();
        for (int i = 0; i < r; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < s; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


    }

    static void menu() {
        System.out.println("\n" + "1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit" + "\n");
    }

    static void buyTicket() {
        System.out.print("\nTicket price: ");
        if (r * s <= over) {
            System.out.println("$" + cost10);
            currentIncome += cost10;
        } else if (r * s > over) {
            int r1 = r / two;
            if (rNum <= r1) {
                System.out.println("$" + cost10);
                currentIncome += cost10;
            } else {
                System.out.println("$" + cost8);
                currentIncome += cost8;
            }
        }
    }

    static void statistic() {
        System.out.printf("Number of purchased tickets: %.0f\n", countOfTicket);
        if (countOfTicket != 0) {
            double percent = (countOfTicket * sto / (r * s));
            System.out.printf("Percentage: %.2f%c\n", percent, '%');
        } else {
            System.out.printf("Percentage: %.2f%c\n", countOfTicket, '%');
        }
        System.out.println("Current income: $" + currentIncome);
        if (r * s <= over) {
            totalIncome = r * s * cost10;
        } else if (r * s > over) {
            int r1 = r / two;
            totalIncome = s * (r1 * cost10 + (r - r1) * cost8);
        }
        System.out.println("Total income: $" + totalIncome);
    }

    static void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row number:\n> ");
        rNum = sc.nextInt();

        System.out.print("Enter a seat number in that row:\n> ");
        sNum = sc.nextInt();

        if (rNum < 0 || rNum > r || sNum < 0 || sNum > s)  {
            System.out.println("\nWrong input!\n");
            inputNumber();
        } else if (arr[rNum - 1][sNum - 1] == 'B') {
            System.out.println("\nThat ticket has already been purchased!\n");
            inputNumber();
        }
    }
}



