resolvers += Resolver.jcenterRepo
resolvers += "Github-API" at "http://repo.jenkins-ci.org/public/"
resolvers += "Era7 maven releases" at "https://s3-eu-west-1.amazonaws.com/releases.era7.com"

addSbtPlugin("ohnosequences" % "nice-sbt-settings" % "0.9.0")
