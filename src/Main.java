302.import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a <= b && b <= c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}

303.import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
        } else {
            System.out.println("no solution");
        }

        scanner.close();
    }
}

306.import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }

        scanner.close();
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
315.import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double result = powerWithoutMultiplication(a, n);
        System.out.println(result);

        scanner.close();
    }
    private static double powerWithoutMultiplication(double a, int n) {
        double result = 1.0;

        // Multiply a by itself n times
        for (int i = 0; i < n; i++) {
            result *= a;
        }

        return result;
    }
}






















































































































































































































































































































































































































































































