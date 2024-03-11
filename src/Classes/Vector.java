package Classes;
public class Vector {
    public int dim;
    public int t;
    public int[][] elements = new int[dim][t];

    public Vector(int dim, int t, int[][] elements) {
        this.dim = dim;
        this.t = t;
        this.elements = elements;

    }

    public void set(int i, int value) {
        elements[t][i] = value;
    }

    public int get(int i) {
        return elements[t][i];
    }
}
