package chk.j8.lambda.lambda_exp;

import javax.swing.*;

public class With_Lambda_10_EventListener {

    public With_Lambda_10_EventListener() {

        JTextField jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);
        JButton jButton = new JButton("click");
        jButton.setBounds(80, 100, 70, 30);

        // lambda expression implementing here.
        jButton.addActionListener(e -> {
            jTextField.setText("Java Lambda Example...");
        });

        JFrame jFrame = new JFrame();
        jFrame.add(jTextField);
        jFrame.add(jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(300, 200);
        jFrame.setVisible(true);
    }
}
