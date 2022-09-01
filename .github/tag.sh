#!/bin/bash

fail() {
  echo "$@" 1>&2
  exit 1
}


# Determine TAG name by ext.kalturaClientVersion in version.gradle
VERSION_LINE=$(grep 'ext.kalturaClientVersion' version.gradle)
VERSION_PATTERN="'(.+)'"

[[ $VERSION_LINE =~ $VERSION_PATTERN ]] || fail "Can't find version in version.gradle"

VERSION=${BASH_REMATCH[1]}
TARGET_TAG="$VERSION"

# Release to GitHub (creates tag + release notes)
cat << EOF > post.json
{
  "name": "v$VERSION",
  "body": "# Kaltura Client Library\n\n## Gradle line (Maven)\n\n\`implementation 'com.kaltura:KalturaAndroidClient:$VERSION'\`",
  "tag_name": "$TARGET_TAG",
  "target_commitish": "$GITHUB_SHA"
}
EOF

POST_URL=https://api.github.com/repos/$GITHUB_REPOSITORY/releases

curl $POST_URL -X POST -H "Content-Type: application/json" -H "authorization: Bearer $GITHUB_TOKEN" -d@post.json
