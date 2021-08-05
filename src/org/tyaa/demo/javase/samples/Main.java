package org.tyaa.demo.javase.samples;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    private static int x;
    private static int y;

    public static void main(String[] args) throws Exception {
        /* try {
            String action = args[0];
            switch (action) {
                case "say-hello": {
                    System.out.println("Hello!");
                    break;
                }
                case "show-time": {
                    System.out.println(new Date());
                    break;
                }
                default: {
                    System.out.println("Unknown argument");
                }
            }
        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("No argument");
        } */

        // foo(new SumAction());

        /* foo(new IAction() {
            @Override
            public int perform(int x, int y) {
                return sum(x, y);
            }
        }); */

        /* foo(new IAction() {
            @Override
            public int perform(int x, int y) {
                return sub(x, y);
            }
        }); */

        // foo(Main::sum);
        /* foo((x, y) -> {
            int result = (int)Math.pow(x, y);
            result *= result;
            return result;
        }); */
        // foo((x, y) -> (int)Math.pow(x, y));

        // foo((x, y) -> (int)Math.pow(x, y), () -> System.out.println("*** Calc ***"));
        foo(() -> (int)Math.pow(x, y), () -> System.out.println("*** Calc ***"));
    }

    /* public static void foo(IAction action, IGreeter greeter) {

        greeter.perform();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int x = sc.nextInt();
        System.out.println("Input second number: ");
        int y = sc.nextInt();

        int result = action.perform(x, y);

        System.out.printf("Result: %d", result);
    } */

    /* public static void foo(IAction action, Runnable greeter) {

        greeter.run();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int x = sc.nextInt();
        System.out.println("Input second number: ");
        int y = sc.nextInt();

        int result = action.perform(x, y);

        System.out.printf("Result: %d", result);
    } */

    public static void foo(Callable action, Runnable greeter) throws Exception {

        greeter.run();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        x = sc.nextInt();
        System.out.println("Input second number: ");
        y = sc.nextInt();

        int result = (int)action.call();

        System.out.printf("Result: %d", result);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }
}
