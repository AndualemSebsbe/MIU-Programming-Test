import java.util.HashSet;
import java.util.Set;

/*
 A number n is vesuvian if it is the sum of two different pairs of squares. For example, 50 is vesuvian because 50 == 25 + 25 and 1 + 49. The numbers 65 (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 789 of the first 10,000 integers are vesuvian.

 Write a function named isVesuvian that returns 1 if its parameter is a vesuvian number, otherwise it returns 0. 

Hint: be sure to verify that your function detects that 50 is a vesuvian number! 
 */

public class vesuvian {
    // SOLUTION 1:
    /*
         static int isVesuvian(int n){
        int num = 1;
        int countPairs = 0;
        while(num * num <= n / 2){
            int firstSquare = num * num;
            int secondSquare = n - firstSquare;
            boolean isSecondSquare = false;
            int i = 1;
            while(i * i <= secondSquare){
                if(i * i == secondSquare){
                    isSecondSquare = true;
                    break;
                }

                i += 1;
            }

            if(isSecondSquare)
                countPairs += 1;
            if(countPairs == 2)
                return 1;
            
            num += 1;
        }

        return 0;
    }
     */

    // SOLUTION 2:
    static int isVesuvian(int n){
        int countPairs = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i * i < n; i++){
            int square = i * i;
            if(set.contains(square) || (square == n - square))
                countPairs += 1;

            if(countPairs == 2)
                return 1;
            set.add(n - square);
        }

        return 0;
    }
    public static void main(String[] args) {
        // System.out.println(isVesuvian(50));
        // System.out.println(isVesuvian(65));
        // System.out.println(isVesuvian(85));
        // System.out.println(isVesuvian(100));
        // System.out.println(isVesuvian(52));
        int count = 0;
        for(int i = 1; i <= 10000; i++){
            if(isVesuvian(i) == 1)
                count += 1;
        }
        System.out.println(count);
    }
}
