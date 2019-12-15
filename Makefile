graal-native-image = /opt/graalvm/bin/native-image

gradle-cache = $(HOME)/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/
kotlin-jars-classpath = $(gradle-cache)/kotlin-stdlib/1.3.61/4702105e97f7396ae41b113fdbdc180ec1eb1e36/kotlin-stdlib-1.3.61.jar:$(gradle-cache)/kotlin-stdlib-common/1.3.61/65abb71d5afb850b68be03987b08e2c864ca3110/kotlin-stdlib-common-1.3.61.jar:$(gradle-cache)/kotlin-stdlib-jdk7/1.3.61/70dffc5f8ac5ea7c34f30deac5b9d8b1d48af066/kotlin-stdlib-jdk7-1.3.61.jar

create-binary:
	./gradlew compileKotlin compileJava && $(graal-native-image) -H:Class=nl.santa.PrettyPrintJSON -H:Name=santa \
	-cp build/classes/kotlin/main:build/classes/java/main:$(kotlin-jars-classpath) --language:js --initialize-at-build-time
