// Currying is the technique of transforming a function that takes multiple arguments 
// in such a way that it can be called as a chain of functions, each with a single argument (partial application)
//
// Good explanations
// http://slid.es/gsklee/functional-programming-in-5-minutes

// our calculation
def func1(x: Int, y: Int) = x + y

func1(1, 2)

// Example 1
// a version of our calculation which returns a function
def func2(x: Int): (Int) => Int  = {
  (y: Int) => x + y
}

// currying (a chain of function calls)
func2(1)(2)

// Example 2
// a version of our calculation which takes a function and returns a function
def func3(anonFunc: (Int) => Int): (Int) => Int = {
  (y: Int) => anonFunc(y)
}

// currying (a chain of function calls)
func3((x: Int) => x * x)(3)
