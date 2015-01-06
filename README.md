# Summary
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/pollseed/techgraspfy?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status](https://travis-ci.org/pollseed/techgraspfy.svg)](https://travis-ci.org/pollseed/techgraspfy)
[![Circle CI](https://circleci.com/gh/pollseed/techgraspfy.svg?style=svg)](https://circleci.com/gh/pollseed/techgraspfy)

Technology Grasp tool by Scala

## Required
* Sbt 0.13.5 (cannot use old version)
* Scala 2.11
* Slick(for Scala DB access API Lib)
* Playframework 2.3.6 (cannot use old version)
* eclipse
 
## Started

### Hit This CMD

```
$ activator
$ eclipse with-source=true or eclipse
$ run
```
### In Failure Case
Please Check Sbt and Scala, Play version. If version you have the Technology is wrong, does not have successfull result.

## Structure

### Serverside
* [Playframework](https://www.playframework.com/) - Scala

### Frontside
* Scala Template
* JavaScript+jQuery+Ajax
* CSS
 
### Middleside
* MySQL(tmp) >= 5.6

## Development

### localServer

# Memo
今後、このリポジトリは更新されません。CRUD処理が出てきたので、公開で作るわけには行かなくなりました。

というわけで、private repoに移行

buildパスしてるので、簡単に使えるように編集はします

# Other
## In case play-Java

### 1. new activator

```.sh
activator new
```

### 2. select template by 1 to 6

```
Browse the list of templates: http://typesafe.com/activator/templates
Choose from these featured templates or enter a template name:
  1) minimal-akka-java-seed
  2) minimal-akka-scala-seed
  3) minimal-java
  4) minimal-scala
  5) play-java
  6) play-scala
(hit tab to see a list of all templates)
```

For example → 5

### 3. name project

```
Enter a name for your application (just press enter for 'play-java')
```

For example test-play-java

### 4. type cmd

```.sh
cd test-play-java
activator
eclipse with-source=true
run
```

play-javaの方もこの手順で起動することができる。

### 注意点
Libraryの依存関係をいじった場合以下の手順で最新の状態にすること

```.sh
activator
reload
eclipse with-source=true
package
```
