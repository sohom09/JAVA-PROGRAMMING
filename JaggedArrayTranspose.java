public class JaggedArrayTranspose {

    public static int[][] transposeJaggedArray(int[][] jaggedArray) {
        int maxCols = 0;
        for (int[] row : jaggedArray) {
            maxCols = Math.max(maxCols, row.length);
        }

        int[][] transposedArray = new int[maxCols][jaggedArray.length];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                transposedArray[j][i] = jaggedArray[i][j];
            }
        }
        return transposedArray;
    }

    public static void main(String[] args) {
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[][] transposedArray = transposeJaggedArray(jaggedArray);

        for (int[] row : transposedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}