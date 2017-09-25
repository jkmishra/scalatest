package cofeehouse

class Cafe {
  val cardNo:Long=1000
  val cofeePrice:Double=10.50
  def buyCofee(cc: CreditCard):Cofee={
    val cup=new Cofee(cofeePrice)
    cc.charge(cup.price)
    cup
  }
 
}