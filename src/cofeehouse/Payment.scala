package cofeehouse

class Payment {
  def charge(cc: CreditCard,price: Double){
    print(" payment initiated for price: "+price)
  }
}