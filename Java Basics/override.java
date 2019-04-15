
class A {
    void print() {
        System.out.println("Hello A");
    }
}

class B extends A {
    void print() {
        System.out.println("Hello B");
    }
}

public class override {

    public static void main(String args[]) {
        B ob = new B();
        ob.print();
    }
}