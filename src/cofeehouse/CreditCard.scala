package cofeehouse

class CreditCard( val cardNo:Long) {
 
  def charge(price: Double){
    print(this.cardNo+" debited with amount: "+price)
  }
}