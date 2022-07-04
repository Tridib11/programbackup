package com.tridib;

public class hp {
    public static void main(String[] args) {
        int mat[][] =  {{1,2},
                       {-9,-2}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[j][i]);

            }
            System.out.println();

        }
    }

}
