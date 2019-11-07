package object core {
  def frequencies[A](i: Iterable[A]): Map[A, Int] = {
    def aux(i: Iterable[A], acc: Map[A, Int]): Map[A, Int] = i match {
      case head :: tail =>
        aux(tail, acc ++ Map(head -> (acc.getOrElse(head, 0) + 1)))
      case Nil =>
        acc
    }

    aux(i, Map.empty[A, Int])
  }

  def mapcat[A, B](f: A => B, colls: Iterable[A]*): Iterable[B] = {
    colls.foldLeft(Iterable.empty[B])((acc, a) => acc ++ a.map(f))
  }
}
