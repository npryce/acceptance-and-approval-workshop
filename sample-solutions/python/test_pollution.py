
import math
from approval import approval
import pollution as p


def to_tr(row):
    return "<tr>" + str.join("", ("<td>" + str(val) + "</td>" for val in row)) + "</tr>"

def samples_to_html(series):
    return str.join("\n", map(to_tr, series))

dataset_file = "../../datasets/atmospheric-co2-1992.csv"
report_template = "../../templates/timeseries.html"

@approval(template=report_template)
def test_parse_dataset():
    return dict(
        history=samples_to_html(p.load_history(dataset_file)),
        projection="",
        title="Historical Atmospheric CO<sub>2</sub>")

@approval(template=report_template)
def test_projection():
    history = p.load_history(dataset_file)
    end_year=2058
    
    return dict(
        history=samples_to_html(history),
        projection=samples_to_html(p.project(history, to_year=end_year)),
        title=" Atmospheric CO<sub>2</sub> Projected to " + str(end_year))
