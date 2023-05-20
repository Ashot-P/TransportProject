import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, InvalidCSVFileException, InconsistentCSVRow {
        Port port = new Port(new Transport[]{new Sailboat(1), new Speedboat(2), new Motorcycle(3), new Helicopter(4), new Car(5), new Airplane(6)});
        PortMainWindow n = new PortMainWindow(port);

        n.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closed");
            }
        });
    }
}