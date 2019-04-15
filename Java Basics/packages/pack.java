package p1;

class sum {
    public void m1() {
        System.out.println("in sum class");
    }
}

public class pack {

    public static void main(String args[]) {
        sum obj = new sum();
        obj.m1();
    }
}
