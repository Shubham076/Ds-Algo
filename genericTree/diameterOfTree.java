import java.util.*;
public class diameterOfTree {
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
    static int d = 0;  //diameter

    public static int DiameterOfTree(Node root){
        int dh = -1;  // deepest child height 
        int sdh = - 1; // second deepext child height

        for(Node child : root.children){
            int h = DiameterOfTree(child);
            if(h > dh){
                sdh = dh;
                dh = h;
            }else if(h > sdh){
                sdh = h;
            }
        }

        if(dh + sdh + 2 > d){
            d = dh + sdh + 2;
        }
        return dh + 1;


    }

    public static void main(String[] args) {

        int[] arr = {10, 20, -50, -1, 60, -1, -1, 30, -70, -1, 80, -1, 90, -1, -1, 40, -100, -1, -1, -1};
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
        DiameterOfTree(root);
        System.out.println("Diameter of tree is "+d);
    
    }
}
