package in.ineuron.patterns;

import java.util.Scanner;

public class Pattern_5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number::");
        int n = sc.nextInt();
        
        printPatternSideBySide(n);
        
        sc.close();
    }
    
    public static void printPatternSideBySide(int n) {
        String[] iPattern = generateI(n);
        String[] nPattern = generateN(n);
        String[] ePattern = generateE(n);
        String[] uPattern = generateU(n);
        String[] rPattern = generateR(n);
        String[] oPattern = generateO(n);
        
        for (int row = 0; row < n; row++) {
            System.out.print(iPattern[row] + " ");
            System.out.print(nPattern[row] + " ");
            System.out.print(ePattern[row] + " ");
            System.out.print(uPattern[row] + " ");
            System.out.print(rPattern[row] + " ");
            System.out.print(oPattern[row] + " ");
            System.out.print(nPattern[row] + " ");
            System.out.println();
        }
    }
    
    public static String[] generateI(int n) {
        String[] pattern = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            pattern[i] = row.toString();
        }
        return pattern;
    }

    public static String[] generateN(int n) {
        String[] pattern = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            pattern[i] = row.toString();
        }
        return pattern;
    }

    public static String[] generateE(int n) {
        String[] pattern = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            pattern[i] = row.toString();
        }
        return pattern;
    }

    public static String[] generateU(int n) {
        String[] pattern = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i == n - 1 && j > 0 && j < n - 1)) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            pattern[i] = row.toString();
        }
        return pattern;
    }

    public static String[] generateR(int n) {
        String[] pattern = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2) || (i - j == n / 2 - 1 && i >= n / 2)) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            pattern[i] = row.toString();
        }
        return pattern;
    }

    public static String[] generateO(int n) {
        String[] pattern = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) && (j > 0 && j < n - 1) ||
                    (j == 0 || j == n - 1) && (i > 0 && i < n - 1)) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            pattern[i] = row.toString();
        }
        return pattern;
    }
}
