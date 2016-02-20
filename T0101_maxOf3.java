package homeworks;

import java.util.Scanner;

public class T0101_maxOf3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Input 1st integer :");
        int a = scanner.nextInt();
       
        System.out.print("Input 2nd integer :");
        int b = scanner.nextInt();
       
        System.out.print("Input 3rd integer :");
        int c = scanner.nextInt();
       
        int gtInt = a;
        if (( b > gtInt ) && ( b > c)) {
            gtInt = b;
        } else if (( c > gtInt ) && ( c > b )) gtInt = c;
               
        System.out.println("greatest of 3 is : " + gtInt);
       
        scanner.close();
    }       

}
