package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = num;
        int temp = num;
        int counter = 0;

        while(num / 10 !=0) {
          num = num / 10;
          counter++;
        }
        int arr[] = new arr[counter];
        for(int i = 0; i < counter; i++){
          arr[i] = a % 10;
          a = a/10;
        }
        int fnum=0;
        for (int i = 0; i < counter; i++) {
          fnum = fnum * 10;
          fnum += arr[i];
        }
        if(temp == fnum) {
          System.out.println("Palindrome: true");
        } else {
          System.out.println("Pslindrome: false");
        }

    }
}
