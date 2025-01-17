import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>b)
        {
            if(b!=0)
            System.out.println(a/b);
            else
            System.out.println("cant divide");
        }
        else {
            if(a!=0)
            System.out.println(b/a);
            else
            System.out.println("cant divide");
        }
        

    }
    
}
