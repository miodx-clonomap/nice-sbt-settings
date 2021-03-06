## Linting settings

This module adds settings to use the [wartremover](https://github.com/typelevel/wartremover)
linting plugin, which warns you about different "warts" in your code.


```scala
package ohnosequences.sbt.nice

import sbt._, Keys._
import wartremover._

case object WartRemoverSettings extends sbt.AutoPlugin {

  override def trigger = allRequirements
  override def requires = WartRemover
```

### Settings

```scala
  override def projectSettings: Seq[Setting[_]] = Seq(
    wartremoverErrors in (Compile, compile) := Warts.unsafe,
    wartremoverErrors in (Test,    compile) := Warts.unsafe
  )

}

```




[main/scala/AssemblySettings.scala]: AssemblySettings.scala.md
[main/scala/Git.scala]: Git.scala.md
[main/scala/JavaOnlySettings.scala]: JavaOnlySettings.scala.md
[main/scala/MetadataSettings.scala]: MetadataSettings.scala.md
[main/scala/package.scala]: package.scala.md
[main/scala/release/commands.scala]: release/commands.scala.md
[main/scala/release/keys.scala]: release/keys.scala.md
[main/scala/release/parsers.scala]: release/parsers.scala.md
[main/scala/release/tasks.scala]: release/tasks.scala.md
[main/scala/ReleasePlugin.scala]: ReleasePlugin.scala.md
[main/scala/ResolverSettings.scala]: ResolverSettings.scala.md
[main/scala/ScalaSettings.scala]: ScalaSettings.scala.md
[main/scala/StatikaBundleSettings.scala]: StatikaBundleSettings.scala.md
[main/scala/Version.scala]: Version.scala.md
[main/scala/VersionSettings.scala]: VersionSettings.scala.md
[main/scala/WartRemoverSettings.scala]: WartRemoverSettings.scala.md