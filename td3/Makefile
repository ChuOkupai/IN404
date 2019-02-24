clean:
	rm -f *.class

File.class: File.java
	javac $<

Directory.class: Directory.java File.class
	javac $<

Regular.class: Regular.java File.class
	javac $<

Main.class: Main.java Regular.class Directory.class File.class
	javac $<

run: Main.class
	java Main

all: File.class Directory.class Regular.class Main.class