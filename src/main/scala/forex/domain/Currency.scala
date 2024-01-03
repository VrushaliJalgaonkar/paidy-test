package forex.domain

import cats.Show
import enumeratum.{ CirceEnum, Enum, EnumEntry }

trait Uppercase extends EnumEntry {
  override def entryName: String = super.entryName.toUpperCase
}

sealed trait Currency extends Uppercase

object Currency extends Enum[Currency] with CirceEnum[Currency] {
  case object AUD extends Currency
  case object CAD extends Currency
  case object CHF extends Currency
  case object EUR extends Currency
  case object GBP extends Currency
  case object NZD extends Currency
  case object JPY extends Currency
  case object SGD extends Currency
  case object USD extends Currency

  implicit val show: Show[Currency] = Show.fromToString

  def fromString(s: String): Currency =
    withNameInsensitive(s)

  val values: IndexedSeq[Currency] = findValues

  val currPairs: List[(Currency, Currency)] =
  values.toList.combinations(2).flatMap {
    case List(from, to) => List((from, to), (to, from))
    case _ => Nil  // Handle other cases, like single element or empty list
  }.toList

}
