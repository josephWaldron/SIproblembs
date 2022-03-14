package midterm;

public class findMin {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getMin(number));
    }
    public static int getMin(int array[]){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
