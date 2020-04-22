import java.util.Random;

public class MatrixGenerator {
    private double[][] m;
    int row, col;

    public MatrixGenerator(int nRow, int nCol, int max){
        m = new double[nRow][nCol];
        row = nRow;
        col = nCol;
        Random r = new Random(10);
        for (int i = 0; i < nRow; i++)
        {
            for (int j = 0; j < nCol; j++) m[i][j] = max * r.nextDouble();
        }
    }

    public void printMatrix(){
        System.out.println("======= Matrix m =======");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) System.out.printf("%4.2f ", m[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    public double[][] getM() {
        return m;
    }
}
