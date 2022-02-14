class P{
    int v = 10;
    void fun1(){
        System.out.println("Parent");
    }
}

class C extends P{
    int v = 20;
    int w = 30;
    void fun1(){
        System.out.println("Child");
    }

    void fun2(){
        System.out.println("child 2");
    }
}
/*
when we are writing the compiler controls
start reading from left;

during runtime conrols shifts to jvm and it sees the rhs

*/
class main{
    public static void main(String[] args){
        //memory is allocated to data members and func of parent
        P p = new P();
        System.out.println("Case 1: Reference of parent and object of parent ");
        System.out.println(p.v);
        p.fun1();
        System.out.println("\n------------------\n");

        /*
        reference of c and object of c 
        1: memory is allocated to data members of p and c class
        2: if both p and c class have same variable then ambiguity is resolved on bases of reference
        3: if both p and c class have same function then func of c is used why?
            when program executes first we check the blueprint jisko memory allocate huyi h
            if the blueprint contains the def of fun then we execute it, if not then we check parent
        */
        p = new C();
        System.out.println("Case 2: Reference of parent and object of child ");
        System.out.println(p.v);

        // if I also want to use the value in child class I can use typecasting
        System.out.println(((C)p).v);

        p.fun1();
        ((C)p).fun2(); //typecasted
        System.out.println("\n------------------\n");

        /*
            in this case also collisons are resolved as above
            but we can access the other by typecasting
        */
        C c = new C();
        System.out.println("Case 3: Reference of child and object of child is created ");
        System.out.println(c.v);
        p.fun1();

        /*
        as we know during writing compiler sees throught lhs
        as ref is c we can access data members and func of c
        but during runtime memory is allocated to parent data members
        so it will through runtime error.
        and compile time errors are always better than runtime errors
        
        c = new P(); //not allowed
        System.out.println("Case 4: Reference of child and object of par is created ");
        System.out.println(c.v);
        c.fun2();
        */

    }
}