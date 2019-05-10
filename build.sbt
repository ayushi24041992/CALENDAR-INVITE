name := "SendInviteUsingGoogleApi"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq("com.google.apis" % "google-api-services-calendar" % "v3-rev377-1.25.0"
, "com.google.api-client" % "google-api-client" % "1.23.0", "com.google.oauth-client" % "google-oauth-client-jetty" % "1.28.0")