/* 
PROBLEM:

Write a program to print the following triangle of binary digits

1
101
10001
1000001
100000001

*/


public class TriangleOfBinaryDigits {
    public static void main (String[] args) {
        String k="1", l="", s="1";
        int m = 0;
        int n = 5;
        for (int i=0; i<n; i++) {
            for (int j=1; j<m; j++) {
                l += "0";
            }
            System.out.println(k + l + s +"\n");
            l = "";
            m += 2;
        }
    }
}