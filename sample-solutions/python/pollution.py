
from collections import namedtuple
import pandas

def load_history(fname):
    return pandas.read_csv(fname, index_col='Year')

def project(history, to_year):
    new_index = range(history.index[0], to_year+1)
    return history.reindex(new_index).interpolate(method='spline', order=2)

