# Spring JDBCのサンプルプロジェクト作成

## mavenでプロジェクトの雛形を作成

```terminal
mvn archetype:generate -DinteractiveMode=false -DarchetypeArtifactId=maven-archetype-quickstart -DgroupId=com.sample -DartifactId=todo
```

## commitごとの解説
### #4b1bb729 "init"

mavenでプロジェクトの雛形を作成

```teminal
mvn package
java -cp target/todo-1.0-SNAPSHOT.jar com.sample.App
>Hello World!
```

### #e50fe779 "add manifest"

パッケージ時にマニフェストを追加するプラグインを追加

```terminal
mvn package
java -jar target/todo-1.0-SNAPSHOT-jar-with-dependencies.jar
>Hello World!!
```

### #71bf439 "add debug exec"

デバッグ用実行のプラグインを追加

```terminal
mvn package
mvn exec:java
>Hello World!
```
### #xxxx "add spring context"

SpringContextの追加とapplicationContextの読み込み処理を追加

```terminal
mvn package
mvn exec:java
>12 13, 2016 2:08:23 午前 org.springframework.context.support.ClassPathXmlApplicationContext prepareRefres
>情報: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@2120c610: startup date [Tue Dec 13 02:08:23 GMT 2016]; root of context hierarchy
>12 13, 2016 2:08:24 午前 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
>情報: Loading XML bean definitions from class path resource [applicationContext.xml]
>Hello World!
```




