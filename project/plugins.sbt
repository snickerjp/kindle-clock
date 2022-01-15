addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.12")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.5")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.5")

addSbtPlugin("com.heroku" % "sbt-heroku" % "2.1.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.2")

addSbtPlugin("com.lightbend.sbt" % "sbt-javaagent" % "0.1.6")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.8"
