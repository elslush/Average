public class Average {
    public static void main(String[] args){
        System.out.println(ArrayAverage(new int[][] {new int[]{15, 24, 17}, new int[]{3, 41, 13}}));
    }

    private static float ArrayAverage(int[][] array){
        int total = 0;
        for (int n[]:array
             ) {
            for (int num:n
                 ) {
                total += num;
            }
        }
        return (total / (array.length * array[0].length));
    }
}
