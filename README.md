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

License
========================================
Copyright (c) 2015, Akhilesh Srikanth

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
