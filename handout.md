Accepting the Unexpectable
==========================

Introduction
------------

In this workshop we will explore how to apply Specification by Example (aka ATDD or BDD) to numerical and exploratory programming.

To ensure that we can explore the topic within the time available, will simulate the numerical programming itself.  The challenge is to find the best algorithm, from a set of potential algorithms provided to you, to fit a polynomial curve to data sets containing two-dimensional data points.

We will try doing this [Specification by Example] and then with a tool that combines [Approval Testing] with Specification by Example.


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


[Specification by Example]: http://en.wikipedia.org/wiki/Specification_by_example
[Approval Testing]: http://approvaltests.com
