class Main{
    public static void main(String[] args){
        System.out.println("Case 1: when instance and reference both are of parent");
        Parent p1 = new Parent();
        p1.print();
        p1.display();
        System.out.println("Data Member: " + p1.s);

        System.out.println("-------------------------");

        System.out.println("Case 2: when instance and reference both are of child");
        child c1 = new child();
        c1.print();
        c1.display();
        System.out.println("Data Member: " + p1.s);


        System.out.println("-------------------------");

        System.out.println("Case 3: when reference is of parent and instance is of child");
        Parent p2 = new child();
        p2.print();
        p2.display();
        System.out.println("Data Member: " + p1.s);
    }
}