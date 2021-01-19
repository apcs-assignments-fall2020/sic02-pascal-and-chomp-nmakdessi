/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int [][] output = new int [n][n];
        output [0][0] = 1;
        for (int i = 1; i < n; i++){
            output[i][0] = 1;
            output[i][i] = 1;
        }
        for (int i = 2; i < n; i++){
            for (int j = 1; j < i; j++){
                output[i][j] = output[i-1][j-1] + output[i-1][j];
            }
        }
        return output;
    }

     
}
