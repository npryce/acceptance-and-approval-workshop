Accepting the Unexpectable
==========================

Introduction
------------

In this workshop we will explore how to apply Specification by Example (aka ATDD or BDD) to numerical and exploratory programming. 

The challenge is to find the best algorithm to fit a polynomial curve to data sets of two-dimensional data points sampled from a data source. We will try doing this with [Specification by Example] and then with a tool that combines [Approval Testing] with Specification by Example.



Challenges
----------

1. Implement the method `fitCurveForDataSourceA` of class `exercise.DataFitting` to fit a curve to data sets sampled from Data Source A.

2. Implement the method `fitCurveForDataSourceB` of class `exercise.DataFitting` to fit a curve to data sets sampled from Data Source B.

To ensure that we can explore the topic within the time available, we will simulate the numerical programming itself. Instead of writing a suitable algorithm, you only have to pick the most acceptable a set of potential algorithms provided to you.


Cucumber Tests
--------------

To run tests with Cucumber, run the class `exercise.cucmber.CucumberDataFittingTest` as a JUnit test. That will test the feature files in the directory `test/exercise/cucumber` and write an HTML report to `out/reports/cucumber`.

The features are interpreted by step definitions in the class `exercise.cucmber.DataFittingSteps`.  Feel free to add new steps that you find useful.


Pearlfish Tests
---------------

To run tests with Pearlfish, run the class 	`exercise.pearlfish.PearlfishDataFittingTest` as a JUnit test.  That will generate "received" files in the directory `out/reports/pearlfish`. Rename them to replace "received" with "approved" to approve them.

The files are generated with templates in `test/exercise/cucumber`.  Feel free to modify or add to the templates to generate the reports you want to see.

Data Sets and Data Sources
--------------------------

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
