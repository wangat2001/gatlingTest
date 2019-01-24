import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Rest extends Simulation { // 3

  val httpProtocol = http // 4
    .baseUrl("http://localhost:8080") // 5
    .acceptHeader("text/html,text/plain,application/json") // 6
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val scn = scenario("BasicSimulation") // 7
    .exec(http("restTemplate") // 8
    .get("/restTemplate")) // 9
    .pause(5) // 10

  setUp( // 11
    scn.inject(atOnceUsers(20)) // 12
  ).protocols(httpProtocol) // 13
}
