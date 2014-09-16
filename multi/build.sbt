scalaVersion := "2.11.2"

lazy val common = ProjectRef(file("common"), "bananas-common") 

lazy val app = ProjectRef(file("app"), "bananas-app")

lazy val root = project.in(file(".")).aggregate(common, app)
