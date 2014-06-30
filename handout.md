Accepting the Unexpectable
==========================

In this workshop we will explore how to apply [Approval Testing] and
[Specification by Example] (aka ATDD or BDD) to numerical and
exploratory programming.

The challenge is to parse a time-series data set and come up with a
reasonable extrapolation of the data set into the future.

1. Write code to parse the data set in `{dataset}` into a data
   structure

2. In a test harness (e.g., a test function or class/method that can
   be run by a test framework), write the parsed data out to a file as
   HTML. Name the output file after the test, with the suffix
   "-received.html".  We will refer to this file as the test's
   _received_ file.

    * A template HTML file is in `templates/timeseries.html`.  You can
      generate an HTML report of your parsed data set by replacing the
      following strings in the template:

        * `${_resourcedir}`: the directory containing the HTML file,
          relative to where you are writing the output file

        * `${title}`: the title of the document

        * `${history}`: historical data points parsed from the data
          set, formatted as HTML table rows
          (e.g. `<tr><td>{year}</td><td>{value}</tr></tr>`)

        * `${projection}`: an empty string, for this phase of the exercise

2. Open the HTML file in a browser.  If necessary, adjust your parser
   until you're happy with the results.

3. Now turn your function into an Approval Test:

    * The test should fail if there is no _approved_ file for the test
      -- a file that is named after the test, with the suffix
      "-approved.html".

    * The test should fail if the contents of the _received_ and
      _approved_ files are different.

4. Approve your _received_ file by renaming it to have the suffix
"-approved.html" and rerun your test to check that it now passes.

5. Write code to project the dataset to the date 2050

    * Do something really simple to start with. E.g. a linear
      projection along the line between the first and last historical
      data points.

    * Add the projected data points to your HTML file by formatting
      them as HTML table rows and substituting them for
      `${projection}` in the HTML template.

6. Iterate, improving the projection until you consider it worth approving.


There is a very simple Python approval testing module here:
https://gist.github.com/npryce/9c4dc2e0ea7eaf6e27fc. Download the
approval.py module and save it next to your test module.



[Specification by Example]: http://en.wikipedia.org/wiki/Specification_by_example
[Approval Testing]: http://approvaltests.com
