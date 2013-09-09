package exercise.tools;

import exercise.DataSets;
import exercise.Point;

import java.util.List;

public class DumpData {
    public static void main(String[] args) {
        if (args.length != 2) {
            usageError();
        }

        String dataSetName = args[0];
        String dataSetIndexStr = args[1];

        int index;
        try {
            index = Integer.parseInt(dataSetIndexStr);
        } catch (NumberFormatException e) {
            System.err.println("invalid data set index: " + dataSetIndexStr);
            usageError();
            return;
        }

        List<Point> data;
        if (dataSetName.equalsIgnoreCase("a")) {
            data = DataSets.dataSetA(index);
        }
        else if (dataSetName.equalsIgnoreCase("b")) {
            data = DataSets.dataSetB(index);
        }
        else {
            System.err.println("invalid data set name: " + dataSetName);
            usageError();
            return;
        }

        for (Point p : data) {
            System.out.println(p);
        }
    }

    private static void usageError() {
        System.err.println("command-line arguments: <data set name> <data set index>");
        System.err.println("data set name: a | b");
        System.err.println("index:         integer >= 0");
        System.exit(1);
    }
}
