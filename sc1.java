import java.util.Scanner;
public class sc1{
    public static int sumDigits(int n){
        if(n<0){
            n=n*(-1);
        }
        if(n<10){
            return n;
        }
        else{
           return (n%10)+sumDigits(n/10);
        }
    }
    public static void main(String[]args){
        System.out.print("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int result=sumDigits(x);
        System.out.println(result);
    }
}