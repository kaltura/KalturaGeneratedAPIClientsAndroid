#!/bin/bash

fail() {
  echo "$@" 1>&2
  exit 1
}

 chmod +x gradlew
 
 # Create javadoc jar, sources jar, pom
./gradlew KalturaClient:build
./gradlew KalturaClient:publishReleasePublicationToMavenLocal

# Upload
./gradlew publishReleasePublicationToSonatypeRepository --max-workers 1 #closeAndReleaseSonatypeStagingRepository
