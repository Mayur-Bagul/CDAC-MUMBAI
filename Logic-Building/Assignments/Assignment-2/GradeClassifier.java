class GradeClassifier {
    public static void main(String[] args) {
        
             int i=65;
        // the grade based on the score
        if (i >= 90) {
            System.out.println("Grade A ");
        } else if (i >= 80) {
            System.out.println("Grade B");
        } else if (i >= 70) {
            System.out.println("Grade C");
        } else if (i >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}