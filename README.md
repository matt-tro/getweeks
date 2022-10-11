# getweeks
[![it](https://img.shields.io/badge/lang-it-green.svg)](https://github.com/matt-tro/getweeks/blob/master/README.it.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](https://github.com/matt-tro/getweeks/blob/master/README.es.md)
[![no](https://img.shields.io/badge/lang-no-blue.svg)](https://github.com/matt-tro/getweeks/blob/master/README.no.md)

Obtain all week limits from a period included between two dates in Java.

Using the functionalities of free Joda-Time library, this little project allows to obtain all limit weeks from a period included between two dates.

# Requirements
This project requires Joda-Time library (>= 2.9.9) and JRE (Java Runtime Environment) 1.8.

# Example of usage and output
Run the java executable with two parameters: the start and the end date, both in YYYY-MM-DD format.  
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
## Mantainers
- Mattia Trombon (project manager)
- Marco Bimbati
- Francesca Reale
- Hellen Miriam Diego Lazaro
- Fonta22
- Nilis24
