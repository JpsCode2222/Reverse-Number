import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int no  = sc.nextInt();
        int rem,rev = 0;
        while(no > 0){
            rev = no % 10;
            System.out.print(rev);
            no = no / 10;
        }
    }
}