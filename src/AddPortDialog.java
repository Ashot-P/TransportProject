import javax.swing.*;
import java.awt.event.*;

public class AddPortDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField idText;
    private JTextField typeText;

    public AddPortDialog(Port port) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.setEnabled(false);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (typeText.getText()){
                    case "Airplane":
                        Airplane airplane = new Airplane(Integer.parseInt(idText.getText()));
                        port.add(airplane);
                        break;
                    case "Car":
                        Car car = new Car(Integer.parseInt(idText.getText()));
                        port.add(car);
                        break;
                    case "Helicopter":
                        Helicopter helicopter = new Helicopter(Integer.parseInt(idText.getText()));
                        port.add(helicopter);
                        break;
                    case "Motorcycle":
                        Motorcycle motorcycle = new Motorcycle(Integer.parseInt(idText.getText()));
                        port.add(motorcycle);
                        break;
                    case "Sailboat":
                        Sailboat sailboat = new Sailboat(Integer.parseInt(idText.getText()));
                        port.add(sailboat);
                        break;
                    case "Speedboat":
                        Speedboat speedboat = new Speedboat(Integer.parseInt(idText.getText()));
                        port.add(speedboat);
                        break;
                }

                dispose();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        idText.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (idText.getText().equals("") || typeText.getText().equals("")) {
                    buttonOK.setEnabled(false);
                } else {
                    buttonOK.setEnabled(true);
                }
            }
        });

        typeText.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (idText.getText().equals("") || typeText.getText().equals("")) {
                    buttonOK.setEnabled(false);
                } else {
                    buttonOK.setEnabled(true);
                }
            }
        });
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
    }
}
