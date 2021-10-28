import javax.swing.*;

public class Viewer {

    JTextField textField;
    JLabel errorLabel, answerLabel, postfixLabel;

    Viewer() {
        Controller controller = new Controller(this);

        textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);

        answerLabel = new JLabel("", SwingConstants.RIGHT);
        answerLabel.setBounds(30, 10, 280, 30);

        errorLabel = new JLabel("", SwingConstants.RIGHT);
        errorLabel.setBounds(30, 70,280,30);

        postfixLabel = new JLabel("", SwingConstants.LEFT);
        postfixLabel.setBounds(30,10,280,30);

        JButton btnSeven = new JButton("7");
        btnSeven.setBounds(40, 100, 50, 40);
        btnSeven.addActionListener(controller);
        btnSeven.setActionCommand("7");

        JButton btnEight = new JButton("8");
        btnEight.setBounds(110, 100, 50, 40);
        btnEight.addActionListener(controller);
        btnEight.setActionCommand("8");

        JButton btnNine = new JButton("9");
        btnNine.setBounds(180, 100, 50, 40);
        btnNine.addActionListener(controller);
        btnNine.setActionCommand("9");

        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(250, 100, 50, 40);
        btnDivide.addActionListener(controller);
        btnDivide.setActionCommand("/");

        JButton btnFour = new JButton("4");
        btnFour.setBounds(40, 170, 50, 40);
        btnFour.addActionListener(controller);
        btnFour.setActionCommand("4");

        JButton btnFive = new JButton("5");
        btnFive.setBounds(110, 170, 50, 40);
        btnFive.addActionListener(controller);
        btnFive.setActionCommand("5");

        JButton btnSix = new JButton("6");
        btnSix.setBounds(180, 170, 50, 40);
        btnSix.addActionListener(controller);
        btnSix.setActionCommand("6");

        JButton btnMultiply = new JButton("*");
        btnMultiply.setBounds(250, 170, 50, 40);
        btnMultiply.addActionListener(controller);
        btnMultiply.setActionCommand("*");

        JButton btnOne = new JButton("1");
        btnOne.setBounds(40, 240, 50, 40);
        btnOne.addActionListener(controller);
        btnOne.setActionCommand("1");

        JButton btnTwo = new JButton("2");
        btnTwo.setBounds(110, 240, 50, 40);
        btnTwo.addActionListener(controller);
        btnTwo.setActionCommand("2");

        JButton btnThree = new JButton("3");
        btnThree.setBounds(180, 240, 50, 40);
        btnThree.addActionListener(controller);
        btnThree.setActionCommand("3");

        JButton btnSubtract = new JButton("-");
        btnSubtract.setBounds(250, 240, 50, 40);
        btnSubtract.addActionListener(controller);
        btnSubtract.setActionCommand("-");

        JButton btnDecimal = new JButton(".");
        btnDecimal.setBounds(40, 310, 50, 40);
        btnDecimal.addActionListener(controller);
        btnDecimal.setActionCommand(".");

        JButton btnZero = new JButton("0");
        btnZero.setBounds(110, 310, 50, 40);
        btnZero.addActionListener(controller);
        btnZero.setActionCommand("0");

        JButton btnEquals = new JButton("=");
        btnEquals.setBounds(180, 310, 50, 40);
        btnEquals.addActionListener(controller);
        btnEquals.setActionCommand("=");

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(250, 310, 50, 40);
        btnAdd.addActionListener(controller);
        btnAdd.setActionCommand("+");

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(110, 380, 120, 40);
        btnClear.addActionListener(controller);
        btnClear.setActionCommand("Clear");

        JFrame frame = new JFrame("Intern Labs 3.0(Calculator)");
        frame.add(textField);
        frame.add(answerLabel);
        frame.add(errorLabel);
        frame.add(postfixLabel);
        frame.add(btnSeven);
        frame.add(btnEight);
        frame.add(btnNine);
        frame.add(btnDivide);
        frame.add(btnFour);
        frame.add(btnFive);
        frame.add(btnSix);
        frame.add(btnMultiply);
        frame.add(btnOne);
        frame.add(btnTwo);
        frame.add(btnThree);
        frame.add(btnSubtract);
        frame.add(btnDecimal);
        frame.add(btnZero);
        frame.add(btnEquals);
        frame.add(btnAdd);
        frame.add(btnClear);
        frame.setSize(350, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void update(String text) {
        textField.setText(text);
    }

    public void setErrorCheck(String s) {
        errorLabel.setText(s);
    }

    public void setAnswer(String s) {
        answerLabel.setText(s);
    }

    public void setPostfix(String s) {
        postfixLabel.setText("Postfix: " + s);
    }

    public void clear() {
        textField.setText("");
        answerLabel.setText("");
        errorLabel.setText("");
        postfixLabel.setText("");
    }

}
