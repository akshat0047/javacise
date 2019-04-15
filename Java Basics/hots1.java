class hots1 {
    public static void main(String args[]) {
        double height = 5.5;
        if (height-- >= 5.0)
            System.out.println("tall");
        if (--height >= 4.0)
            System.out.println("average");
        if (height-- >= 3.0)
            System.out.println("short");
        else
            System.out.println("very short");
    }
}