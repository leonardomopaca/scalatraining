
package tree

enum Tree:
  case Sum(l: Tree, r: Tree)
  case Var(n: String)
  case Const(v: Int)

type Environment = String => Int
val ev: Environment = {case "x" => 5}

