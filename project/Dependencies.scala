import sbt._
import sbt.Keys._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Dependencies {

  object Ver {

    // Exported
    val Cats            = "2.4.2"
    val Scala212        = "2.12.13"
    val Scala213        = "2.13.5"
    val ScalaCollCompat = "2.4.2"
    val ScalaJsDom      = "1.1.0"
    val Scalaz          = "7.2.31"

    // Internal
    val MTest           = "0.7.7"
  }

  object Dep {
    val Cats            = Def.setting("org.typelevel"                 %%% "cats-core"               % Ver.Cats)
    val MTest           = Def.setting("com.lihaoyi"                   %%% "utest"                   % Ver.MTest)
    val ScalaCollCompat = Def.setting("org.scala-lang.modules"        %%% "scala-collection-compat" % Ver.ScalaCollCompat)
    val ScalaCompiler   = Def.setting("org.scala-lang"                  % "scala-compiler"          % scalaVersion.value)
    val ScalaJsDom      = Def.setting("org.scala-js"                  %%% "scalajs-dom"             % Ver.ScalaJsDom)
    val Scalaz          = Def.setting("org.scalaz"                    %%% "scalaz-core"             % Ver.Scalaz)
  }

}