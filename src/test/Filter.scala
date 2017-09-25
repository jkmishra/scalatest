package test

object Filter {
  def activeById(us: Seq[User]) = us.filter(_.active).sortBy(_.id).map(_.lastname)
  val activeUsersById = activeById(Seq(
    User(11, "Nick", "Smith", false),
    User(89, "Ken", "Pratt", true),
    User(23, "Jack", "Sparrow", true)))
    def main(args: Array[String]): Unit = {
     print( activeUsersById)
    }
}