MineSweeper Solver
=====================================
Basic implementation of a minesweeper solver

Usage
=====================================
To start with,
```scala
import minesolve._
```

after which calling the function like so,

```scala
val solution = MineSolver("...*\n*..*\n...*").solve()

solution.foreach(x => println(x.mkString))
```

prints the required solution.
