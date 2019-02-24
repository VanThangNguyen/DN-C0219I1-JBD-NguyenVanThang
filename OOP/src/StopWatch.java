public class StopWatch {
    private long startTime;
    private long endTime;

    public static void main(String[] args) {
        double[] numbers = new double[100000];
        int numbersLength = numbers.length;
        int min;
        StopWatch stopWatch;
        for (int i = 0; i < numbersLength; i++) {
            numbers[i] = Math.floor(Math.random() * 1000000) + 1;
        }
        System.out.println("Array before selection sort:");
        for (int k = 0; k < numbersLength; k++) {
            System.out.print(" " + numbers[k]);
        }
        stopWatch = new StopWatch();
        for (int j = 0; j < numbersLength-1; j++) {
            min = j;
            for (int m = j+1; m < numbersLength; m++) {
                if (numbers[m] < numbers[min]) {
                    min = m;
                }
            }
            if (min != j) {
                double temp = numbers[min];
                numbers[min] = numbers[j];
                numbers[j] = temp;
            }
        }
        stopWatch.stop();
        System.out.println("\nArray after selection sort:");
        for (int l = 0; l < numbersLength; l++) {
            System.out.print(" " + numbers[l]);
        }
        System.out.println("\nExecution time of selected sorting algorithm: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
