public class Transpose {
    private int n;
    private int m;

    public Transpose(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public String encrypt(String input) {
        char[][] matrix = new char[n][m];
        int iter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.charAt(iter);
                iter++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result.append(matrix[j][i]);
            }
            result.append(" ");
        }
        return result.toString();
    }

    public String decrypt(String input) {
        char[][] matrix = new char[n][m];
        int iter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = input.charAt(iter);
                iter++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result.append(matrix[i][j]);
            }
        }
        return result.toString();
    }
}
