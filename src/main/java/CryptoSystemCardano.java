public class CryptoSystemCardano {
    private int[][] key;
    private int n;

    public CryptoSystemCardano(int[][] key, int n) {
        this.key = key;
        this.n = n;
    }

    public String encrypt(String input) {
        char[][] resultMatrix = new char[n][n];
        int iter = 0;
        for (int rotation = 0; rotation < 4; rotation++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (key[i][j] == 1) {
                        resultMatrix[i][j] = input.charAt(iter);
                        iter++;
                    }
                }
            }
            rotate90();
        }
        StringBuilder result = new StringBuilder();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result.append(resultMatrix[i][j]);
            }
            result.append(" ");
        }
        return result.toString();
    }

    public String decrypt(String input) {
        char[][] inputMatrix = new char[n][n];
        int iter =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                inputMatrix[i][j]=input.charAt(iter);
                iter++;
            }
            iter++;
        }


        StringBuilder result = new StringBuilder();
        iter = 0;
        for (int rotation = 0; rotation < 4; rotation++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (key[i][j] == 1) {
                        result.append(inputMatrix[i][j]);
                        iter++;
                    }
                }
            }
            rotate90();
        }
        return result.toString();
    }

    private void rotate90() {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                // Меняем местами элементы каждого цикла
                // по часовой стрелке
                int temp = key[i][j];
                key[i][j] = key[n - 1 - j][i];
                key[n - 1 - j][i] = key[n - 1 - i][n - 1 - j];
                key[n - 1 - i][n - 1 - j] = key[j][n - 1 - i];
                key[j][n - 1 - i] = temp;
            }
        }
    }
}
