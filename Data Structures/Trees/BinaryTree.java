public class BinaryTree {
    public static void main(String[] args) {
        Tree t = new Tree();

        int arr[] = {1, 2, 3, 4, 5};

        t.root = t.create(arr, 0);

        t.inOrder(t.root);
    }
}

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        this.root = null;
    }

    Node create(int arr[], int i) {
        Node nn = null;

        if(i < arr.length) {
            nn = new Node(arr[i]);
            
            nn.left = create(arr, 2*i+1);
            nn.right = create(arr, 2*i+2);
        }

        return nn;
    }

    void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.val + " -> ");
            inOrder(root.right);
        }
    }
}
