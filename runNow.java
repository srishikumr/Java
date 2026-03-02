
class MinimumMarksException extends Exception {
    public MinimumMarksException(String message) {
        super(message);
    }
}

class OnlineExam {
    public static void validateMarks(int marks) throws MinimumMarksException {
        if (marks < 40) {
            throw new MinimumMarksException("Student failed");
        }
        System.out.println("Passed");
    }
}

public class runNow {
    public static void main(String[] args) {

        try {
            OnlineExam.validateMarks(35);
        }
        catch (MinimumMarksException e) {
            System.out.println(e.getMessage());
        }
    }


class OnlineExam {
    public static void validateMarks(int marks) throws MinimumMarksException {
        if (marks < 40) {
            throw new MinimumMarksException("Student failed");
        }
        System.out.println("Passed");
    }
}
}