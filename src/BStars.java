public class BStars {
    public static void main(String[] args) {
        String[][] bLetter = new String[7][4];
        for (int i = 0; i < bLetter.length; i++) {
            for (int j = 0; j < bLetter[i].length; j++) {
                if (i == 0 && j <= 2) {
                    bLetter[i][j] = " * ";
                } else if (j == 0) {
                    bLetter[i][j] = " * ";
                } else if (i == 3 && j <= 2) {
                    bLetter[i][j] = " * ";
                } else if (i == 6 && j <= 2) {
                    bLetter[i][j] = " * ";
                } else if (j == 3 && i > 0 && i < 3) {
                    bLetter[i][j] = " * ";
                } else if (j == 3 && i > 3 && i < 6) {
                    bLetter[i][j] = " * ";
                } else {
                    bLetter[i][j] = "  ";
                }
            }

        }
        for (
                String[] row : bLetter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
}
