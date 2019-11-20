all:

compile:
	javac avaj_launcher/*.java

re: compile

clean:
	find . -depth -name "*.class" -delete
