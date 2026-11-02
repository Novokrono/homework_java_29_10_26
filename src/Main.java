import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        } else if (exercise == 3) {
            f3();
        } else if (exercise == 4) {
            f4();
        } else if (exercise == 5) {
            f5();
        } else if (exercise == 6) {
            f6();
        } else if (exercise == 7) {
            f7();
        } else if (exercise == 8) {
            f8();
        } else if (exercise == 9) {
            f9();
        } else if (exercise == 10) {
            f10();
        }
        else {
                System.out.println("Invalid exercise number");
            }
    }

    public static void f1() {
        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.print("Age:");
        int age = scanner.nextInt();
        System.out.print("Height:");
        float height = scanner.nextFloat();
        System.out.print("Last Name Initial:");
        char lNameInitial = scanner.next().charAt(0);

        System.out.print("Name: \n" + name);
        System.out.print("Age: \n" + age);
        System.out.print("height: \n" + height);
        System.out.print("lNameInitial: \n" + lNameInitial);
        System.out.print("Age in 10 years: \n" + (age + 10));


    }

    public static void f2() {
        System.out.print("Enter seconds: \n");
        int seconds = scanner.nextInt();
        int hours = 0;
        int minutes = 0;
        if(seconds % 3600 >= 0){
            hours = seconds / 3600;
            seconds -= hours * 3600;
        }
        if(seconds % 60 >= 0){
            minutes = seconds / 60;
            seconds -= minutes * 60;
        }
        System.out.println("hours:  " + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("seconds: " + seconds);

    }
    public static void f3() {
        System.out.println("Bill:");
        int bill = scanner.nextInt();
        System.out.println("Tip percentage:");
        float percentage = scanner.nextFloat();
        System.out.println("people:");
        int people = scanner.nextInt();

        float tip = (bill * percentage) / 100;
        float total = bill + tip;
        float perPerson = total / people;

        System.out.println("Tip:" + tip);
        System.out.println("Total:" + total);
        System.out.println("Per person:" + perPerson);
    }

    public static void f4(){
        double total = 0;
        for(int i = 1;  i<= 3; i++){
            System.out.println("Product " + i + " - price: ");
            double price = scanner.nextDouble();
            System.out.print("Product " + i + " - quantity: ");
            int quantity = scanner.nextInt();
            total += price * quantity;
        }
        System.out.println("Discount:");
        double percent = scanner.nextDouble();

        double discount = total * percent / 100;
        double finalPrice = total - discount;

        System.out.printf("Total before discount: %.2f%n", total);
        System.out.printf("Discount amount: %.2f%n", discount);
        System.out.printf("Final price: %.2f%n", finalPrice);

        System.out.print("Amount paid by customer: ");
        double paid = scanner.nextDouble();
        System.out.printf("Change: %.2f%n", paid - finalPrice);

    }
    public static void f5(){
        System.out.println("Distance:");
        int distance = scanner.nextInt();
        System.out.println("time in minutes:");
        int timeInMinutes = scanner.nextInt();

        double hours = timeInMinutes / 60.0;
        double speed = distance / hours;
        double distanceInOneHour = speed;

        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed: " + speed + " km/h");
        System.out.println("Distance in one hour: " + distanceInOneHour + " km");
    }


    public static void f6(){
        System.out.println("Assignments: ");
        double assignments = scanner.nextDouble();
        System.out.println("Quiz: ");
        double quiz = scanner.nextDouble();
        System.out.println("Final exam: ");
        double finalExam = scanner.nextDouble();

        double finalGrade = assignments * 0.2 + quiz * 0.3 + finalExam * 0.5;

        System.out.println("Final grade: " + finalGrade);
        if (finalGrade >= 60) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
    public static void f7(){

        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();


        if (a > b) {
            System.out.println("First number is bigger");
        } else if (b > a) {
            System.out.println("Second number is bigger");
        } else {
            System.out.println("The numbers are equal");
        }


        if (a % 2 == 0) {
            System.out.println("First number is even");
        } else {
            System.out.println("First number is odd");
        }


        if (b % 5 == 0) {
            System.out.println("Second number is divisible by 5");
        } else {
            System.out.println("Second number is not divisible by 5");
        }

        int sum = a + b;
        if (sum > 0) {
            System.out.println("Sum is positive");
        } else if (sum < 0) {
            System.out.println("Sum is negative");
        } else {
            System.out.println("Sum is zero");
        }
    }
    public static void f8(){
        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Error: age cannot be negative");
        } else if (age < 6) {
            System.out.println("Ticket price: 0 NIS");
        } else if (age <= 17) {
            System.out.println("Ticket price: 30 NIS");
        } else if (age <= 64) {
            System.out.println("Ticket price: 45 NIS");
        } else {
            System.out.println("Ticket price: 25 NIS");
        }
    }
    public static void f9(){
        System.out.print("Enter word: ");
        String word = scanner.next();

        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
    }

    public static void f10(){
        {
            System.out.println("integer division");
            int a = 7;
            int b = 2;

            System.out.println(a / b);
            System.out.println(a / 2.0);
        }

        {
            System.out.println("int overflow");
            int num = 2147483647;

            System.out.println(num);
            System.out.println(num + 1);
        }

        {
            System.out.println("double precision");
            double a = 0.1;
            double b = 0.2;

            System.out.println(a + b);
            System.out.println(a + b == 0.3);
        }
        {
            System.out.println("float vs double ");
            float smallPrecision = 100000000.0f;
            double highPrecision = 100000000.0;

            System.out.println(smallPrecision + 1);
            System.out.println(highPrecision + 1);
        }
    }
}