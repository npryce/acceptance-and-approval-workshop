Accepting the Unexpectable
==========================

In this workshop we will explore how to apply [Approval Testing] and [Specification by Example] (aka ATDD or BDD) to numerical and exploratory programming. 

The challenge is to parse a time-series data set and come up with a reasonable extrapolation of the data set into the future.

1. Parse the data set and write it out as HTML
    * the data set is in the CSV file `datasets/monthly-atmospheric-co2.csv`
    * a template HTML file is in `templates/timeseries.html`.  You can generate an HTML report of your parsed data set by replacing the following strings in the template:
        * ${_resourcedir}: the directory containing the HTML file, relative to where you are writing the output file 
        
 





[Specification by Example]: http://en.wikipedia.org/wiki/Specification_by_example
[Approval Testing]: http://approvaltests.com
