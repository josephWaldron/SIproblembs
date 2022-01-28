public class array {
    public static void main(String[] args) {
        int array[] = new int[5];
        int array1[] = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(array1[2]);
        System.out.println(array[2]);
        System.out.println(array1[1]);
        System.out.println(array[5]);
        for(int x = 0; x < array1.length; x++){
            System.out.println(array1[x]);
        }
    }
}
