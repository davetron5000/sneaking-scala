/*
PostfixExp      -> PrimaryExp ( "[" Exp "]" 
                                | . id "(" ExpList ")" 
                                | . length )*
*/

object MyParser {
  type E = Expression

  def postfixExp = primaryExp ~ rep(
      "[" ~> expr <~ "]" ^^ { e => ElementExpression(_:E, e) }
    | "." ~ "length" ^^^ LengthExpression
    | "." ~> ident ~ ("(" ~> repsep(expr, ",") <~ ")") ^^ flatten2 { (f, args) =>
        CallMethodExpression(_:E, f, args)
      }
  ) ^^ flatten2 { (e, ls) => collapse(ls)(e) }

  def expr: Parser[E] = ...

  def collapse(ls: List[E=>E])(e: E) = {
    ls.foldLeft(e) { (e, f) => f(e) }
  }
}
