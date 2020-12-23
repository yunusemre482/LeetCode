import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.IntStream;

public class NextGreaterElement3 {
	//Given a positive integer n, find the smallest integer
	// which has exactly the same digits existing in the integer n
	// and is greater in value than n. If no such positive integer exists, return -1.
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(12));
    }

    public static int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();//number converted to digit array to sort
        int i,len=digits.length;
        for ( i=len-1; i >0 ; i--) {
            if(digits[i]>digits[i-1]){
                Arrays.sort(digits,i,digits.length);
                System.out.println(digits);
                for (int j = i+1; j <len ; j++) {
                    if(digits[j]>digits[i-1]){
                        char temp=digits[j];
                        digits[j]=digits[i-1];
                        digits[i-1]=temp;
                        break;
                    }
                    return Integer.parseInt(String.valueOf(digits.toString()));
                }
            }

        }
        return -1;

    }
}
