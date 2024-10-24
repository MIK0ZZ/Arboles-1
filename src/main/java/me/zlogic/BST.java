package me.zlogic;

public class BST {
    Node root;

    public BST() {root = null;}

    public void addNode(int _element) {this.root = addNodeRec(this.root, _element);}

    private Node addNodeRec(Node _current, int _element) {
        if(_current == null) {
            return new Node(_element);
        }

        if(_element < _current.value) {
            _current.left = addNodeRec(_current.left, _element);
        } else if(_element > _current.value) {
            _current.right = addNodeRec(_current.right, _element);
        } else {
            return _current;
        }
        return _current;
    }

    public void preorderSearch() {
        preorderSearchRecursive(this.root);
    }

    private void preorderSearchRecursive(Node _current) {
        if(_current != null) {
            System.out.println(_current.value);
            preorderSearchRecursive(_current.left);
            preorderSearchRecursive(_current.right);
        }
    }

    // 1
    public void isStrict() {
        System.out.println(isStrictRecursive(this.root));
    }

    private boolean isStrictRecursive(Node _current) {
        if(_current == null) {
            return true;
        }

        if((_current.left != null && _current.right != null) || (_current.left == null && _current.right == null)) {
            return false;
        }

        return (isStrictRecursive(_current.left) && isStrictRecursive(_current.right));
       
    }

    //2
    public void treeHeight() {
        System.out.println(treeHeightRecursive(this.root));
    }

    private int treeHeightRecursive(Node _current) {
        if(_current == null) {
            return -1;
        }

        int left = treeHeightRecursive(_current.left);
        int right = treeHeightRecursive(_current.right);

        if (left > right) {
            return left + 1;
        } else { return right + 1; }

    }

    //3
    public void treeMax() {
        System.out.println(treeMaxRecursive(this.root));
    }

    private int treeMaxRecursive(Node _current) {
        if(_current == null) {
            return -1;
        }
        // Antes lo tenía para mirar solo a la derecha, pero lo he cambiado porque tomamos que no es un BST sino un BT. xd
        int max = _current.value;
        int maxR = treeMaxRecursive(_current.right);
        int maxL = treeMaxRecursive(_current.left);
        return Math.max(Math.max(maxR, maxL), max);
    }

    //4
    public void nodeAmount() {
        System.out.println(nodeAmountRec(this.root));
    }

    private int nodeAmountRec(Node _current) {
        if(_current == null) {
            return 0;
        }

        int left = nodeAmountRec(_current.left);
        int right = nodeAmountRec(_current.right);

        return 1 + left + right;
    }

    //5
    public boolean isIdentical(BST _other){
        return isIdenticalRec(this.root, _other.root);
    }

    private boolean isIdenticalRec(Node _current, Node _otherCurrent) {
        if(_current == null && _otherCurrent == null) {
            return true;
        }

        if(_current == null || _otherCurrent == null) {
            return false;
        }

        return (_current.value == _otherCurrent.value) && isIdenticalRec(_current.left, _otherCurrent.left) && isIdenticalRec(_current.right, _otherCurrent.right);
    }

    //6
    public void leafAmount() {
        System.out.println(leafAmountRec(this.root));
    }

    private int leafAmountRec(Node _current) {
        if(_current == null) {
            return 0;
        }

        if(_current.left == null && _current.right == null) {
            return 1;
        }

        return leafAmountRec(_current.left) + leafAmountRec(_current.right);
    }

    //7
    public void nodeSumAmount() {
        System.out.println(nodeSumAmountRec(this.root));
    }

    private int nodeSumAmountRec(Node _current) {
        if(_current == null) {
            return 0;
        }

        return _current.value + nodeSumAmountRec(_current.left) + nodeSumAmountRec(_current.right);
    }

    //8
    public void nodeEvenSumAmount() {
        System.out.println(nodeEvenSumAmountRec(this.root));
    }

    private int nodeEvenSumAmountRec(Node _current) {
        if(_current == null) {
            return 0;
        }

        return _current.value % 2 == 0 ? _current.value + nodeEvenSumAmountRec(_current.left) + nodeEvenSumAmountRec(_current.right) : 0;
    }
}