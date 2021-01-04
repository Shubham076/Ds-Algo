import java.util.*;
public class maximumsumSubtree {

    static Node mn; //maximum node
    static int ms;  // maximum sum
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

    public static int maximumSumSubTree(Node root){
        int sum = root.data;
        for(Node child : root.children){
            sum += maximumSumSubTree(child);
        }

        if(sum > ms){
            ms = sum;
            mn = root;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, -50, -1, 60, -1, -1, 30, -70 ,-1, 80, -1, 90, -1, -1, 40, -100, -1, -1, -1};
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
        maximumSumSubTree(root);
        System.out.println("Node "+ mn.data+" = "+ms);
    
    }
}
