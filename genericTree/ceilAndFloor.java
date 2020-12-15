
// ceil smallest among larger
// floor largest among smaller
import java.util.*;
public class ceilAndFloor {
    static int ceil; 
    static int floor ;

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

    public static void findCeilAndFloor(Node root , int data){
        if(root.data > data){
            if(root.data < ceil){
                ceil = root.data;
            }
        }
        if(root.data < data){
            if(root.data > floor){
                floor = root.data;
            }
        }
     
        for(Node child : root.children){
            findCeilAndFloor(child , data);
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
        ceil = Integer.MAX_VALUE;
        floor = Integer.MIN_VALUE;
        
        findCeilAndFloor(root , 70);
        System.out.println("Ceil is: "+ceil);
        System.out.println("Floor is:"+ floor);

    

    
    }
}
