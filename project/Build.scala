import sbt._
import Keys._

object YagniBuild extends Build {
    lazy val root = Project(id = "yagni",
                            base = file(".")) aggregate(`yagni-api`, `yagni-central`)

    lazy val `yagni-api` = Project(id = "yagni-api",
                           base = file("yagni-api"))

    lazy val `yagni-central` = Project(id = "yagni-central",
                           base = file("yagni-central"))


}