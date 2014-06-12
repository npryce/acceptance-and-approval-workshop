
from approval import approval
import pollution as p


def cell_str(n):
    return str(n) if n is not None else ""

def row_str(cells):
    return "| " + str.join(" | ", cells) + " |\n"

def ident_to_str(s):
    return s.replace("_", " ")

def write_samples(r, samples, title=None):
    if title is not None:
        r.write(title + "\n")
        r.write("="*len(title)+"\n")
        r.write("\n")
    r.write(row_str(map(ident_to_str, p.sample._fields)))
    for row in p.load_history("../../datasets/air-quality.csv"):
        r.write(row_str(map(cell_str,row)))

@approval(format="md")
def test_parse_dataset(out):
    write_samples(out, 
                  samples=p.load_history("../../datasets/air-quality.csv"),
                  title="Historical Air Pollution")

@approval(format="md")
def test_projection(out):
    end_year=2020
    write_samples(out,
                  samples=p.load_history("../../datasets/air-quality.csv").project(to=end_year),
                  title="Air Pollution Projected to " + str(end_year))
