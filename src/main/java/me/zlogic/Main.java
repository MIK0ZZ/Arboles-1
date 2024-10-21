package me.zlogic;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.addNode(4);
        tree.addNode(6);
        tree.addNode(8);
        tree.addNode(5);
        tree.addNode(7);
        tree.addNode(20);
        tree.addNode(40);
        tree.addNode(100);
        tree.addNode(3);
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(0);
        tree.addNode(9);

        tree.preorderSearch();
        tree.isStrict();
        tree.treeHeight();
        tree.treeMax();
        tree.nodeAmount();
        tree.leafAmount(); 
        tree.nodeSumAmount();
        tree.nodeEvenSumAmount();
    }
}