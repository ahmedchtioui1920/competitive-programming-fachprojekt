# Kapitel: Tipps und Tricks – Lösungen und Laufzeit

In diesem Kapitel habe ich erste Übungsaufgaben im Fachprojekt **"Algorithms for Competitive Programming"** bearbeitet.  
Ziel war es, den Umgang mit DOMjudge, Ein- und Ausgabeformaten sowie einfache Automatisierungen in Java zu üben.  

---

## Problem 1: Hello World (Addition)

**Aufgabenstellung:**  
Es sollten zwei Zahlen eingelesen und deren Summe ausgegeben werden, zusätzlich sollte eine Begrüßung an DOMjudge erfolgen.

**Was ich gemacht habe:**  
Ich habe die beiden Zahlen `x` und `y` mit einem Scanner eingelesen, die Summe berechnet und das Ergebnis in der geforderten Textform ausgegeben.

**Laufzeit und Speicher:**  
Die Berechnung ist sehr effizient, da nur zwei Zahlen addiert werden.  
- Zeitkomplexität: O(1)  
- Speicherkomplexität: O(1)

---

## Problem 2: Hello World x Hello World (Multiplikation)

**Aufgabenstellung:**  
Anstatt die Summe zu berechnen, sollte DOMjudge die Multiplikation von zwei Zahlen wissen. Die Ausgabe sollte das Produkt zusammen mit den beiden Zahlen enthalten.

**Was ich gemacht habe:**  
Ich habe die beiden Zahlen eingelesen, das Produkt berechnet und mit String-Verkettung die Ausgabe im geforderten Format erstellt.

**Laufzeit und Speicher:**  
Die Berechnung ist ebenfalls konstant, da nur eine Multiplikation erfolgt.  
- Zeitkomplexität: O(1)  
- Speicherkomplexität: O(1)

---

## Problem 3: Automation (Zahlen inkrementieren)

**Aufgabenstellung:**  
Eine Liste von n Zahlen sollte automatisiert um 1 erhöht und jede Zahl auf einer neuen Zeile ausgegeben werden.

**Was ich gemacht habe:**  
Ich habe zuerst die Anzahl `n` eingelesen und dann in einer Schleife jede Zahl eingelesen, um 1 erhöht und direkt ausgegeben. Dies simuliert einfache Automatisierung.

**Laufzeit und Speicher:**  
Die Schleife läuft einmal über alle `n` Zahlen.  
- Zeitkomplexität: O(n)  
- Speicherkomplexität: O(1), da nur jeweils eine Zahl gespeichert wird
