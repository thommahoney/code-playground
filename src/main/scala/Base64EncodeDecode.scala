import org.apache.commons.codec.binary.Base64
import java.math.BigInteger
import org.apache.commons.codec.CharEncoding
import org.joda.time.DateTime


object Base64EncodeDecode extends App {

  val now = DateTime.now

  println(s"now $now")

  val encoded = encode(now.getMillis)
  println(s"encoded $encoded")

  val decoded = decode(encoded)
  println(s"decoded $decoded")

  val nowDecoded = new DateTime(decoded.toLong)
  println(s"now $nowDecoded")

  def encode(timestamp: Long): String =  {
    val bytes = BigInteger.valueOf(timestamp).toByteArray()
    new String(Base64.encodeBase64(bytes, false), CharEncoding.UTF_8)
  }

  def decode(string: String): Long = {
    val bytes = Base64.decodeBase64(string.getBytes())
    decode(bytes.toList, 0l)
  }

  private def decode(bytes: List[Byte], value: Long): Long = {
    if(bytes.isEmpty) return value

    val n = (value << 8) + (bytes.head & 0xff)
    decode(bytes.tail, n)
  }
}
