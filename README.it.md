# getweeks
[![en](https://img.shields.io/badge/lang-en-red.svg)](https://github.com/matt-tro/getweeks/blob/master/README.md)
[![it](https://img.shields.io/badge/lang-it-green.svg)](https://github.com/matt-tro/getweeks/blob/master/README.it.md)
[![it](https://img.shields.io/badge/lang-es-yellow.svg)](https://github.com/matt-tro/getweeks/blob/master/README.es.md)

Ottiene tutti i limiti setitmanali da un periodo incluso tra due date in Java.

Usando le funzionalità della libreria free Joda-Time, questo piccolo progetto consente di ottenere tutti i limiti settimanali da un periodo incluso tra due date.

# Requisiti
Questo progetto richiede la libreria Joda-Time (>= 2.9.9) e il JRE (Java Runtime Environment) 1.8.

# Esempi di utilizzo e output
Lanciare l'esecuibile java con due parametri: la data di inizio e di fine, entrambi in formato YYYY-MM-DD.
```
java -jar getweeks 2017-01-01 2017-02-02  
```
Output:  
```
2017-01-02 - 2017-01-08  
2017-01-09 - 2017-01-15  
2017-01-16 - 2017-01-22  
2017-01-23 - 2017-01-29  
2017-01-30 - 2017-02-02  
```
## Manutentori
- Mattia Trombon (project manager)
- Marco Bimbati
- Francesca Reale
- Hellen Miriam Diego Lazaro
- Fonta22
