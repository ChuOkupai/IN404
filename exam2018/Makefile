clean:
	rm -f ex*/*.class

ex%/Main.class: ex% ex%/*.java
	javac -sourcepath $< $</Main.java

run: ex1/Main.class ex2/Main.class
	java -cp ex1 Main
	java -cp ex2 Main