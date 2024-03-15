/*
 Write a function named eval that returns the value of the polynomial anx^n
 + an-1x^n-1 + ... + a1x^1 + a0.

 If you are programming in Java or C#, the function signature is
double eval(double x, int[ ] a)

If you are programming in C or C++, the function signature is
double eval(double x, int a[ ], int len) where len is the number of elements in the array
Examples: 
 */

public class polynomial {
    static double eval(int[] a, double x){
        double res = 0, n = a.length;
        for(int i = 0; i < n; i++){
            res += (a[i] * pow(x, i));
        }
        
        return res;
    }

    static double pow(double x, int idx){
        if(idx == 0)
            return 1;

        while(idx-- > 1){
            x *= x;
        }

        return x;
    }
    public static void main(String[] args) {
        System.out.println(eval(new int[]{0, 1, 2, 3, 4}, 1.0));
        System.out.println(eval(new int[]{3, 2, 1}, 3.0));
        System.out.println(eval(new int[]{3, -2, -1}, 2.0));
        System.out.println(eval(new int[]{3, 2, 1}, -3.0));
        System.out.println(eval(new int[]{3, 2}, 2.0));
        System.out.println(eval(new int[]{4, 0, 9}, 2.0));
        System.out.println(eval(new int[]{10}, 2.0));
        System.out.println(eval(new int[]{0, 1}, 10.0));
    }
}
