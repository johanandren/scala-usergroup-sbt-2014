name := "bananas-app"

lazy val root = Project("bananas-app", file("."))
  .dependsOn(ProjectRef(file("../common"), "bananas-common")) 
