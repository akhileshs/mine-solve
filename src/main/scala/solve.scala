package minesolve

// author: Akhilesh Srikanth (akhilesh.srikanth@gmail.com)

class MineSolver(input: String) {
  val grid = input.split("\n").map(_.toArray)

  def isMine(cell: (Int, Int)) = {
    grid.lift(cell._1) flatMap { row =>
      row.lift(cell._2) flatMap { cell =>
        cell match {
          case '*' => Some(1)
          case _   => None
        }
      }
    }
  }

  def neighbourCells(x: Int, y: Int) = {
    (x-1 to x+1) flatMap { row =>
      (y-1 to y+1) map { col =>
        (row, col)
      }
    }
  }

  def score(x: Int, y: Int) = isMine((x, y)) match {
    case Some(_) => " "
    case None => neighbourCells(x, y).flatMap(isMine).sum.toString
  }

  def solve () = {
    grid.indices.map(x =>
        grid(x).indices.map(y =>
            score(x, y)))
  }
}

object MineSolver {
  def apply(input: String) = new MineSolver(input);
}
