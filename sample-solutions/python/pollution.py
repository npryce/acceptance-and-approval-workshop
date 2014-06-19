
import csv
from collections import namedtuple


Sample = namedtuple("Sample", ["year", "value"])


class TimeSeries(object):
    def __init__(self, samples):
        self.samples = sorted(samples, key=lambda s: s.year)
    
    def __getitem__(self, i):
        return self.samples[i]
    
    def __iter__(self):
        return iter(self.samples)



def load_history(fname):
    return TimeSeries([Sample(int(year), float(sample)) for year, sample in list(csv.reader(open(fname)))[1:]])


def project(history, to_year):
    first = history[0]
    last = history[-1]
    dvalue_dt = (last.value - first.value) / float(last.year - first.year)
    
    return TimeSeries([Sample(year, last.value + dvalue_dt*(year-last.year))
                       for year in range(last.year, to_year+1)])

    
