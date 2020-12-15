import java.util.*;
class multisolver{

    static int size;
    static int min;
    static int max;
    static int height;


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

    public static void multiSolver(Node root , int depth){
        size += 1;
        min = Math.min(min , root.data);
        max = Math.max(max , root.data);
        height = Math.max(height , depth);
        
        for(Node child : root.children){
            multiSolver(child, depth + 1);
        }

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
        size = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        height = 0;
        multiSolver(root , 0);

        System.out.println("Size : " +size);
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);
        System.out.println("Height : " +height);

    
    }
}