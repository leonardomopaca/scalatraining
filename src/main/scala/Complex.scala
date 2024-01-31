package teste

class Complex (real: Double, imaginary: Double):
  def re() = real
  def im() = imaginary


def CallComplex: Unit =
  new Complex(1.5, 2.3)

class Complex2 (real: Double, imaginary: Double):
  def re = real
  def im = imaginary

  override def toString() =
    "" + re + (if im >= 0 then " + " else "") + im + "i"

@main def CallComplex2: Unit =
  new Complex2(1.5, 2.3)
  val c = Complex2(1.5, 2.3)
  println("Overridden toString(): " + c.toString)
