
import csv
from collections import namedtuple


Sample = namedtuple("Sample", ["time", "value"])


class TimeSeries(object):
    def __init__(self, samples):
        self.samples = sorted(samples, key=lambda s: s.time)
    
    def __getitem__(self, i):
        return self.samples[i]
    
    def __iter__(self):
        return iter(self.samples)



def load_history(fname):
    return TimeSeries([s for s in (Sample(float(row[0]), float(row[2])) 
                                   for row in list(csv.reader(open(fname)))[1:])
                       if s.value >= 0])


def project(history, to_year):
    first = history[0]
    last = history[-1]
    dvalue_dt = (last.value - first.value) / float(last.time - first.time)
    
    return TimeSeries([Sample(year, last.value + dvalue_dt*(year-last.time))
                       for year in range(int(last.time), to_year+1)])
