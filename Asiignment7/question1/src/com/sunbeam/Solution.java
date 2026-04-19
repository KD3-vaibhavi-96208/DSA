package com.sunbeam;

class Tree {
    int val;
    Tree left;
    Tree right;

    Tree() {}

    Tree(int val) {
        this.val = val;
    }

    Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



class Solution {
    Tree prev = null;

    public boolean isValidBST(Tree root) {
        if (root == null)
            return true;

        if (!isValidBST(root.left))
            return false;

        if (prev != null && root.val <= prev.val)
            return false;

        prev = root;

        return isValidBST(root.right);
    }
}