package teste

import java.time.LocalDate
import java.time.format.{DateTimeFormatter, FormatStyle}
import java.util.Locale.FRANCE
import javax.security.auth.callback.Callback

@main def FrenchDate:Unit =
  val now = LocalDate.now
  val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(FRANCE)
  println(df.format(now))
  //oncePerSecond(timeFlies)
  oncePerSecond(() => println("time flies like and arrow... "))


def oncePerSecond(callback: () => Unit): Unit =
  while true do {callback(); Thread.sleep(1000)}

def timeFlies(): Unit =
  println("time flies like an arrow")