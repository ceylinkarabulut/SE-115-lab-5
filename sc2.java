import java.util.Scanner;
public class sc2 {
    public static long pwr(long base, int power) {
        if (power ==0){
            return 1;
            }
        else{
            return base * pwr(base,power-1);
        }
    }
    public static void main(String[]args){
        System.out.print("Enter a base number: ");
        Scanner sc= new Scanner(System.in);
        int b = sc.nextInt();
        System.out.print("Enter power of the base number: ");
        int p = sc.nextInt();
        long result= pwr(b,p);
        System.out.println("Your result is: "+ result);
    }
}
