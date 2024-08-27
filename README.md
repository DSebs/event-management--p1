
## Gestión de Eventos
Proyecto de primer corte de Desarrollo de aplicaciones empresariales, consta de un sistema gestion de eventos programado en lenguaje Java 17, siguiendo principios SOLID y el patron de diseño MVC. 

---

### Descripción
El software consiste en un sistema de gestión de eventos que incluye diferentes tipos de eventos como conciertos y ferias gastronómicas. Se implementaron servicios para gestionar tanto los eventos como los artistas relacionados, usando el almacenamiento en memoria y con una interfaz gráfica construida con Swing.

---

## Estructura del proyecto

---

### Model

---

### Evento - clase abstracta
Clase estructural abstracta que actual como base para los diferentes tipos de eventos.

#### Atributos
+ **nombre:** Representa el nombre del evento, el cual actua como identificador del objeto creado.
+ **fecha:** Representa la fecha en el que se llevara acabo el evento.
+ **ubicacion:** Representa la ubicacion en el que se llevara a cabo el evento.
+ **precioEntrada:** Representa el costo de ingreso de cada persona al evento.

#### Restricciones de atributos
+ **nombre y ubicacion:** El nombre y la ubicacion no pueden ser null ni estar vacios.
+ **precioEntrada:** Se establece que el precio de la entrada a cualquiera de de los dos tipos de eventos seria mayor a 0.
+ **fecha:** Se establece que la fecha no puede ser null.

#### Métodos
+ **Evento - Constructor:** Permite la creacion objeto con los atributos que se ingresaron como parametros.
+ **CalcularAforo:** Método abstracto cuya función es calcular el aforo correspondiente a cada evento.

---

### FeriaGastronomica - clase
Subclase de la clase Evento, representa un evento de feria gastronomica.

#### Atributos
+ **numStands:** Representa la cantidad de stands que se dispondran en el evento de feria gastronomica.
+ **tipoCocina:** Representa que tipo se comida se va a preparar en el evento.
+ **expandible:** Representa si la feria gastronomica puede alojar a mas personas de lo comun
+ **PERSONAS_POR_STANDS:** Constante que representa la cantidad de personas que corresponde por cada stand.

#### Métodos
+ **FeriaGastronomica - Constructor:** Permite la creación de un evento tipo feria gastronómica con los valores de los atributos ingresados por parámetro, los cuales incluye los heredados y los propios de la clase.
+ **calcularAforo:** Sobreescribe el método de la clase Evento, establece si la capacidad de los stands de la feria son expandibles o no, así mismo retornara el valor del aforo.

#### Restricciones 
+ **numStands:** Declara que el número de stands debe ser mayor a 0.
+ **tipoCocina:** Declara que el tipo de cocina no puede ser nulo ni estar vacío.

---

### Concierto - clase 
Hereda de la clase Evento, representa un evento tipo concierto y está relacionada con la clase Artista.

#### Atributos
+ **artista:** Representa el artista que participara en el concierto
+ **localidades:** Representa el número de localidades que habrán en el concierto.
+ **tipoMusica:** Representa el tipo de música que se tocara en el concierto.
+ **PERSONAS_POR_LOCALIDADES:** Constante que representa la cantidad de máxima de personas que habrá por localidad.

#### Métodos
+ **Concierto - Constructor:** Permite la creación de un evento tipo concierto con los valores de los atributos ingresados por parámetro, los cuales incluyen los heredados y los propios de la clase. 
+ **calcularAforo:** Sobreescribe el método de la clase Evento y retorna el aforo, el cual sería el numero de localidades por las personas establecidas en cada localidad.

#### Restricciones 
+ **artista:** Declara que el artista no puede ser nulo dado que tiene que haber un artista para el concierto.
+ **localidades:** Declara que el número de localidades debe ser mayor a 0.
+ **tipoMusica:** Declara que el tipo de música no puede estar vacío.

---

### Artista - clase 
Representa un artista, relacionada  a la clase Concierto.

#### Atributos
+ **nombre:** Representa el nombre del artista.
+ **disquera:** Representa la disquera en la que se encuentra el artista.

#### Métodos
+ **Artista - Constructor:** Permite la creación del artista con los valores de los atributos ingresados por parámetro. 
#### Restricciones de atributos
+ **nombre y disquera:** Declara que el nombre del artista y la disquera no pueden ser nulos y estar vacíos.

---

### Expandible  - interfaz
Define si los stands de una feria pueden expandirse a razon de ser más grandes, de manera que alojen más personas.    

#### Métodos abstractos
+ **aumentarCapStands:** Define el extra de personas que le cabe a un stand de una Feria de caracter Expandible

---

## Services

---

### ServicioEvento 
Permite gestionar los distintos métodos o acciones de la clase Evento, como la crear, eliminar, buscar y listar eventos de tipo feria gastronómica y concierto.

#### ArrayList
+ **eventos:** Guarda los objetos de las instancias de las clases que heredan de evento

#### Métodos
+ **crearConcierto y crearFeriaGastronomica:** Permite la creación eventos  tipo feria gastronómica y concierto con los valores de los atributos ingresados por parámetro, estableciendo excepciones para cada atributo establecido en el parámetro.

+ **añadirConcierto y añadirFeriaGastronomica:** Permite añadir o registrar un evento tipo concierto o feria gastronómica en una lista, estableciendo la excepción de que el nombre no puede ser nulo ni ser el mismo a uno anteriormente registrado.

+ **buscarConcierto y buscar FeriaGastronomica:** Permite buscar evento tipo concierto feria gastronómica por medio del nombre.

+ **listarConcierto y buscarFeriaGastronomica:** Retorna una lista de los eventos tipo concierto y feria gastronómica que se crearon con anterioridad.

---

### ServicioArtista
Permite gestionar los distintos métodos o acciones del artista, como la crear, eliminar, buscar y listar los artistas.

#### ArrayList
+ **artistas:** Guarda las instancias de objetos de tipo artista  

#### Métodos
+ **crearArtista:** Permite la creación del artista, estableciendo la excepción de que el nombre y la disquera no puede ser nulo ni estar vacío.

+ **añadirArtista:** Permite registrar al artista en una lista, estableciendo la excepción de que el artista no puede nulo ni llamarse de la misma manera que un artista anteriormente registrado.

+ **buscarArtista:** Permite buscar un artista por medio del nombre.

+ **listarArtistas:** Retorna una lista de los artistas que se crearon con anterioridad.


