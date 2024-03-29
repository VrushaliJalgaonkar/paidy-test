package forex.services.rates

import forex.domain.Rate
import errors._

trait Algebra[F[_]] {
  def get(pair: Rate.Pair): F[Error Either Rate]
  def getMany(pairs: Seq[Rate.Pair]): F[List[Rate]]
}
