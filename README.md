# Sistema de Gestión de Torneos de eSports

## Autor
Almudena García Bernal
Tu perfil de GitHub: AlmudenaGB

## Descripción del Proyecto

Link al repositorio del proyecto: https://github.com/AlmudenaGB/Actividad-AD-3.git

Este proyecto implementa un sistema de gestión de torneos de eSports
utilizando UML para el modelado y Java para la implementación.

## Diagramas UML
### Diagrama de Casos de Uso
![Diagrama de casos de uso](diagrams/casos-uso.png)

### Diagrama de Clases
![Diagrama de clases](diagrams/clases.png)

## Estructura del Proyecto
```
torneo-esports-uml/ 
├── src/
│ ├── es/empresa/torneo/
│ │ ├── modelo/
│ │ ├── control/
│ │ ├── vista/
│ │ ├── Main.java
├── diagrams/
│ ├── casos-uso.png
│ ├── clases.png
├── README.md
├── .gitignore
├── LICENSE (opcional) 
```
## Instalación y Ejecución
1. Clonar el repositorio:
   `git clone https://github.com/AlmudenaGB/Actividad-AD-3.git`

2. Compilar y ejecutar el proyecto:
   `cd src javac es/empresa/torneo/Main.java java es.empresa.torneo.Main`

## Justificación del diseño
Se ha realizado el siguiente diseño:
Se han creado las siguientes clases:
- Jugador: Representa el jugador del torneo. En esta clase se incluye una asociación con la clase Equipo para poder almacenar el equipo al que pertenece el jugador. Se incluirá en la clase Jugador un objeto Equipo ya que un jugador únicamente puede pertenecer a un único equipo.
- Equipo: Representa el equipo que participa en el torneo. En esta clase se incluye una lista de jugadores, ya que un equipo puede estar compuesto de varios jugadores, esta relación se ha representado mediante una agregación, ya que los jugadores forman parte del equipo.
- Premio: Representa el premio que se obtiene en los torneos.
- Torneo: Representa el torneo. En esta clase se incluye, mediante una relación de asociación, una lista de Equipos que conforman la clasificación del torneo. Además se incluye un objeto Premio que representa el premio que obtiene el ganador de dicho torneo.
- Partida: Representa cada una de las partidas que se realizan en el torneo. En esta clase se incluye un objeto Equipo que será el ganador de esa partida, un objeto Torneo que representará el torneo al que pertenece esa partida.

## Conclusiones
En este proyecto se ha aprendido sobre el diseño de software utilizando dos herramientas muy utilizadas como son los diagramas de clases y de casos de uso.

Durante el proyecto se ha aprendido lo siguiente:
- Diagrama de clases
  - Crear el diseño de una entidad/clase mediante el diagrama de clases.
  - Crear las diferentes relaciones entre las distintas clases.
  - Indicar la cardinalidad con las que se relaciona en cada una de las relaciones entre entidades.
- Proyecto
  - Organizar el proyecto mediante la creación de paquetes (modelo, vista, control, etc)
- Diagrama de casos de uso
  - Identificar quien interactua con la aplicación.
  - Identificar que hace el sistema para cada una de las funcionalidades descritas en el caso de uso.
  - Indentificar como se relacionan entre sí las diferentes funcionalidades.
