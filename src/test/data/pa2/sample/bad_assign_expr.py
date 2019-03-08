x:int = 0
y:int = 0
z:bool = False

x = z = 1    # Only one error here (assignment to `x` should succeed because `z = 1`:`int`, the type of RHS)
x = y = None # Only one error here (assignment to `x` should succeed because `y = None`:`int`, the type of LHS)
x = y = []   # Only one error here (assignment to `x` should succeed because `y = []`:`int`, the type of LHS)
x = a = None # Two errors here (assignment to `x` should fail because `a = None`:`object`, since `a` is not a var)
x = a = []   # Two errors here (assignment to `x` should fail because `a = []`:`object`, since `a` is not a var)
x = y = True # Two errors here (assignment to `x` should fail because `y = True`:`bool`, the type of RHS)
