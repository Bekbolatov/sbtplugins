package com.sparkydots.sbt

import sbt.Keys._
import sbt._
import sbt.complete.Parsers._

/**
 * Created date: 1/6/15 6:37 PM.
 *
 */
object FilterWord extends AutoPlugin {

  object autoImport {
    val defaultWord = settingKey[String]("Word set for sayWord command")
    val sayWord = inputKey[Unit]("Print the word")
  }

  import com.sparkydots.sbt.FilterWord.autoImport._

  override def projectSettings: Seq[Setting[_]] = Seq(
    sayWordSetting
  )


  private val argsParser = (Space ~> StringBasic).*


  def sayWordSetting =
    sayWord := {
      println("-- sayWord: Begin --")
      val log = streams.value.log

      val args = argsParser.parsed
      log.debug(s"args = $args")


      val label = if (args.isEmpty) {
        defaultWord.?.value.getOrElse("<no input word provided and key 'defaultWord' is not set>)")
      } else {
        args.mkString(", ")
      }

      println( label)

      println("-- sayWord: End --")
    }
}
