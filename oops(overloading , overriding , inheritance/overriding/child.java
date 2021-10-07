class child extends Parent{
    String s = "Child";
    static void print(){
        System.out.println("Static of child is called" + " ");
    }
    void display(){
        System.out.println("Non - static of child is called");
    }
}