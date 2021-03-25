import java.awt.*;

public class Main {
    public static void main(String[] args) {
        LayoutManager layOut = new GridLayout(0,2);
        Frame f = new Frame("mini AWT Calculator");
        f.setLayout(layOut);

        Label lbl1st = new Label("enter first number");
        TextField firstNum = new TextField();
        firstNum.setBackground(Color.LIGHT_GRAY);


        Label lblOP = new Label("choose operation");

        Choice operationChoice = new Choice();
        operationChoice.add("+");
        operationChoice.add("-");
        operationChoice.add("*");
        operationChoice.add("/");

        operationChoice.setBackground(Color.PINK);

        Label lbl2nd = new Label("enter second number");
        TextField secondNum = new TextField();
        secondNum.setBackground(Color.LIGHT_GRAY);

        Label blank = new Label(" ");

        Button calculateButton = new Button("calculate");

        Label lblRes = new Label("result is");

        Label result = new Label("");

        lblRes.setBackground(Color.PINK);
        f.add(lbl1st);
        f.add(firstNum);
        f.add(lblOP);
        f.add(operationChoice);
        f.add(lbl2nd);
        f.add(secondNum);
        f.add(blank);
        f.add(calculateButton);
        f.add(lblRes);
        f.add(result);


        f.setSize(650,300);
        f.setVisible(true);

        calculateButton.addActionListener(e -> {
            Double i = Double.parseDouble(firstNum.getText());
            Double y = Double.parseDouble(secondNum.getText());

            switch (operationChoice.getItem(operationChoice.getSelectedIndex())) {
                case "+":
                    result.setText(String.valueOf(i + y));
                    break;
                case "-":
                    result.setText(String.valueOf(i - y));
                    break;
                case "*":
                    result.setText(String.valueOf(i * y));
                    break;
                case "/":
                    if (y == 0) {
                        result.setText("Impartirea cu 0 nu este posibila");
                    } else {
                        result.setText(String.valueOf(i / y));
                    }
                    break;
            }

        });
    }
}
