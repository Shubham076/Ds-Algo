import java.util.*;
public class prePostIterative {

    static class Pair{
        Node n;
        int state;
        public Pair(Node n , int state){
            this.n = n;
            this.state = state;
        }
    }
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        }
    }

    static void display(Node root){
        String s = root.data+" =>";

        for(Node child : root.children){
            s +=  " " + child.data+" ";
        }

        System.out.println(s);

        for(Node child : root.children){
            display(child);
        }
    }

        //   algo
    // make a stack and new pair (having two data members node = root and state = -1) and push it to the stack
    // iterate till stack is empty
    // get the top of stack(lets say top pair =  p)
    // if state == -1 means we are at pre order print  and increase state of the p by one
    // if state == p.node.children.size means we are at post order print and pop p out of the stack 
    //  otherwise get the node out of the children of p of index p.state
    // make a new pair of the node and push it to the stack and increase the state of p by one


    public static void prePostOrder(Node root){
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root , -1));
        String pre = "";
        String post = "";

        while(s.size() > 0){
            Pair p = s.peek();
            if(p.state == -1){
                pre += p.n.data+" ";
                p.state++;
            }
            else if(p.state == p.n.children.size()){
                post += p.n.data+ " ";
                s.pop();
            }
            else{
                Pair cp = new Pair(p.n.children.get(p.state) , -1);
                s.push(cp);   //child pair
                p.state++;
            }
        }

        System.out.println("PreOrder :"+pre);
        System.out.println("PostOrder :"+post);

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
        Node root = null;
        Stack<Node> s = new Stack<>();


        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == -1){
                s.pop();
            }
            else{
                Node n = new Node(arr[i]);
                if(s.size() > 0){
                    s.peek().children.add(n);
                }
                else{
                    root = n;
                }

                s.push(n);
            }
        }

        // display(root);
        prePostOrder(root);
    
    }
} 

