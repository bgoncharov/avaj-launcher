all: compile

compile:
	@javac avaj_launcher/*.java
	@echo "Compiling ...."
	@java avaj_launcher.Main scenario.txt
	@echo "Done!"

re: compile

clean:
	@find . -depth -name "*.class" -delete
	@rm simulation.txt
