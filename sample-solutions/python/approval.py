
import os
from filecmp import cmp as file_contents_equal


def _extension(template_file, format):
    if format is not None:
        return "." + format
    elif template_file is not None:
        return os.path.splitext(template_file)[1]
    else:
        return ".txt"

def approve(test_fn, template_file, format, args, kwargs):
    test_name = test_fn.__module__ + "." + test_fn.__name__
    extension = _extension(template_file, format)    
    received_file = test_name + "-received" + extension
    approved_file = test_name + "-approved" + extension
    
    with open(received_file, mode="w") as received:
        if template_file is None:
            test_fn(received, *args, **kwargs)
        else:
            received.write(open(template_file).read().format(**test_fn(*args, **kwargs)))
    
    assert file_contents_equal(received_file, approved_file)
    
    os.remove(received_file)


def approval(template=None, format=None):
    def decorator(test_fn):
        def run_approval(*args, **kwargs):
            approve(test_fn, template, format, args, kwargs)
        return run_approval
    return decorator
