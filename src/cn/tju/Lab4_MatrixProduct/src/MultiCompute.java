import java.util.Arrays;
import java.util.Date;

public class MultiCompute extends Thread {
    private static double[][] res;
    private static int run_cnt = -1;
    private int resRow, resCol, cnt;
    private double[][] mat1;
    private double[][] mat2;
    private static int threadNum = 1;

    public MultiCompute(MatrixGenerator m1, MatrixGenerator m2) {
        // Initialize
        if (m1.col != m2.row) throw new Error("Invalid row-column size");
        cnt = m1.col;
        resRow = m1.row;
        resCol = m2.col;
        res = new double[resRow][resCol];
        for (int i = 0; i < resRow; i++)
        {
            for (int j = 0; j < resCol; j++) res[i][j] = -1;
        }
        mat1 = m1.getM();
        mat2 = m2.getM();
    }

    public static void setThreadNum(int threadNum) {
        run_cnt = -1;
        MultiCompute.threadNum = threadNum;
    }

    public int getThreadNum() {
        return threadNum;
    }

    @Override
    public void run() {
        run_cnt++;
        for (int i = run_cnt; i < resRow; i+=threadNum)
        {
            for (int j = 0; j < resCol; j++)
            {
                res[i][j] = compute(i, j);
                System.out.println("res[" + i +  "][" + j + "] = " + res[i][j]);
            }
        }
    }

    private double compute(int res_row, int res_col){
        double res = 0;
        for (int i = 0; i < cnt; i++) res += mat1[res_row][i] * mat2[i][res_col];
        return res;
    }

//    public void sgCompute(){
//        Date start = new Date();
//        for (int i = 0; i < resRow; i++)
//        {
//            for (int j = 0; j < resCol; j++)
//            {
//                res[i][j] = compute(i, j);
//                //System.out.println("res[" + i + "][" + j + "] = " + res[i][j]);
//            }
//        }
//        Date end = new Date();
//        long count = end.getTime() - start.getTime();
//        System.out.println("[sgCompute finished in " + count + " ms]" );
//    }

    public double[][] getRes() {
        return res;
    }
}
