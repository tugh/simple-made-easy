name := "simple-made-easy"

version := "0.1"

scalaVersion := "2.13.1"

// versions
val scalacheckV = "1.14.1"

// dependencies
val scalacheck = "org.scalacheck" %% "scalacheck" % scalacheckV % Test

libraryDependencies ++= Seq(scalacheck)
