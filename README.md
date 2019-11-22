## What is this project about?

Frankfurt airport recently discovered that due to frequent weather changes they have a bottleneck on some of the landing tracks.
In order to find a solution, they first need to know which scenarios create the worst bottlenecks.
So they decided to use a simulator where they configure and analyze multiple scenarios and hope that this will highlight them were the real problem is.

So, this is the implementation of aircraft simulation program based on the class diagram provided.

## UML Diagram

<img src="https://github.com/bgoncharov/avaj-launcher/blob/master/avaj_uml.jpg">

## Compile and run

```
git clone https://github.com/bgoncharov/avaj-launcher.git
cd avaj-launcher
```

Before launching make sure you have `java` and `javac` installed.

In the root of project folder run the command:

`make`

After launching the programm log file `sumulation.txt` will appear in the folder.

Run the command:

`cat simulation.txt`