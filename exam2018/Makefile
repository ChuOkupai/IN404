clean:
	rm -f ex*/*.class

ex%/Main.class: ex% ex%/*.java
	javac -Werror -sourcepath $< $</Main.java

run1: ex1/Main.class
	java -cp ex1 Main

run2: ex2/Main.class
	java -cp ex2 Main