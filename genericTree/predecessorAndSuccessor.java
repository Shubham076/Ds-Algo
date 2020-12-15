import java.util.*;
public class predecessorAndSuccessor {
    static Node successor; 
    static Node Predecessor ;
    static int state;

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

    public static void predAndSucc(Node root , int data){
     if(state == 0){
         if(root.data == data){
             state = 1;
         }
         else{
             Predecessor = root;
         }
     }
     else if(state == 1){
        successor = root;
        state = 2;
     }
        for(Node child : root.children){
            predAndSucc(child, data);
        }

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, -50, -1, 60, -1, -1, 30, 70, -1, -80, 110, -1, -120, -1, -1, 90, -1, -1, 40, -100, -1, -1, -1};
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
        state = 0;
        Predecessor = null;
        successor = null;
        predAndSucc(root , -120);
        System.out.println(Predecessor != null ? Predecessor.data : null);
        System.out.println(successor != null ? successor.data : null);

    

    
    }
}
