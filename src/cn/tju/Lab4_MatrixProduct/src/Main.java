import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int nRow = 128;
        int nCol = 128;
        MatrixGenerator mg1 = new MatrixGenerator(nRow, 5, 10);
        mg1.printMatrix();
        MatrixGenerator mg2 = new MatrixGenerator(5, nCol, 10);
        mg2.printMatrix();

        MultiCompute m1 = new MultiCompute(mg1, mg2);
        MultiCompute m2 = new MultiCompute(mg1, mg2);
        MultiCompute m3 = new MultiCompute(mg1, mg2);
        MultiCompute m4 = new MultiCompute(mg1, mg2);
        MultiCompute m5 = new MultiCompute(mg1, mg2);
        MultiCompute m6 = new MultiCompute(mg1, mg2);

        MultiCompute.setThreadNum(2);
        Date start1 = new Date();
        m1.start();
        m2.start();

        m1.join();
        m2.join();
        Date end1 = new Date();

        MultiCompute.setThreadNum(4);
        Date start2 = new Date();
        m5.start();
        m6.start();
        m3.start();
        m4.start();

        m5.join();
        m6.join();
        m3.join();
        m4.join();
        Date end2 = new Date();

        double[][] res = m1.getRes();
        // print2DArray(mg1.row, mg2.col, res);
        long count1 = end1.getTime() - start1.getTime();
        long count2 = end2.getTime() - start2.getTime();
        double[][] sgRes = sgCompute(nRow, nCol, mg1.getM(), mg2.getM());
        System.out.println("[2 threads finished in " + count1 + " ms]" );
        System.out.println("[4 threads finished in " + count2 + " ms]" );

        System.out.println("====== Result " + nRow + "*" + nCol + " Matrix ======");
        if (deepEquals(sgRes, res)) System.out.println("Results are the same");
        else System.out.println("Results NOT the same");
    }

    public static void print2DArray(int row, int col, double[][] m){
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) System.out.printf("%6.2f ", m[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    public static double[][] sgCompute(int resRow, int resCol, double[][] mat1, double[][] mat2){
        double[][] res = new double[resRow][resCol];
        Date start = new Date();
        for (int i = 0; i < resRow; i++)
        {
            for (int j = 0; j < resCol; j++) res[i][j] = compute(i, j, mat1, mat2);
        }
        Date end = new Date();
        long count = end.getTime() - start.getTime();
        System.out.println("[sgCompute finished in " + count + " ms]" );
        return res;
    }

    private static double compute(int res_row, int res_col, double[][] mat1, double[][] mat2){
        double res = 0;
        for (int i = 0; i < 5; i++) res += mat1[res_row][i] * mat2[i][res_col];
        return res;
    }

    public static boolean deepEquals (double[][] a, double[][] b) {
        if (a.length != b.length) return false;
        else
        {
            for (int i = 0; i < a.length; i++)
                if (a[i].length != b.length) return false;
                else if (!Arrays.equals(a[i], b[i])) return false;
        }
        return true;
    }
}


