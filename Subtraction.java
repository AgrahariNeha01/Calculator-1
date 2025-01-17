import java.util.*;
public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a-b);
        sc.close();
    }
    
}
import java.util.logging.Logger;

public class Subtraction {
    private static final Logger logger = Logger.getLogger(Subtraction.class.getName());

    public static void main(String[] args) {
        logger.info("Program started");
        Scanner sc = new Scanner(System.in);
        logger.info("Scanner initialized");
        int a = sc.nextInt();
        logger.info("First number input: " + a);
        int b = sc.nextInt();
        logger.info("Second number input: " + b);
        int result = a - b;
        logger.info("Subtraction result: " + result);
        System.out.println(result);
        logger.info("Result printed");
        sc.close();
        logger.info("Scanner closed");
    }
