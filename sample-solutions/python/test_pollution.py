2
import math
from approval import approval
import pollution as p


def to_tr(row):
    return "<tr>" + str.join("", ("<td>" + str(val) + "</td>" for val in row)) + "</tr>"

def samples_to_html(series):
    return str.join("\n", map(to_tr, series))


dataset_file = "../../datasets/air-quality-urban-background-ozone.csv"
report_template = "../../templates/air-quality.html"

@approval(template=report_template)
def test_parse_dataset():
    return dict(
        history=samples_to_html(p.load_history(dataset_file)),
        projection="",
        title="Historical Air Pollution - Urban Background Ozone")

@approval(template=report_template)
def test_projection():
    history = p.load_history(dataset_file)
    end_year=2020
    return dict(
        history=samples_to_html(history),
        projection=samples_to_html(p.project(history, to_year=end_year)),
        title="Air Pollution Projected to " + str(end_year) + " - Urban Background Ozone")
