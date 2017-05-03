name := "quaich-slack-lunch"
organization := "com.virtuslab"
version := "0.0.1-SNAPSHOT"
    
scalaVersion := "2.12.2"
retrieveManaged := true
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.0",
  "codes.bytes" %% "quaich-http" % "0.0.2-SNAPSHOT",

  "commons-io" % "commons-io" % "2.4",

  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
  
scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-deprecation",
  "-language:_"/*,
  "-Ymacro-debug-lite"*/
)

fork in (Test, run) := true

enablePlugins(AWSLambdaPlugin)

lambdaName := Some("quaich-slack-lunch")
handlerName := Some("ga.pdole.quaich.slack.lunch.SlackLambda::handleRequest")
s3Bucket := Some("ga.pdole.quaich-slack-lunch")
awsLambdaMemory := Some(192)
region := Some("eu-west-1")


