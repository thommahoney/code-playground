//
// Example 1
//
// a function where one or more values are not yet bound
def func(x: Int, y: Int) = x + y

// a partially applied function, the second arg is not bound
val paFunc = func(1, _: Int)

// apply
paFunc(2)


//
// Example 2
//
def curryFunc(x: Int): (Int) => Int = {
  (y: Int) => x + y
}

// paFun2 is a partially applied function, 
// because while x has been bound, y has not 
val paFunc2 = curryFunc(1)

// apply
paFunc2(2)