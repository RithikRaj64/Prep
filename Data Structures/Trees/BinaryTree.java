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

class Solution {

    public static void main2(String[] args) {
        Scanner s = new Scanner(System.in);
        
        BST tree = new BST();
        
        int n = s.nextInt();
        int ch, x;
        
        while(n > 0) {
            ch = s.nextInt();
            
            if(ch == 1) {
                x = s.nextInt();
                tree.root = tree.insert(tree.root, x);
            }
            else if(ch == 2) {
                x = s.nextInt();
                tree.root = tree.delete(tree.root, x);
            }
            else if(ch == 3) {
                x = s.nextInt();
                System.out.println(tree.search(tree.root, x));
            }
            else if(ch == 4){
                tree.print(tree.root);
            }
            
            n--;
        }
    }
}

class BST {
    Node root;
    
    BST() {
        this.root = null;
    }
    
    Node insert(Node root, int val) {
        Node nn = new Node(val);
        
        if(root == null) {
            return nn;
        }
        
        if(val <= root.val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        
        return root;
    }
    
    boolean search(Node root, int x) {
        if(root == null) return false;
        
        if(root.val == x) return true;
        
        if(x < root.val) return search(root.left, x);
        
        return search(root.right, x);
    }
    
    Node delete(Node root, int x) {
        if(root == null) return root;
        
        if(x < root.val) {
            root.left = delete(root.left, x);
        }
        else if(x > root.val) {
            root.right = delete(root.right, x);
        }
        else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            
            Node temp = root;
            
            Node temp2 = root.right;
            
            while(temp2.left != null) {
                temp = temp2;
                temp2 = temp2.left;
            }
            
            if(temp != root) {
                temp.left = temp2.right;
            }
            else {
                temp.right = temp2.right;
            }
            
            root.val = temp2.val;
        }
        
        return root;
    }
    
    int min(Node root) {        
        int m = root.val;
        
        while(root.left != null) {
            m = root.left.val;
            root = root.left;
        }
        
        return m;
    }
    
    void print(Node root) {
        if(root != null) {
            System.out.print(root.val + ":");
            
            if(root.left != null) System.out.print("L:" + root.left.val + ",");
            if(root.right != null) System.out.print("R:" + root.right.val);
            
            System.out.println();
            
            print(root.left);
            print(root.right);
        }
    }
}