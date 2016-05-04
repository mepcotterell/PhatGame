name := "phatgame"

organization := "michaelcotterell"

version := "0.1"

autoScalaLibrary := false

unmanagedSourceDirectories in Compile <<= Seq(javaSource in Compile).join

unmanagedSourceDirectories in Test <<= Seq(javaSource in Test).join

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test->default"

fork in run := true