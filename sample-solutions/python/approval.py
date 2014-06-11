
import os
from filecmp import cmp as file_contents_equal



def approve(test_fn, format, args, kwargs):
    test_name = test_fn.__module__ + "." + test_fn.__name__
    received_file = test_name + "-received." + format
    approved_file = test_name + "-approved." + format
    
    with open(received_file, mode="w") as received:
        test_fn(received, *args, **kwargs)
    
    assert file_contents_equal(received_file, approved_file)
    os.remove(received_file)
    


def approval(format="txt"):
    def decorator(test_fn):
        def run_approval(*args, **kwargs):
            approve(test_fn, format, args, kwargs)
        return run_approval
    return decorator


    
