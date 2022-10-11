# getweeks
[![en](https://img.shields.io/badge/lang-en-red.svg)](https://github.com/matt-tro/getweeks/blob/master/README.md)
[![it](https://img.shields.io/badge/lang-it-green.svg)](https://github.com/matt-tro/getweeks/blob/master/README.it.md)
[![no](https://img.shields.io/badge/lang-no-blue.svg)](https://github.com/matt-tro/getweeks/blob/master/README.no.md)

Obtener todos los límites de cada semana de un período entre dos datas en Java.

Utilizando las funcionalidades de la librería gratis Joda-Time, este pequeño proyecto permite obtener todos los límites de cada semana en un período incluido entre dos datas.

# Requerimientos
Este proyecto requiere la librería Joda-Time (>= 2.9.9) y JRE (Java Runtime Environment) 1.8.

# Ejemplo de uso y output
Ejecute el archivo ejecutable de Java con dos parámetros: la data inicial y la data final, ambos en el format YYYY-MM-DD.

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
## Mantenedores
- Mattia Trombon (project manager)
- Marco Bimbati
- Francesca Reale
- Hellen Miriam Diego Lazaro
- Fonta22
- Nilis24
