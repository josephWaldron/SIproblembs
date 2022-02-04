public class foreach {
    public static void main(String[] args) {
        int[][] matrix = {{5,3,4,3,2},{2,3,4,2,4},{1,2,3,4,3,}};
        int total = 0;
        for(int[]OnedArray : matrix){//for each 1D array in matrix
            for(int value : OnedArray){//for each value in the 1D array
                total += value;
            }
        }
        System.out.println(total);
    }

    
}

