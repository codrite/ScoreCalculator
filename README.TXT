The program has been written using IntelliJ IDEA but has a maven project for easy import into eclipse IDE.

Running the program
-------------------

Command Line or Using IDE and passing a file name containing names to compute Rank

++ Score summary ++

java com.app.scorecalculator.Main -s <file>

++ Without Score summary ++

java com.app.scorecalculator.Main -s <file>

Score Summary - Each string's score summary is displayed in the output console with Rank

Assumptions
-----------

1. Ranking of alphabets is not case-sensitive
2. Duplicates entries are not scored twice instead it's not added to the list

Improvements
------------

1. Running complexity is O(n)
