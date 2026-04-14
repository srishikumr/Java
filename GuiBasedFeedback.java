import javax.swing.*;
import java.awt.event.*;

class GuibasedFeedback {
    static int count = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Feedback");

        JTextField name = new JTextField();
        JTextArea feedback = new JTextArea();
        JButton submit = new JButton("Submit");
        JLabel result = new JLabel();

        name.setBounds(50, 30, 200, 25);
        feedback.setBounds(50, 70, 200, 60);
        submit.setBounds(50, 140, 100, 30);
        result.setBounds(50, 180, 300, 25);

        f.add(name);
        f.add(feedback);
        f.add(submit);
        f.add(result);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (name.getText().isEmpty() || feedback.getText().isEmpty()) {
                    result.setText("Please enter valid input");
                } else {
                    count++;
                    result.setText("Thank you " + name.getText() + " | Count: " + count);
                }
            }
        });

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}