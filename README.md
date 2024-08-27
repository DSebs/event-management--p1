
## Gestión de Eventos
Proyecto de corte uno, conta de un sistema gestion de eventos en Java, siguiendo principios SOLID y el patron de diseño MVC. 

---

### Descripción
El proyecto consiste en un sistema de gestión de eventos que incluye diferentes tipos de eventos como conciertos y ferias gastronómicas. Se implementaron servicios para gestionar tanto los eventos como los artistas relacionados, sin el uso de bases de datos y con una interfaz gráfica construida con Swing.

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
+ **nombre y ubicacion:** El nombre y la ubicacion no pueden deben tener una cadena de texto, no pueden ser null ni estar vacios.
+ **precioEntrada:** Se establece que el precio de la entrada a cualquiera de de los dos tipos de eventos seria mayor a 0.
+ **fecha:**Se establece que la fecha no puede ser null.

#### Métodos
+ **Evento - Constructor:** Permite la creacion objeto con los atributos que se ingresaron como parametros.
+ **CalcularAforo:** Método abstracto cuya función es calcular el aforo correspondiente a cada evento.

---

### FeriaGastronomica - clase
Suclase de la clase Evento, representa un evento de fer gastronomica.

#### Atributos
+ **numStands:** Representa la cantidad de Standsque estara en el evento de feria gastronomica.
+ **tipoCocina:** Representa que tipo se comida se va a preparar en el evento.
+ **expandible:** Representa 
+ **COSTO_TAPA_DURA:** Constante que representa el valor adicional al precio original si el libro tiene tapa dura.

