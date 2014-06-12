
import math
from approval import approval
import pollution as p


def cell_str(n):
    return "" if n is None or math.isnan(n) else str(n)

def row_str(cells):
    return "| " + str.join(" | ", cells) + " |\n"

def ident_to_str(s):
    return s.replace("_", " ")

def write_samples(r, samples, title=None):
    samples = samples.reset_index()
    
    if title is not None:
        r.write(title + "\n")
        r.write("="*len(title)+"\n")
        r.write("\n")
    r.write(row_str(samples.columns))
    for row in samples.index:
        r.write(row_str(cell_str(samples[col][row]) for col in samples.columns))

@approval(format="md")
def test_parse_dataset(out):
    write_samples(out, 
                  samples=p.load_history("../../datasets/air-quality.csv"),
                  title="Historical Air Pollution")

@approval(format="md")
def test_projection(out):
    end_year=2020
    write_samples(out,
                  samples=p.project(p.load_history("../../datasets/air-quality.csv"), to_year=end_year),
                  title="Air Pollution Projected to " + str(end_year))
