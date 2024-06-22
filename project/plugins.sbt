resolvers ++= Resolver.sonatypeOssRepos("snapshots")

addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % "0.1.2")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.3")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")
