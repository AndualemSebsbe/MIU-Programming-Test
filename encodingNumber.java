import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodingNumber {
    static int[] encodeNumber(int n){
        if(n <= 1)
            return null;

        List<Integer> primeFactors = new ArrayList<>();

        int half = n / 2;
        for(int i = 2; i <= half; i++){
            while(n % i == 0){
                primeFactors.add(i);
                n /= i;
            }
        }

        if(n > 1)
            primeFactors.add(n);

        int[] res = new int[primeFactors.size()];
        for(int i = 0; i < primeFactors.size(); i++)
            res[i] = primeFactors.get(i);
        
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(17)));
    }
}
