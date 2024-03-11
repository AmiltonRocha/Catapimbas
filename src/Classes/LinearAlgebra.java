package Classes;

public class LinearAlgebra extends Matrix{
        
    // transpose
    public static int[][] transpose(Matrix matrix) {
        int aux;
        aux = matrix.rows;
        matrix.rows = matrix.cols;
        matrix.cols = aux;
        int[][] b = new int[matrix.rows][matrix.cols];

        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                b[i][j] = matrix.matrix[j][i];
            }
        }
        return b;
    }

    public static int[][] transpose(Vector vector) {
        int aux;
        aux = vector.dim;
        vector.dim = vector.t;
        vector.t = aux;
        int[][] b = new int[vector.dim][vector.t];
        for (int i = 0; i < vector.dim; i++) {
            b[i][0] = vector.elements[0][i];
        }
        return b;
    }

    // sum
    public static int[][] sum(Matrix matrix, Matrix matrix2) {
        int[][] b = new int[matrix.rows][matrix.cols];
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; i < matrix.cols; j++) {
                b[i][j] = matrix.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        return b;
    }

    public static int[][] sum(Vector vector, Vector vector2) {
        int[][] b = new int[vector.dim][vector.t];
        for (int i = 0; i < vector.dim; i++) {
            b[i][vector.t] = vector.elements[i][vector.t] + vector2.elements[i][vector.t];

        }
        return b;
    }

    // times

    // times por inteiros
    public static int[][] times(int x, Matrix matrix) {
        int[][] b = new int[matrix.cols][matrix.rows];
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; i < matrix.cols; j++) {
                b[i][j] = matrix.matrix[i][j] * x;
            }
        }
        return b;
    }

    public static int[][] times(int x, Vector vector) {
        int[][] b = new int[vector.dim][vector.t];
        for (int i = 0; i < vector.dim; i++) {
            b[i][vector.t] = vector.elements[i][vector.t] * x;

        }
        return b;
    }

    // times por vetor
    public static int[][] times(Vector vector, Matrix matrix) {
        // não é possivel calcular
        return null;
    }

    public static int[][] times(Vector vector, Vector vector2) {
        int[][] b = new int[vector.dim][vector2.dim];
        if (vector.t == vector2.dim && vector.t < vector.dim) {
            for (int i = 0; i < vector.dim; i++) {
                for (int j = 0; j < vector2.dim; j++) {
                    b[i][j] = vector.elements[i][vector.t] * vector.elements[vector.t][j];
                }
            }
            return b;
        } else {
            return null;
        }
    }

    // times por matriz
    public static int[][] times(Matrix matrix, Matrix matrix2) {
        int[][] b = new int[matrix.rows][matrix2.rows];
        if (matrix.cols == matrix2.rows) {
            for (int i = 0; i < matrix.rows; i++) {
                for (int j = 0; j < matrix.cols; j++) {
                    for (int k = 0; k < matrix2.cols; k++) {
                        b[i][j] += matrix.matrix[i][k] * matrix2.matrix[k][j];
                    }
                }
            }
            return b;
        } else {
            return null;
        }
    }

    public static int[][] times(Matrix matrix, Vector vector) {
        int[][] b = new int[matrix.rows][vector.t];
        if (matrix.cols == vector.dim && vector.t < vector.dim) {
            for (int i = 0; i < matrix.rows; i++) {
                for (int j = 0; j < matrix.cols; j++) {
                    b[i][j] = matrix.matrix[i][j] * vector.elements[j][vector.t];

                }
            }
            return b;
        } else {
            return null;
        }
    }   
    
    public Matrix dot(Matrix a , Matrix b  ){
        int ResultadosL = a.rows;
        int ResultadosC = b.cols;
        int [][] resultado = new int[ResultadosL][ResultadosC];
        for(int i = 0 ; i < ResultadosL;i++){
            for(int j = 0 ; j < ResultadosC ; j++){
                for(int x = 0; x < ResultadosL; x++){
                    resultado[i][j] += a.matrix[i][x] * b.matrix [x][j];
                    
                      
                }
                
            } 
            
        }
       return new Matrix(ResultadosL, ResultadosC, resultado);
       
    }

    
}