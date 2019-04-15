
class A {
    void print() {
        System.out.println("Hello A");
    }
}

class B extends A {
    void printag() {
        System.out.println("Hello B");
    }
}

public class inheritance {

    public static void main(String args[]) {
        B ob = new B();
        ob.print();
        ob.printag();
    }
}