import java.util.*;
public class distanceBetweenNodes {
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

    static ArrayList<Integer> printPath(Node root , int data){
        if(root.data == data){
            ArrayList<Integer> ans =  new ArrayList<>();
            ans.add(root.data);
            return ans;
        }
        
        for(Node child : root.children){
            ArrayList<Integer> path = printPath(child, data);
            if(path.size() > 0){
                path.add(root.data);
                return path;
            }
        }

        return new ArrayList<>();
    }

    static int distanceBwNodes(Node root , int d1 , int d2){
        ArrayList<Integer> p1 = printPath(root, d1);
        ArrayList<Integer> p2 = printPath(root, d2);

        int i = p1.size() - 1;
        int j = p2.size() - 1;
        while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)){
            i--;
            j--;
        }

        i++;
        j++;

        return i + j;


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

        display(root);
        System.out.println();
        System.out.println(distanceBwNodes(root, 50 , 60));
    
    }
}
