import java.util.*;

public class LevelOrderLineWiseZigZag {
  static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    public Node(int data) {
      this.data = data;

    }

    static void LevelOrder(Node node) {
      Stack<Node> stack = new Stack<>();
      stack.add(node);
      Stack<Node> cstack = new Stack<>();
      int level = 0;

      while (stack.size() > 0) {
        node = stack.pop();
        System.out.print(node.data + " ");

        if (level % 2 == 0) {
          for (int i = 0; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            cstack.push(child);
          }
        } else {
          for (int i = node.children.size() - 1; i >= 0; i--) {
            Node child = node.children.get(i);
            cstack.push(child);
          }
        }

        if (stack.size() == 0) {
          stack = cstack;
          cstack = new Stack<>();
          level++;
          System.out.println();
        }
      }
    }
    public static void main(String[] args) {

      int[] arr = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
      Node root = null;
      Stack<Node> s = new Stack<>();


      for (int i = 0 ; i < arr.length; i++) {
        if (arr[i] == -1) {
          s.pop();
        } else {
          Node n = new Node(arr[i]);
          if (s.size() > 0) {
            s.peek().children.add(n);
          } else {
            root = n;
          }

          s.push(n);
        }
      }

      LevelOrder(root);

    }
  }
}
