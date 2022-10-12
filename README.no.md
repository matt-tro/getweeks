# getweeks
[![en](https://img.shields.io/badge/lang-en-red.svg)](https://github.com/matt-tro/getweeks/blob/master/README.md)
[![it](https://img.shields.io/badge/lang-it-green.svg)](https://github.com/matt-tro/getweeks/blob/master/README.it.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](https://github.com/matt-tro/getweeks/blob/master/README.es.md)



Få alle ukegrenser fra en periode inkludert mellom to datoer i Java.

Ved å bruke funksjonaliteten til gratis Joda-Time-bibliotek, lar dette lille prosjektet få alle grenseuker fra en periode inkludert mellom to datoer.

# Krav
Dette prosjektet krever Joda-Time library (>= 2.9.9) og JRE (Java Runtime Environment) 1.8.

# Eksempel på bruk og utgang
Kjør den kjørbare java-filen med to parametere: start- og sluttdatoen, begge i formatet ÅÅÅÅ-MM-DD.
```
java -jar getweeks 2017-01-01 2017-02-02
```
Produksjon:
```
2017-01-02 - 2017-01-08
2017-01-09 - 2017-01-15
2017-01-16 - 2017-01-22
2017-01-23 - 2017-01-29
2017-01-30 - 2017-02-02
```
## Mantainers
- Mattia Trombon (prosjektleder)
- Marco Bimbati
- Francesca Reale
- Hellen Miriam Diego Lazaro
- Fonta22
- Nilis24