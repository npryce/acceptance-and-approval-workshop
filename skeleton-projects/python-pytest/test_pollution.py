
from approval import approval
import pollution as p

dataset_file = "seasonally-adjusted-atmospheric-co2.csv"
report_template = "templates/timeseries.html"

@approval(template=report_template)
def test_parse_dataset():
    history = p.load_history(dataset_file)
    
    return dict(
        history="REPLACE THIS WITH HISTORY FORMATTED AS HTML TABLE ROWS",
        projection="",
        title="Historical Atmospheric CO<sub>2</sub>")
