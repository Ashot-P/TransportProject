import java.io.*;
import java.util.Scanner;

public class Port {
    public Transport[] transports;
    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }
    public Transport[] getTransports() {
        return transports;
    }

    public Port(Transport[] transports){
        this.transports = transports;
    }

    public void add(Transport transport){
        int l = transports.length;
        Transport[] newArr = new Transport[l + 1];

        for(int i = 0; i < l; i++) {
            newArr[i] = transports[i];
        }

        newArr[l] = transport;
        transports = newArr;
    }

    public void remove(int id){
        int index = -1;

        for (int i = 0; i < transports.length; i++){
            if (transports[i].getId() == id) {
                index = i;
            }
        }

        if (index != -1){
            Transport[] newArr = new Transport[transports.length - 1];

            for (int i = 0; i < index; i++) {
                newArr[i] = transports[i];
            }

            for (int i = index; i < transports.length - 1; i++) {
                newArr[i] = transports[i + 1];
            }

            transports = newArr;
        }
    }

    public void writeToCSV(String filePath, boolean appendMode) throws IOException {
        File file = new File(filePath);

        PrintWriter pw = new PrintWriter(new FileOutputStream(file, appendMode));

        for (int i = 0; i < transports.length; i++) {
            pw.print(transports[i].getId());

            if (i < transports.length - 1) {
                pw.print(",");
            }

            pw.print(transports[i].getType());

            pw.println();
        }

        pw.close();
    }

    public void readFromCSV(String filePath) throws IOException {
        Scanner sc = new Scanner(new FileInputStream(filePath));
        String[] columnNames;
        String[] properties;

        if (sc.hasNextLine()) {
            String headerLine = sc.nextLine();
            columnNames = headerLine.split(",");
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            properties = line.split(",");
            String type = properties[properties.length - 1];

            switch (type){
                case "Airplane":
                    Airplane airplane = new Airplane(Integer.parseInt(properties[0]));
                    add(airplane);
                    break;
                case "Car":
                    Car car = new Car(Integer.parseInt(properties[0]));
                    add(car);
                    break;
                case "Helicopter":
                    Helicopter helicopter = new Helicopter(Integer.parseInt(properties[0]));
                    add(helicopter);
                    break;
                case "Motorcycle":
                    Motorcycle motorcycle = new Motorcycle(Integer.parseInt(properties[0]));
                    add(motorcycle);
                    break;
                case "Sailboat":
                    Sailboat sailboat = new Sailboat(Integer.parseInt(properties[0]));
                    add(sailboat);
                    break;
                case "Speedboat":
                    Speedboat speedboat = new Speedboat(Integer.parseInt(properties[0]));
                    add(speedboat);
                    break;
            }
        }

        sc.close();
    }
}
