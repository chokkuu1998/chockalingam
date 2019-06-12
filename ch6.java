public class BST {

    private static class Node {
        private int data;
        private Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }
