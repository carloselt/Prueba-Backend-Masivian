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

![alt text](https://github.com/carloselt/Prueba-Backend-Masivian/blob/master/images/imagen%201.JPG?raw=true)

Una vez tengamos estos archivos y estando en la carpeta, mediante el uso de la terminal vamos a ejecutar el siguiente comando para ejecutar la solución: 
`java -jar target/lowest-common-ancestor-0.0.1-SNAPSHOT.jar`

Al ejecutarlo nos debe aparecer en la consola la siguiente información la cual indica que un servidor tomcat se desplegó en el puerto 8080:

Las líneas subrayadas indican que la aplicación se está ejecutando y podemos hacer uso del API Rest.

## Creación del árbol binario

Utilizando un cliente REST como Postman hacemos la petición para la creación de un árbol binario. Para el modelado del árbol se utiliza en formato JSON y se modela de manera recursiva, cada nodo del árbol tiene un valor y dos nodos hijos (derecho e izquierdo) y así sucesivamente. 

El formato JSON para la creación es el siguiente:

```javascript
  2
 / \
7   15
   /
  8
```  
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
Ejecutamos un método **POST** http://localhost:8080/binaryTree/createBinaryTree para la creación del recurso árbol binario agregando en el body el JSON que representa al árbol y si es correcto el API debe responder un status 200 OK con el árbol creado:

La terminal va *logeando* las interacciones con la aplicación:

## Obtener el ancestro común más cercado - LCA 

Para probar el Lowest Common Ancestor ejecutamos el método **GET** http://localhost:8080/binaryTree/lowestCommonAncestor?nodeTwo=4&nodeOne=22 

En el body de la petición agregamos el árbol que queramos y como query params y los nodos uno y dos:

```javascript
{
  "value": 20,
  "left": {
    "value": 8,
    "left": {
      "value": 4,
      "left": null,
      "right": null
    },
    "right": {
        "value": 12,
        "left": {
          "value": 10,
          "left": null,
          "right": null
        },
        "right": {
          "value": 14,
          "left": null,
          "right": null
        }
      }
  },
  "right": {
    "value": 22,
    "left": null,
    "right": null
  }
}
```
Al ejecutarlo la aplicación nos devuelve el ancestro común más cercado LCA del arbol y el estatus 200 OK

La terminal va mostrando las peticiones hechas en la aplicación:


La aplicación valida errores cuando ingresamos un árbol incorrecto o nos faltan los datos mostrando el error como respuesta:




## Ejecutar la solución por el IDE STS
Una vez tengamos instalado STS y definidas las variable de entorno JAVA_HOME ingresamos en las siguientes opciones file > import > Existing Maven Projects y seleccionamos la carpeta descargada.
Una vez tengamos esta estructura y el proyecto esté listo presionamos click derecho sobre el proyecto > Run As > Maven Install y lo ejecutamos. Cuando finalice y en la terminal se muestre **BUILD SUCCESS** lo cual indica que el proyecto se configuro y se construyó correctamente ejecutado un test unitario: 

Posterior a esto vamos a presionar click derecho sobre el proyecto > Run As > Spring Boot App y se ejecuta la aplicación mostrando en la terminal la siguiente información: 

[![CI](https://circleci.com/gh/carloselt/Prueba-Backend-Masivian.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/carloselt/Prueba-Backend-Masivian)

Se hace uso de la herramienta de Integración continua [CircleCI](https://circleci.com/) la cual se encarga de verificar que el proyecto se construye correctamente, que los test se están ejecutando bien y cada que vez que hay un cambio en el repositorio la herramienta hace un build para ver que no se haya afectado la aplicación. Cuando esto pasa se notifica vía correo el error.

https://circleci.com/gh/carloselt/Prueba-Backend-Masivian


