package forex.services.rates

object errors {

  sealed trait Error
  object Error {
    final case class OneFrameLookupFailed(msg: String) extends Error
    final case class OneFrameTimeout() extends Error
    final case class OneFrameNotCurrencyPair() extends Error
    final case class OneFrameUnknownError() extends Error
  }

}
