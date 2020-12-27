package DataStructures.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private Node root;

    public BST() {
        super();
        this.root = null;
    }

    private Node createNode(int data) {
        return new Node(data);
    }

    private void insertNode(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node root, int data) {
        if (root == null)
            return createNode(data);
        else if (data < root.data)
            root.lc = insertNode(root.lc, data);
        else if (data > root.data)
            root.rc = insertNode(root.rc, data);
        else
            return root;
        
        return root;
    }

    private void searchNode(int data) {
        Node node = searchNode(root, data);
    }

    private Node searchNode(Node root, int data) {
        if (root == null)
            return null;
        else if (root.data == data)
            return root;
        else if (data < root.data)
            return searchNode(root.lc, data);
        else
            return searchNode(root.rc, data);
    }

    private void deleteNode(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node root, int data) {
        if (root == null)
            return null;
        else if (data < root.data)
            root.lc = deleteNode(root.lc, data);
        else if (data > root.data)
            root.rc = deleteNode(root.rc, data);
        else {
            if (root.lc == null && root.rc == null)
                root = null;
            else if (root.lc == null)
                root.rc = root.rc.rc;
            else if (root.rc == null)
                root.lc = root.lc.lc;
            else {
                Node inorderSuccessor = getInorderSuccessor(root.rc);
                root.data = inorderSuccessor.data;
                root.rc = deleteNode(root.rc, inorderSuccessor.data);
            }
        }
        return root;
    }

    private Node getInorderSuccessor(Node root) {
        while (root.lc != null)
            root = root.lc;
        return root;
    }

    private void mirrorTree() {
        root = mirrorTree(root);
    }

    private Node mirrorTree(Node root) {
        if (root == null)
            return root;
        
        Node left = mirrorTree(root.lc);
        Node right = mirrorTree(root.rc);

        root.lc = right;
        root.rc = left;

        return root;
    }

    private boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;
        else if (root.data < min || root.data > max)
            return false;
        
        else
            return (isBST(root.lc, min, root.data - 1) && isBST(root.rc, root.data + 1, max));
    }

    private void levelOrderedTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.lc != null)
                queue.add(node.lc);
            if (node.rc != null)
                queue.add(node.rc);
        }
    }

    private void boundaryTraversal(Node root) {
        if (root == null)
            return;
        else if (root.lc == null && root.rc == null) {
            System.out.println(root.data);
            return;
        } else {
            printLeftBoundary(root);
            printLeafs(root);
            printRightBoundary(root);
        }
    }

    private void printLeftBoundary(Node root) {
        if (root.lc == null)
            return;
        else {
            System.out.print(root.data + " ");
            printLeftBoundary(root.lc);
        }
    }

    private void printLeafs(Node root) {
        if (root != null) {
            printLeafs(root.lc);
            printLeafs(root.rc);

            if (root.lc == null & root.rc == null)
                System.out.print(root.data + " ");
        }
    }

    private void printRightBoundary(Node root) {
        if (root.rc == null)
            return;
        else {
            printLeftBoundary(root.rc);
            System.out.print(root.data + " ");
        }
    }

    private int height(Node root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = height(root.lc);
            int rightHeight = height(root.rc);

            return (leftHeight > rightHeight)? (leftHeight + 1): (rightHeight + 1);
        }
    }

    private int countLeafs(Node root) {
        return (root == null)? 0: ((root.lc == null && root.rc == null)? 1: (countLeafs(root.lc) + countLeafs(root.rc)));
    }

    private int countLevelTwoNodes(Node root) {
        return (root == null)? 0: ((root.lc != null && root.rc != null)? 1: (countLeafs(root.lc) + countLeafs(root.rc)));
    }

    private int countLevelOneNodes(Node root) {
        return ((root.lc != null && root.rc != null) && (root == null))? 0: ((root.lc != null || root.rc != null)? 1: (countLeafs(root.lc) + countLeafs(root.rc)));
    }
}
