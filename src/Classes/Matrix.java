package Classes;

import java.util.Scanner;


public class Matrix {
    public int rows;
    public int cols;
    public int[][] matrix = new int[rows][cols];

    public Matrix(){ //contrutor vazio para poder fazer instancia sem precisar fazer parametos para o construtor.
    
    }

    public Matrix(int rows, int cols, int[][] matrix) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }

    public void set(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int get(int i, int j) {
        return matrix[i][j];
    }

    public void construirMatrix(Matrix A) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.rows; i++) {
            for (int j = 0; j < A.cols; j++) {
                System.out.println("digite o valor de a" + i + j);
                A.matrix[i][j] = sc.nextInt();
            }
        }
      
    

    }
    public void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                if (j == matrix.cols - 1) {
                    System.out.println(matrix.matrix[i][j] + "|");
                    if (i == matrix.rows - 1) {
                        System.out.print("\n");
                    }
                } else if (j == 0) {
                    System.out.print("|" + matrix.matrix[i][j] + " ");
                } else {
                    System.out.print(matrix.matrix[i][j] + " ");
                }
            }
        }
    }
    
}
