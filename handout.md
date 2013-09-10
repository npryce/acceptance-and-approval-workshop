Accepting the Unexpectable
==========================

Introduction
------------


Data Sets
---------

The class `exercise.DataSets` provides data sets acquired from sources of two-dimensional data.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~java
public class DataSets {
    public static List<Point> dataSetA(int index) { ... }
    public static List<Point> dataSetB(int index) { ... }
    ...
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The data sets acquired from a source are identified by integer index.  A call with the same index will always return the same data set.

Curve Fitting Algorithms
------------------------

The class `exercise.Algorithms` implements a number of data fitting algorithms that fit polynomial curves to data sets:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~java
public class Algorithms {
    public static Polynomial aardvark(List<Point> points) {...}
    public static Polynomial baboon(List<Point> points) {...}
    public static Polynomial coatimundi(List<Point> points) {...}
    public static Polynomial donkey(List<Point> points) {...}
    ...
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

