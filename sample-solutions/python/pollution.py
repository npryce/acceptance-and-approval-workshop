
from collections import namedtuple
import pandas as pd

class sample(namedtuple('_sample', ['year', 'roadside_pm10', 'urban_pm10', 'rural_ozone', 'urban_ozone'])):
    pass

class samples:
    def __init__(self, history):
        self.history = history
        
    def __iter__(self):
        return iter(self._samples)

    def project(to):
        d_year = float(self.history[-1].year - self.history[0].year)

def load_history(fname):
    return pd.read_csv(fname, skiprows=17, index_col='Year')

def project(history, to_year):
    new_index = range(history.index[0], to_year+1)
    return history.reindex(new_index).interpolate(method='spline', order=2)


