package zigzeg;

public class ZigzagTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String result = zigzagTraversal(matrix);
        System.out.println(result);
    }

    public static String zigzagTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        StringBuilder result = new StringBuilder();

        for (int diag = 0; diag < rows + cols - 1; diag++) {
            if (diag % 2 == 0) {
                int r = Math.min(diag, rows - 1);
                int c = diag - r;
                while (r >= 0 && c < cols) {
                    result.append(matrix[r][c]);
                    r--;
                    c++;
                }
            } else {
                int c = Math.min(diag, cols - 1);
                int r = diag - c;
                while (c >= 0 && r < rows) {
                    result.append(matrix[r][c]);
                    r++;
                    c--;
                }
            }
        }

        return result.toString();
    }
}
