
package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo implements ActionListener {
    private JTextField operand1Text ;
    private JTextField operand2Text ;
    private JTextField operationText ;
    private JTextField resultText ;
    private JLabel exception;
    private JPanel panel;
    private JFrame window;

    public static void main(String[] args) {
        Demo d1 = new Demo();

        //creating a window
        d1.window = new JFrame();
        d1.window.setTitle("SIMPLE CALCULATOR");
        d1.window.setSize(900,900);

        //creating a panel
        d1.panel = new JPanel();
        d1.panel.setLayout(null);

        JLabel operand1 = new JLabel();
        operand1.setText("Operand 1 :");
        operand1.setBounds(300,50,150,30);
        d1.panel.add(operand1);

        d1.operand1Text = new JTextField();
        d1.operand1Text.setText("Enter the first operand here");
        d1.operand1Text.setBounds(470,50,200,30);
        d1.panel.add(d1.operand1Text);


        JLabel operation = new JLabel();
        operation.setText("Operation :");
        operation.setBounds(300,100,150,30);
        d1.panel.add(operation);

        d1.operationText = new JTextField();
        d1.operationText.setText("Enter the operation here");
        d1.operationText.setBounds(470,100,200,30);
        d1.panel.add(d1.operationText);

        JLabel operand2 = new JLabel();
        operand2.setText("Operand 2 :");
        operand2.setBounds(300,150,150,30);
        d1.panel.add(operand2);

        d1.operand2Text = new JTextField();
        d1.operand2Text.setText("Enter the second operand here");
        d1.operand2Text.setBounds(470,150,200,30);
        d1.panel.add(d1.operand2Text);

        JButton result = new JButton();
        result.setText("Calculate Result");
        result.setBounds(350,230,150,40);
        d1.panel.add(result);

        d1.resultText = new JTextField();
        d1.resultText.setBounds(350,280,150,40);
        d1.panel.add(d1.resultText);


        //supposed to be shown only when wrong operation is given i/p.
        d1.exception = new JLabel();
        d1.exception.setText("!!! You can choose between + - * and / only");
        d1.exception.setForeground(Color.red);
        d1.exception.setBounds(300, 340, 300, 60);


        d1.window.add(d1.panel);
        d1.window.setVisible(true);

        result.addActionListener(d1);




    }

    public void actionPerformed(ActionEvent e)
    {
        double a = Double.parseDouble(this.operand1Text.getText());
        double b = Double.parseDouble(this.operand2Text.getText());
        double c = 0;
        String text = null;
        switch(this.operationText.getText())
        {
            case "+":
                c = a + b;
                break;


            case "-":
                c = a - b;
                break;


            case "*":
                c = a * b;
                break;


            case "/":
                c = a / b;
                break;


            case "%":
                c = (a / 100) * b;
                break;

            default:
                this.panel.add(this.exception);
                this.window.add(this.panel);

        }

        text = Double.toString(c);

        this.resultText.setText(text);

    }
}
