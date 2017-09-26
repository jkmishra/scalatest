sealed trait PersonService{
  def getPerson():String
}
private class PersonServiceImpl(private[this] val jString:String) extends PersonService {
			override def toString =jString
			def getMsg():String={
					return this.jString
			}
	override def getPerson():String={
	  return"you can call dao here"
	}
	println("hello constructor")
}
object PersonServiceImpl {
  private lazy val instance:PersonServiceImpl  = PersonServiceImpl("MyServiceImpl")
	def sayhello():String={
					return instance.getMsg()
	}
	def sayhello1():String={
					return instance.getMsg()
	}
	private def apply(base:String) = new PersonServiceImpl(base)
}

