# Introducción a los Sistemas Complejos, JAVA, MVN y GIT

Arquitecturas Empresariales 2020-2

## Generalidades

Este repositorio presenta un ejercicio básico arquitecturas empresariales, usando las herramientas Maven, Git y JAVA para su desarrollo.

Puede encontrar el informe en ***Arq_Emp_Taller1\src\site\resources\Informe.pdf***

### Prerrequisitos

Para poder usar este repositorio necesitara instalar Maven en su computador.
http://maven.apache.org/download.html

Puede encontrar la guía para la instalación desde:
http://maven.apache.org/download.html#Installation

También necesitara tener la versión más reciente de Java y jdk actualizados.

Instale git si aún no lo tiene instalado en su computador.

Lo puede encontrar y seguir los pasos de su instalación en:
https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

Use un framework como Visual Studio Code, IntelliJ o alguno de su preferencia para más comodidad cuando use este repositorio.


### Preparando el espacio de trabajo

Cuando esté preparado abra un directorio en su computador donde quiera trabajar.

Ejecuta la consola de comandos desde el directorio y escribe en la línea de comandos

```
git clone https://github.com/Wasawsky/Arq_Emp_Taller1.git
```

Se le creara una carpeta llamada Arq_Emp_Taller1 en el directorio, es este repositorio desde donde trabajara.

Ingrese a la carpeta y ejecute la consola de comandos, o usando un framework de desarrollo abra la carpeta.

Desde la consola de comandos y estando en el repositorio escriba

```
mvn package
```

Para que se ejecute el POM.xml del proyecto.
Se descargarán librerías que necesitara el proyecto, puede tardar algunos minutos si es la primera vez que ejecuta el comando.

## Ejecutando Casos de Prueba

Ejecute el comando 
```
mvn test
```

Para que se ejecuten los casos de prueba del proyecto, puede ver su implementación en ***Arq_Emp_Taller1\src\test\java\edu***

### Funcionalidades

Este proyecto permite calcular la media aritmética de un conjunto de valores, además podemos hallar la desviación estándar de los datos.

## Uso

Puede ejecutar el método principal de la clase Calculator.java desde la consola de comandos para iniciar el programa, indique el archivo con los datos que quiere operar y oprima ENTER.

Podrá visualizar la media aritmética de los datos y la desviación estándar de los mismos.

Si necesita casos de prueba vaya a **Arq_Emp_Taller1\src\test\resources\data** para ver los casos que se usan en las pruebas. 

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [GIT](https://git-scm.com/) - Environment Version Control System
* [Java](https://www.java.com/es/) - General-purpose programming language

## Sobre el autor

*Michael Ballesteros*

Apasionado por el desarrollo y la gestión de sistemas

## Licencia

Para más información de la licencia ver LICENSE.md

Para más proyectos, Sígueme y encuentra mis repositorios :D

## Agradecimientos

Felipe Portales-Oliva
Johni0702
