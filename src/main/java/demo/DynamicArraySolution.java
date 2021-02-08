package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DynamicArraySolution {

    List<Integer> seq = new ArrayList<>();
    List<List<Integer>> seqList = new ArrayList<>();
    int lastAns = 0;

    public DynamicArraySolution(int n) {
        for (int i = 0; i < n; i++) {
            seq = new ArrayList<>();
            seqList.add(seq);
        }
    }

    void appendArray(int x, int y, int n) {
        int rowIndex = (x ^ lastAns) % n;
        List<Integer> integerList = seqList.get(rowIndex);
        integerList.add(y);
    }

    private void assignValue(int x, int y, int n) {
        int colIndex;
        int rowIndex = (x ^ lastAns) % n;
        List<Integer> integerList = seqList.get(rowIndex);
        try {
            colIndex = y % integerList.size();
            lastAns = integerList.get(colIndex);
            out.println("\n");
            out.println(lastAns);
        } catch (Exception e) {
            out.println("\nInput caused Arithmetic Exception, value cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        try {
            int n = sc.nextInt();
            int q = sc.nextInt();
        DynamicArraySolution da = new DynamicArraySolution(n);
        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (queryType == 1) {
                da.appendArray(x, y, n);
            } else {
                da.assignValue(x, y, n);
            }

        }
        sc.close();
        } catch (Exception e) {
            out.println("\nWrong input, please give two space-separated integers");
        }
    }
}
