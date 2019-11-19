all:

compile:
	javac src/avaj/simulator/*.java

re: clean compile

clean:
	find . -depth -name "*.class" -delete
