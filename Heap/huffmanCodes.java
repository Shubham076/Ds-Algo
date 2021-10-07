import java.util.PriorityQueue;
class huffmanCodes{
    static class Node implements Comparable<Node>{
        double data;
        char c;
        Node left;
        Node right;

        public Node(char c , double data , Node left , Node right){
            this.data = data;
            this.c = c;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node o){
            return (int)(this.data - o.data);
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

    public static Node generateTree(char[] arr , double[] freq){
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
        char[] arr = {'a' , 'b' , 'c' , 'd' , 'e' , 'f', 'g'};
        double[] freq = {0.07, 0.03, 0.09, 0.05, 0.06, 0.20, 0.30};

        Node root = generateTree(arr, freq);
        printCodes(root, "");   
    }
}