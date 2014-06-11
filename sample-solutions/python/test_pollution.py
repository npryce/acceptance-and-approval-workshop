
from approval import approval
import pollution as p


def cell_str(n):
    return str(n) if n is not None else ""

def row_str(cells):
    return "| " + str.join(" | ", cells) + " |\n"

def ident_to_str(s):
    return s.replace("_", " ")


@approval(format="md")
def test_parse_dataset(r):
    r.write("Historical Air Pollution\n")
    r.write("========================\n")
    r.write("\n")
    r.write(row_str(map(ident_to_str, p.sample._fields)))
    for row in p.load_history("../../datasets/air-quality.csv"):
        r.write(row_str(map(cell_str,row)))

