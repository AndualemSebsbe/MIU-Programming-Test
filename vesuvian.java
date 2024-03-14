import java.util.HashSet;
import java.util.Set;

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
