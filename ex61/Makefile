JC=javac
CFLAGS=-g -sourcepath src -d classes

clean:
	rm -rf classes *.jar

FileSystem.jar: src/*.java
	mkdir -p classes
	$(JC) $(CFLAGS) src/*.java
	jar -cfe $@ Main -C classes .

run: FileSystem.jar
	java -jar $< Main