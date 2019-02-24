package ArraysAndMethodsInJava;

public class Example {
    public static void main(String[] args) {
        Example example = new Example();
        int[][] array1 = {{1, 2, 13, 4, 5}, {11, 12, 8, 9, 10}};
        int result = example.findMaxOfArray(array1);
        System.out.printf("max is" + result);
    }

    public int findMaxOfArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}