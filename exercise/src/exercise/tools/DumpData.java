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
        if (args.length < 3 || args.length > 4) {
            usageError();
        }

        String dataSetName = args[0];
        String offsetStr = args[1];
        String countStr = args[2];

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

        int offset = parseCardinal(offsetStr, "offset", 0);
        int count = parseCardinal(countStr, "count", 1);

        List<Point> data;
        if (dataSetName.equalsIgnoreCase("a")) {
            data = DataSets.sampleDataSetA(offset, count);
        }
        else if (dataSetName.equalsIgnoreCase("b")) {
            data = DataSets.sampleDataSetB(offset, count);
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

    private static int parseCardinal(String str, String name, int minValue) {
        try {
            int i = Integer.parseInt(str);
            if (i < minValue) {
                System.err.println(name + " is less than " + minValue);
                usageError();
            }

            return i;
        } catch (NumberFormatException e) {
            System.err.println("invalid " + name + ": " + str);
            usageError();
            return -1;
        }
    }

    private static void usageError() {
        System.err.println("command-line arguments: <data set name> <offset> <count> [<format>]");
        System.err.println("data set name: a, b");
        System.err.println("offset:        integer, 0+");
        System.err.println("count:         integer, 1+");
        System.err.println("format:        tsv, csv, cucumber");
        System.exit(1);
    }
}
