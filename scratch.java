public class scratch {
    public static void main(String[] args) {
        int[][] arr3 = {{1,2,3},{1,2,3}};
        for(int row = 0; row < arr3.length; row++){//2nd
            for(int colum = 0; colum < arr3[row].length; colum++){
                System.out.printf("%-20s", arr3[row][colum]);
            }
            System.out.println();
        }
    }
}

