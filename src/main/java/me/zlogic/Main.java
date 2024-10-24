package me.zlogic;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        BST tree2 = new BST();

        tree.addNode(4);
        tree.addNode(6);
        tree.addNode(8);
        tree.addNode(5);
        tree.addNode(7);

        tree2.addNode(4);
        tree2.addNode(6);
        tree2.addNode(8);
        tree2.addNode(5);
        tree2.addNode(2);
        

        tree.preorderSearch();
        tree.isStrict();
        tree.treeHeight();
        tree.treeMax();
        tree.nodeAmount();
        tree.leafAmount(); 
        tree.nodeSumAmount();
        tree.nodeEvenSumAmount();

        System.out.println(tree.isIdentical(tree2));
    }
}