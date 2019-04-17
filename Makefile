.PHONY: all compile run

all: compile run

compile:
	javac cpoo/cc/Main.java

run:
	java cpoo.cc.Main
