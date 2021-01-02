import java.util.*;
class Main{

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


    // algo for constructing generic tree
    // create a stack
    // if arr[i] = -1 means it has no children pop out of the stack
    // if arr[i] != -1 ans stack is not empty
    //  then add this node as a child to top node of the stack and also push this node to the stack;
    // if arr[i] != -1 and stack is empty make this node as root node and push it to the stack.


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

        display(root);
    
    }
}