// A function which only accepts a subset of values for its arguments, e.g. a function which takes a possitive Int but not a negative Int

// Good explanations
// http://blog.bruchez.name/2011/10/scala-partial-functions-without-phd.html
// http://www.scala-lang.org/api/current/index.html#scala.PartialFunction


//Example 1
val squareFunction = new PartialFunction[Int, Int] {
  def apply(x: Int): Int = x * x
  
  // you have to call this method manually, there is no magick here
  def isDefinedAt(x: Int) = x > 0
}

// returns a list with the element 4
// because isDefined returns true for a positive integer
// TraversableLike's collect method explicitly calls isDefined on our function
Seq(2).collect(squareFunction)

// returns an empty list
// because isDefined returns false for a negative integer
Seq(-2).collect(squareFunction)


// Example 2
// Example 1 is the same as writing
def square2: PartialFunction[Int, Int] = {
  case x: Int if(x > 0) => x * x
}
square2(2)

// however, this throws a MatchError exception
// whereas in example 1 it wouldn't!
try {
  square2(-1)
} catch {
  case e: MatchError => println("MatchError!")
}

