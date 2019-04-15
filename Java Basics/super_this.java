
class A {
    int a = 5;

    void print() {
        System.out.println("Hello A");
    }
}

class B extends A {
    int a;

    A(int a){
        this.a=a;
    }

    void print() {
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println("Hello B");
    }
}

public class super_this {

    public static void main(String args[]) {
        B ob = new B(7);
        ob.print();
    }
}