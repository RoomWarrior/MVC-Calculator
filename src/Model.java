public class Model {

    private final Viewer viewer;
    private String temp;
    private final PostfixCalculator postfixCalc;
    private int flag;


    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        postfixCalc = new PostfixCalculator();
        flag = 0;
    }

    public void doAction(String command) {
        switch (command) {
            case ("="):
                if (flag == 1) {
                    String postfix = RPN.reverseString(temp);
                    double value = postfixCalc.calculate(postfix);
                    String answer = String.valueOf(value);
                    if (answer.matches("[0-9]+.0") || answer.matches("-[0-9]+.0"))
                        answer = answer.replace(".0", "");

                    viewer.setAnswer(answer);
                    viewer.setErrorCheck(" ");
                    viewer.setPostfix(postfix);
                    temp = "";
                    flag = 0;
                } else {
                    viewer.setErrorCheck("You have not entered any values.");
                }
                break;

            case ("Clear"):
                temp = "";
                viewer.clear();
                flag = 0;
                break;

            case ("."):
                if (flag == 0) {
                    viewer.setErrorCheck("Please press another button.");
                    break;
                } else if (flag == 1) {
                    temp = temp + command;
                    flag = 0;
                    break;
                }

            case ("+"):
                if (flag == 0) {
                    if (!temp.equals("")) {
                        temp = temp.substring(0, temp.length() - 1);
                        temp = temp + "+";
                    } else {
                        viewer.setErrorCheck("Please press another button.");
                    }
                    break;
                } else if (flag == 1) {
                    temp = temp + command;
                    flag = 0;
                    break;
                }

            case ("-"):
                if (flag == 0) {
                    if (temp.equals("")) {
                        viewer.setErrorCheck("Please press another button.");
                    } else {
                        temp = temp.substring(0, temp.length() - 1);
                        temp = temp + "-";
                    }
                    break;
                } else if (flag == 1) {
                    temp = temp + command;
                    flag = 0;
                    break;
                }

            case ("*"):
                if (flag == 0) {
                    if (temp.equals("")) {
                        viewer.setErrorCheck("Please press another button.");
                    } else {
                        temp = temp.substring(0, temp.length() - 1);
                        temp = temp + "*";
                    }
                    break;
                } else if (flag == 1) {
                    temp = temp + command;
                    flag = 0;
                    break;
                }

            case ("/"):
                if (flag == 0) {
                    if (temp.equals("")) {
                        viewer.setErrorCheck("Please press another button.");
                    } else {
                        temp = temp.substring(0, temp.length() - 1);
                        temp = temp + "/";
                    }
                    break;
                } else if (flag == 1) {
                    temp = temp + command;
                    flag = 0;
                    break;
                }

            default:
                temp = temp + command;
                flag = 1;
                viewer.setErrorCheck("");
                break;
        }

        viewer.update(temp);
    }
}
