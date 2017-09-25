package cofeehouse

object Main {
   def main(args: Array[String]): Unit = {
    new Cafe().buyCofee(new CreditCard(10000));
  }
}