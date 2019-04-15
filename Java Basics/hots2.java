import java.util.*;
import java.io.*;

class hots2 {

    public int f1(int a, int b) {
        int c = f2(a, b);
        return (c);
    }

    public int f2(int x, int y) {
        int m = x * y;
        m += (x + y);
        return (m);
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        hots2 obj = new hots2();
        int results = obj.f1(a, b);
        System.out.println(results);

    }
}