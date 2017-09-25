package test

object MyModule {
  
	def factorial(n: Int): Int = {
	@annotation.tailrec
	def go(n: Int, acc: Int): Int =
	if (n <= 0) acc
	else go(n-1, n*acc)
	go(n, 1)
	}

	private def formatResult(name: String, n: Int, f: Int => Int) = {
	val msg = "The %s of %d is %d."
	//print(f)
	msg.format(name,n,f(n))
	}
	
	def abs(n:Int): Int=
	if(n<0) -n
	else
	n

	
	def main(args: Array[String]): Unit = {
	println(formatResult("absolute value", -42, abs))
	println(formatResult("factorial", 7, factorial))
	// passing anonymous funtion in a function
	println(formatResult("Increment",7,(x: Int)=>x+1 ))
	println(formatResult("Increment",7,(x)=>x+1 ))
	println(formatResult("Increment",7,x=>x+1 ))
	// here _ refer the sole argument of function 
	println(formatResult("Increment",7,_+1 ))
	println(formatResult("Increment",7,x=>{val r=x+1;r} ))
	}
}