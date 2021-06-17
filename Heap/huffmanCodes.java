import java.util.PriorityQueue;
class huffmanCode{
    static class Node implements Comparable<Node>{
        int data;
        char c;
        Node left;
        Node right;

        public Node(char c , int data , Node left , Node right){
            this.data = data;
            this.c = c;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node o){
            return this.data - o.data;
        }
    }

   public static void printCodes(Node root , String s){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null && Character.isLetter(root.c)){
            System.out.println(root.c + " " + s);
            return;
        }

        printCodes(root.left, s + "0");
        printCodes(root.right, s + "1");
    }

    public static Node generateTree(char[] arr , int[] freq){
        PriorityQueue<Node> q = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            Node n = new Node(arr[i], freq[i], null, null);
            q.add(n);
        }

        while(q.size() > 1){
            Node first = q.remove();
            Node second = q.remove();
            Node n = new Node('-' , first.data + second.data , first , second);
            q.add(n);
        }
        return q.peek();
    }

    public static void main(String[] args){
        char[] arr = {'a' , 'b' , 'c' , 'd' , 'e' , 'f'};
        int[] freq = {5, 9, 12, 13, 16, 45};

        Node root = generateTree(arr, freq);
        printCodes(root, "");   
    }
}