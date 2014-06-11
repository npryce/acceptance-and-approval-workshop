
from collections import namedtuple
import csv

sample = namedtuple('sample', [
        'year', 'roadside_pm10', 'urban_pm10', 'rural_ozone', 'urban_ozone'])

def opt_num(s):
    return float(s) if s != "" else None

def parse_row(row):
    return sample(int(row[0]), *tuple(map(opt_num, row[1:])))

def load_history(fname):
    return map(parse_row, list(csv.reader(open(fname)))[18:])

