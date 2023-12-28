/*
PROBLEM;

Write a program to find the sum of series
 
 1 + x + x^2 + x^3 + ......

 */

public class SumOfSeries {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        int sum = 0;
        int x = 2;
        while (i<n){
            sum += Math.pow(x,i);
            i++;
        }
        System.out.println("sum of series 1+x+x^2+x^2+x^3+.... " + sum);
    }
}
