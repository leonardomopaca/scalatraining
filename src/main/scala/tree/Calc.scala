package tree
import Tree.*


@main def Calc: Unit =
  val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
  val env: Environment = {case "x" => 5 case "y" => 7}
  println("\nExpression: " + exp)
  println("\nEvaluation with x=5 , y=7: " + eval(exp, env))
  println("\nDerivative relative to x:\n" + derive(exp, "x"))
  println("\nDerivative relative to y:\n" + derive(exp, "y"))

def eval(t: Tree, ev: Environment): Int = t match
  case Sum(l, r) => eval(l, ev) + eval (r, ev)
  case Var(n) => ev(n)
  case Const(v) => v

def derive(t: Tree, v: String): Tree = t match
  case Sum(l, r) => Sum(derive(l, v), derive(r, v))
  case Var(n) if v == n => Const(1)
  case _ => Const(0)


