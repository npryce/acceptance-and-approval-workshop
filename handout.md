Accepting the Unexpectable
==========================

Introduction
------------

In this workshop we will explore how to apply Specification by Example (aka ATDD or BDD) to numerical and exploratory programming. 

The challenge is to find the best algorithm to fit a polynomial curve to data sets of two-dimensional data points sampled from a data source. We will try doing this with [Specification by Example] and then with a tool that combines [Approval Testing] with Specification by Example.



Challenges
----------

1. Implement the method `fitCurveForDataSourceA` of class `exercise.DataFitting` to fit a curve to data sets obtained from Data Source A.

2. Implement the method `fitCurveForDataSourceB` of class `exercise.DataFitting` to fit a curve to data sets obtained from Data Source B.

To ensure that we can explore the topic within the time available, we will simulate the numerical programming itself. Instead of writing a suitable algorithm, you only have to pick the most acceptable from a set of potential algorithms implemented in the class `exercise.Algorithms`.


Phase 1. Specification by Example with Cucumber
-----------------------------------------------

Follow a Specification by Example approach using Cucumber.

There is an example Cucumber feature in the directory `test/exercise/cucumber` that demonstrates existing steps. The step definitions are in the class `exercise.cucmber.DataFittingSteps`.  Feel free to add new steps that you find useful.

To tests the features, run the class `exercise.cucmber.CucumberDataFittingTest` as a JUnit test. That will test all the feature files in the directory `test/exercise/cucumber` and write an HTML report to `out/reports/cucumber`.


Phase 2. Approval Testing & Visualisation with Pearlfish
--------------------------------------------------------

To run tests with Pearlfish, run the class 	`exercise.pearlfish.PearlfishDataFittingTest` as a JUnit test.  That will generate "received" files in the directory `out/reports/pearlfish`. Rename them to replace "received" with "approved" to approve them.

The files are generated with templates in `test/exercise/cucumber`.  Feel free to modify or add to the templates to generate the reports you want to see.


Data Sets
---------

The class `exercise.DataSets` provides data sets acquired from sources of two-dimensional data.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~java
public class DataSets {
    public static List<Point> dataSetA(int index) { ... }
    public static List<Point> dataSetB(int index) { ... }
    ...
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The data sets returned from these methods are identified by integer index.  A call with the same index will always return the same data set.



[Specification by Example]: http://en.wikipedia.org/wiki/Specification_by_example
[Approval Testing]: http://approvaltests.com
