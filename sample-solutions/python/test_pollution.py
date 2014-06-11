

import pollution as p

def cell_str(n):
    return str(n) if n is not None else ""

def row_str(cells):
    return "| " + str.join(" | ", cells) + " |"

def ident_to_str(s):
    return s.replace("_", " ")

print "Historical Air Pollution"
print "========================"
print ""
print row_str(map(ident_to_str, p.sample._fields))
for row in p.load_history("../../datasets/air-quality.csv"):
    print row_str(map(cell_str,row))


