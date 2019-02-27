JC=javac
JFLAGS=-g -sourcepath src -d classes
CDFLAGS=-cp classes

clean:
	rm -f classes/*.class

File.class: src/File.java
	$(JC) $(JFLAGS) $< $(CDFLAGS)

Directory.class: src/Directory.java File.class
	$(JC) $(JFLAGS) $< $(CDFLAGS)

Regular.class: src/Regular.java File.class
	$(JC) $(JFLAGS) $< $(CDFLAGS)

Main.class: src/Main.java Regular.class Directory.class File.class
	$(JC) $(JFLAGS) $< $(CDFLAGS)

run: Main.class
	java $(CDFLAGS) Main

all: File.class Directory.class Regular.class Main.class mv