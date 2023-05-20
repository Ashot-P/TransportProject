import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PortMainWindow extends JFrame {
    private JList portList;
    private JButton removePort;
    private JButton addPort;
    private JMenuBar menuBar;
    private JMenu actionMenu;
    private JMenuItem printList;
    private JPanel mainPanel;
    private Port port;
    Transport[] transports;
    private DefaultListModel tModel;

    private void renderTransports() {
        tModel.removeAllElements();

        for (int i = 0; i < transports.length; i++) {
            tModel.addElement(transports[i].getId() + " " + transports[i].getType());
        }
    }

    public PortMainWindow(Port port) {
        this.port = port;

        transports = port.getTransports();

        setSize(new Dimension(400, 400));
        setContentPane(mainPanel);
        mainPanel.setLayout(new GridLayout());

        tModel = new DefaultListModel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        portList.setModel(tModel);
        renderTransports();


        printList = new JMenuItem("Print items");
        printList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < portList.getModel().getSize(); i++){
                    System.out.println(portList.getModel().getElementAt(i));
                }
            }
        });
        actionMenu.add(printList);

        setVisible(true);

        portList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (portList.getSelectedIndex() == -1) {
                    removePort.setEnabled(false);
                } else {
                    removePort.setEnabled(true);
                }
            }
        });

        removePort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                port.remove(Integer.parseInt(((String)portList.getSelectedValue()).split(" ")[0]));

                transports = port.getTransports();

                renderTransports();
            }
        });

        addPort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddPortDialog dialog = new AddPortDialog(port);
                dialog.pack();
                dialog.setVisible(true);

                transports = port.getTransports();

                renderTransports();
            }
        });
    }
}
