import java.util.Scanner;

import Classes.LinearAlgebra;
import Classes.Matrix;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as dimensões da matriz");
        Matrix A = new Matrix(sc.nextInt(), sc.nextInt(), null);
        System.out.println("Digite as dimensões da matriz B: ");
        Matrix B = new Matrix(sc.nextInt(),sc.nextInt(),  null);
        A.matrix = new int[A.rows][A.cols];
        B.matrix = new int[B.rows][B.cols];
        A.construirMatrix(A);
        A.printMatrix(A);
       // A.matrix = LinearAlgebra.transpose(A);// só é possivel se a Matriz for quadrada
        A.printMatrix(A);
        B.construirMatrix(B);
        B.printMatrix(B);
       // B.matrix = LinearAlgebra.transpose(B);
        B.printMatrix(B);
        LinearAlgebra Mult = new LinearAlgebra();
        Matrix c =  Mult.dot(A,B);
        
        Mult.printMatrix(c);
        
        
        sc.close();
    }
}
