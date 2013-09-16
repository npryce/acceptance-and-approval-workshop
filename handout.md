Accepting the Unexpectable
==========================

Introduction
------------

In this workshop we will explore how to apply Specification by Example (aka ATDD or BDD) to numerical and exploratory programming. 

The challenge is to find the best algorithm to fit a polynomial curve to data sets of two-dimensional data points sampled from a data source. We will try doing this with [Specification by Example] and then with a tool that combines [Approval Testing] with Specification by Example.

To ensure that we can explore the topic within the time available, we will simulate the numerical programming itself. Instead of writing a suitable algorithm, you only have to pick the most acceptable a set of potential algorithms provided to you.



Cucumber Tests
--------------

To run cucumber tests, run the class 


Pearlfish Tests
---------------



Data Sets
---------

The class `exercise.DataSets` provides data sets acquired from sources of two-dimensional data.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~java
public class DataSets {
    public static List<Point> sampleDataSourceA(int index) { ... }
    public static List<Point> sampleDataSourceB(int index) { ... }
    ...
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The data sets acquired from a source are identified by integer index.  A call with the same index will always return the same data set.

Curve Fitting Algorithms
------------------------

The class `exercise.Algorithms` implements a number of data fitting algorithms that fit polynomial curves to data sets:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~java
public class Algorithms {
    public static Polynomial aardvark(List<Point> points) {...}
    public static Polynomial baboon(List<Point> points) {...}
    public static Polynomial coatimundi(List<Point> points) {...}
    public static Polynomial donkey(List<Point> points) {...}
    ...
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


[Specification by Example]: http://en.wikipedia.org/wiki/Specification_by_example
[Approval Testing]: http://approvaltests.com
