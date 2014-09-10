scalaVersion := "2.11.2"

name := "bananas"

organization in Global := "spectre"

lazy val common = (
  Project("bananas-common", file("common"))
  settings()
)

lazy val app = (
  Project("bananas-app", file("app"))
  dependsOn(common)
  settings()
)
