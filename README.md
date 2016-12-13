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
Hello World!
```

### #ee9800f8 "add manifest"

パッケージ時にマニフェストを追加するプラグインを追加

```terminal
mvn package
java -jar target/todo-1.0-SNAPSHOT-jar-with-dependencies.jar
Hello World!!
```

### #6b030832 "add debug exec"

デバッグ用実行のプラグインを追加

```terminal
mvn package
mvn exec:java
Hello World!
```
### #4b4d35a2 "add spring context"

SpringContextの追加とapplicationContextの読み込み処理を追加

```terminal
mvn package
mvn exec:java
12 13, 2016 2:08:23 午前 org.springframework.context.support.ClassPathXmlApplicationContext prepareRefres
情報: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@2120c610: startup date [Tue Dec 13 02:08:23 GMT 2016]; root of context hierarchy
12 13, 2016 2:08:24 午前 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
情報: Loading XML bean definitions from class path resource [applicationContext.xml]
Hello World!
```

### #95ed3315 "add jdbc"

JDBCの依存関係の追加、DB定義をapplicationContextに追加

### #23da95ca "add model&dao"

モデルとDAOを追加

### #ccb4b743 "data access"

main関数からコンテキストからDAOを呼び出す処理を追加

```terminal
mvn package
mvn exec:java
12 13, 2016 4:32:59 午前 org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
情報: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@7d009f: startup date [Tue Dec 13 04:32:59 GMT 2016]; root of context hierarchy
12 13, 2016 4:33:00 午前 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
情報: Loading XML bean definitions from class path resource [applicationContext.xml]
12 13, 2016 4:33:01 午前 org.springframework.context.support.PropertySourcesPlaceholderConfigurer loadProperties
情報: Loading properties file from class path resource [jdbc.properties]
12 13, 2016 4:33:01 午前 org.springframework.jdbc.datasource.DriverManagerDataSource setDriverClassName
情報: Loaded JDBC driver: org.h2.Driver
Hello World!2
```

