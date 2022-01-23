public class switchtest {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Grade is A");
                break;
            case 'B':
                System.out.println("Grade is B");
                break;
            default:
                System.out.println("No grade available");
                break;
        }
    }
}
