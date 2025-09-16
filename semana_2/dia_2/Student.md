### Enunciado

Construya una jerarquía de clases que represente a una Persona dentro de una institución educativa.

Cree una clase base llamada Persona que contenga los atributos básicos nombre y edad, además de sus métodos para consultar y modificar estos valores.

A partir de la clase Persona, implemente la clase Alumno, que herede de Persona.

Cada alumno podrá tener un máximo de cuatro Asignaturas asociadas.

Debe implementar un método que calcule el promedio de notas.

Al agregar una asignatura, se debe validar que no exista previamente.

Cree la clase Asignatura que represente el nombre de la asignatura y la nota obtenida.

Debe contar con un método que devuelva si está Aprobada (nota ≥ 3.5) o Reprobada (nota < 3.5).

Implemente polimorfismo definiendo un método abstracto en la clase Persona llamado mostrarInformacion().

En la clase Alumno, este método debe sobrescribirse para mostrar:

Nombre del alumno.

Edad.

Sus asignaturas con nombre, nota y estado (aprobado/reprobado).

El promedio de todas las asignaturas.

Cree una clase Aplicacion que permita:

Crear al menos tres instancias de Alumno.

Agregar a cada uno sus asignaturas y notas.

Imprimir en pantalla la información de cada alumno haciendo uso del método polimórfico mostrarInformacion().