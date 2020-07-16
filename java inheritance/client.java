public class client {

    public static void main(String[] args) {
        

        // reference of the base class and instance of the base class
        base b = new base();

        System.out.println(b.d);
        b.func(); 

    // reference of the derived class and instance of the derived class
    System.out.println("\n-----------case 2---------------\n");
    derived d = new derived();
    System.out.println(d.d);
    d.func();
    System.out.println(d.s);


    // reference of base class and instance of child class
System.out.println("\n----------------Case 3----------------\n");
    base b1 = new derived();
    System.out.println(b1.d);
    b1.func();



    }



    
    
}