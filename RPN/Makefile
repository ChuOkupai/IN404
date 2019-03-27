clean:
	rm -rf bin

build: src/*.java
	mkdir -p bin
	javac -sourcepath src -d bin $^

run: build
	java -cp bin Main