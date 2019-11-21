all:

compile:
	javac avaj_launcher/*.java
	java avaj_launcher.Main scenario.txt

re: compile

clean:
	find . -depth -name "*.class" -delete
