graal-native-image = /opt/graalvm/bin/native-image

gradle-cache-kotlin = $(HOME)/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/
gradle-cache-kotlinx = $(HOME)/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/
gradle-cache-antlr = $(HOME)/.gradle/caches/modules-2/files-2.1/org.antlr/

kotlin-jars-classpath = $(gradle-cache-kotlin)/kotlin-stdlib/1.3.61/4702105e97f7396ae41b113fdbdc180ec1eb1e36/kotlin-stdlib-1.3.61.jar:$(gradle-cache-kotlin)/kotlin-stdlib-common/1.3.61/65abb71d5afb850b68be03987b08e2c864ca3110/kotlin-stdlib-common-1.3.61.jar:$(gradle-cache-kotlin)/kotlin-stdlib-jdk7/1.3.61/70dffc5f8ac5ea7c34f30deac5b9d8b1d48af066/kotlin-stdlib-jdk7-1.3.61.jar
kotlinx-jars-classpath = $(gradle-cache-kotlinx)/kotlinx-cli-jvm/0.2.0-dev-6/f6dd7c04dc3db13e24c2579f6336ad10a1a444b/kotlinx-cli-jvm-0.2.0-dev-6.jar
antlr4-classpath = $(gradle-cache-antlr)/antlr4/4.7.1/51ef964b44323720bef371d569796af1f4e225ac/antlr4-4.7.1.jar:$(gradle-cache-antlr)/antlr4-runtime/4.7.1/946f8aa9daa917dd81a8b818111bec7e288f821a/antlr4-runtime-4.7.1.jar:$(gradle-cache)/org.antlr/ST4/4.0.8/a1c55e974f8a94d78e2348fa6ff63f4fa1fae64/ST4-4.0.8.jar:$(gradle-cache-antlr)/antlr-runtime/3.5.2/cd9cd41361c155f3af0f653009dcecb08d8b4afd/antlr-runtime-3.5.2.jar

create-binary:
	./gradlew compileKotlin compileJava && $(graal-native-image) -H:Class=nl.santa.interpreter.SantaKt -H:Name=santa \
	-cp build/classes/kotlin/main:build/classes/java/main:../grammar/build/classes/java/main:$(kotlin-jars-classpath):$(kotlinx-jars-classpath):$(antlr4-classpath) --language:js --initialize-at-build-time
