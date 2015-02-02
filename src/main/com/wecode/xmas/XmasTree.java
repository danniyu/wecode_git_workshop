package com.wecode.xmas;

public class XmasTree {

    private String xmasTree;

    public XmasTree(int n) {
        xmasTree = makeXmasTree(n);
    }

    public String getXmasTree() {
        return xmasTree;
    }

    private String makeXmasTree(int n) {
        String tree = "";
        for (int i = 0; i < n; i++) {
            tree += makeTriangle(i + 1, n);
        }
        return tree;
    }

    private String makeTriangle(int n, int max){
        String triangle = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max-i-1; j++) {
                triangle += " ";
            }

            for (int j = 0; j < i*2+1; j++) {
                triangle += "X";
            }

            triangle += "\n";
        }
        return triangle;
    }
}