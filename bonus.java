import java.util.Scanner;

public class bonus {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+ fib(n-2);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to start the fibonacci sequence: ");
        int x = sc.nextInt();
        System.out.println("The final number is: "+ fib(x));
    }
}
