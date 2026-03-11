INFORME 

La clase Libro representa el concepto general de un libro dentro del sistema.
Incluye:

titulo : String
autor : String
numeroEjemplares : int
numeroPrestados : int

Y métodos clave:

prestar() → permite prestar solo si hay ejemplares disponibles.
devolver() → permite devolver solo si hay ejemplares prestados.
toString() → muestra el estado del libro.

El sistema implementa tres subclases, cada una especializando información del libro:

LibroTexto
Agrega el atributo:

curso : String

LibroTextoUNIAC
Extiende a LibroTexto y agrega:

facultad : String

Novela
Agrega:

tipo : String
Tipos posibles: histórica, romántica, policial, realista, ciencia ficción, aventuras.

Cada clase sobrescribe toString() para mostrar sus datos propios, demostrando polimorfismo.

La clase principal construye y prueba:

Libro 1 → con constructor completo
Libro 2 → con constructor vacío (datos ingresados por consola)
LibroTextoUNIAC → con todos sus atributos
Novela → con su tipo correspondiente

Además, se realizan pruebas de:

prestar()
devolver()
impresión de estado inicial y final

# ¿Por qué usar herencia?
La herencia permite:

Reutilizar código de la clase Libro
Especializar comportamientos sin duplicar atributos
Organizar el código en jerarquías lógicas
Facilitar la extensión del sistema a futuro

# Casos donde NO aplica la herencia

Diferencias solo de datos (sin comportamiento nuevo)
Ej.: LibroFísico vs LibroDigital
Si lo único que cambia es el formato, no hay necesidad de crear clases hijas.
Es mejor un atributo como formato.

Clasificación organizativa
Ej.: libros según estantería, sala o sede
Son etiquetas, no comportamientos diferentes.
Deberían ser atributos (ubicacion, genero) o clases asociadas.

# atributos nuevos
✔ isbn : String
Identificador único del libro → útil para inventario.
✔ anioPublicacion : int
Sirve para reportes, filtrado y análisis por antigüedad.

