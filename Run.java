
class MinimumMarksException extends Exception {
    public MinimumMarksException(String message) {
        super(message);
    }
}
class OnlineExam {

    static void validateMarks(int marks) throws MinimumMarksException {
        if (marks < 40) {
            throw new MinimumMarksException("Student failed: Minimum 40 marks required.");
        } else {
            System.out.println("Student passed the exam.");
        }
    }
}