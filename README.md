# Prueba Técnica desarrollador Backend Masivian [![CI](https://circleci.com/gh/carloselt/Prueba-Backend-Masivian.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/carloselt/Prueba-Backend-Masivian)
  
Prueba de ingreso desarrollador backend Masivian

Esta es la solución del examen de desarrollador Backend para Masivian.
Las herramientas utilizadas para el desarrollo de la prueba son:
   - Apache Maven
   - Java 8
   - Spring Tools Suite 4
   - Spring Framework
   - CircleCI
   - Postman
   - Windows 10
   
#### Requisitos para ejecutar la solución e interactuar con ella:
   - [Spring Tools Suite 4](https://spring.io/tools)
   - [Java 1.8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
   - [Postman](https://www.getpostman.com/downloads)



#### Instalación de la solución:

Clonamos el siguiente [repositorio](https://github.com/carloselt/Prueba-Backend-Masivian) en una carpeta y al finalizar debemos tener los siguientes archivos:

Una vez tengamos estos archivos y estando en la carpeta, mediante el uso de la terminal vamos a ejecutar el siguiente comando para ejecutar la solución: 
`java -jar target/lowest-common-ancestor-0.0.1-SNAPSHOT.jar`

Al ejecutarlo nos debe aparecer en la consola la siguiente información la cual indica que un servidor tomcat se desplegó en el puerto 8080:

Las líneas subrayadas indican que la aplicación se está ejecutando y podemos hacer uso del API Rest.

## Creación del árbol binario

Utilizando un cliente REST como Postman hacemos la petición para la creación de un árbol binario. Para el modelado del árbol se utiliza en formato JSON y se modela de manera recursiva, cada nodo del árbol tiene un valor y dos nodos hijos (derecho e izquierdo) y así sucesivamente. 

El formato JSON para la creación es el siguiente:

  5
 / \
7   15
   /
  8
  
```javascript
{
   "value": 2,
   "left": {
    "value": 7,
    "left": null,
    "right": null
  },
  "right": {
    "value": 15,
    "left": {
      "value": 8,
      "left": null,
      "right": null
    },
    "right": null
  }
}
```



