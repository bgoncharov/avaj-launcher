all:

compile:
	javac src/avaj/simulator/*.java

re: compile

clean:
	find . -depth -name "*.class" -delete
