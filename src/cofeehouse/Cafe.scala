package cofeehouse

class Cafe {
  val cardNo:Long=1000
  val cofeePrice:Double=10.50
  //dificult to test as required to mock cc
  // here its have some design problem because creditcard dont have 
  //any information about charging how to contact to credit card companey 
  /*
  def buyCofee(cc: CreditCard):Cofee={
    val cup=new Cofee(cofeePrice)
    cc.charge(cup.price)
    cup
  }*/
  //for making it more modular and testable
  // problem still exit we have to mock payment interface
  //there is no reusability of buyCofee
  //what if someone order 12 cup of coffee
  // mybe a solution to batchup coffee for letter pay use BatchingPayments
 def buyCofee(cc: CreditCard,pp:Payment): Cofee={
   val cup=new Cofee(cofeePrice);
   pp.charge(cc, cup.price)
   cup
 }
 
 // functional solution
 
 def buyCofee(cc: CreditCard):(Cofee, Charge)={
   val cup=new Cofee(cofeePrice)
   (cup, Charge(cc, cup.price))
 }
 
 def buyCofees(cc: CreditCard, n: Int):(List[Cofee], Charge)={
   val purchases: List[(Cofee, Charge)]=List.fill(n)(buyCofee(cc))
   val (coffees, charges)=purchases.unzip
   (coffees, charges.reduce((c1,c2)=>c1.combine(c2)))
 }
 
 
 
 
}