package exercise.tools;

import exercise.DataSets;
import exercise.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DumpData {
    static class TableFormat {
        public final String bol;
        public final String sep;
        public final String eol;

        public TableFormat(String sep) {
            this("", sep, "");
        }

        public TableFormat(String bol, String sep, String eol) {
            this.bol = bol;
            this.sep = sep;
            this.eol = eol;
        }

        public void write(Object a, Object b) {
            System.out.println(bol + a + sep + b + eol);
        }
    }

    private static final Map<String,TableFormat> formats = new HashMap<String,TableFormat>();
    static {
        formats.put("csv", new TableFormat(","));
        formats.put("tsv", new TableFormat("\t"));
        formats.put("cucumber", new TableFormat("  |", "|", "|"));
    }

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 3) {
            usageError();
        }

        String dataSetName = args[0];
        String dataSetIndexStr = args[1];

        TableFormat format;
        if (args.length == 2) {
            format = formats.get("tsv");
        }
        else {
            format = formats.get(args[2]);
            if (format == null) {
                usageError();
            }
        }
        assert format != null;

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
            data = DataSets.sampleDataSourceA(index);
        }
        else if (dataSetName.equalsIgnoreCase("b")) {
            data = DataSets.sampleDataSourceB(index);
        }
        else {
            System.err.println("invalid data set name: " + dataSetName);
            usageError();
            return;
        }

        format.write("x", "y");
        for (Point p : data) {
            format.write(p.x, p.y);
        }
    }

    private static void usageError() {
        System.err.println("command-line arguments: <data set name> <data set index> [<format>]");
        System.err.println("data set name: a, b");
        System.err.println("index:         integer >= 0");
        System.err.println("format:        tsv, csv, cucumber");
        System.exit(1);
    }
}
