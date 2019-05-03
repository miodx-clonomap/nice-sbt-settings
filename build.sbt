name := "nice-sbt-settings"
organization := "com.miodx.sbt.plugins"
version := "0.8.0"
description := "sbt plugin accumulating some useful and nice sbt settings"

sbtPlugin := true
scalaVersion := "2.10.7"
bucketSuffix := "era7.com"

addSbtPlugin("com.miodx.common"  % "sbt-s3-resolver"    % "0.15.0")  // https://github.com/ohnosequences/sbt-s3-resolver
addSbtPlugin("com.miodx.common"  % "sbt-github-release" % "0.4.0")   // https://github.com/ohnosequences/sbt-github-release
addSbtPlugin("com.eed3si9n"      % "sbt-assembly"       % "0.14.5")  // https://github.com/sbt/sbt-assembly
addSbtPlugin("com.timushev.sbt"  % "sbt-updates"        % "0.3.0")   // https://github.com/rtimush/sbt-updates
addSbtPlugin("laughedelic"       % "literator"          % "0.7.1")   // https://github.com/laughedelic/literator
addSbtPlugin("com.markatta"      % "taglist-plugin"     % "1.3.1")   // https://github.com/johanandren/sbt-taglist
addSbtPlugin("org.wartremover"   % "sbt-wartremover"    % "1.2.1")   // https://github.com/puffnfresh/wartremover

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-s3" % "1.11.27"
)

wartremoverErrors in (Compile, compile) := Seq()
// wartremoverWarnings ++= Warts.allBut(Wart.NoNeedForMonad)

dependencyOverrides ++= Set(
  "commons-codec"              % "commons-codec"    % "1.10",
  "com.fasterxml.jackson.core" % "jackson-core"     % "2.5.4",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.5.4",
  "org.apache.httpcomponents"  % "httpclient"       % "4.3.6",
  "com.jcraft"                 % "jsch"             % "0.1.50",
  "joda-time"                  % "joda-time"        % "2.8"
)
