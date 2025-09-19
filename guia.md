### Guia para clases abstractas

1. Las **subclases** como alumno, profesor heredan de una **clase abstracta** llamada Persona, Persona tiene metodos abstractos estos metodos abstractos **obligatoriamente** los deben de usar sus subclases, por eso sus esos metodos abstractos los debes pensar de manera que sean algo en común con todas las subclases 

**Ejemplo de la clase abstracta:**

![alt text](<images/person.png>)

- **Ejemplo:**  saludar(), todos los estudiantes, profesores saludan.

![alt text](<images/greet.png>)



### Guia para implementar interfaces

1. Creamos una interface con los metodos que queremos que al implementar en una clase se usen obligatoriamente

- Ejemplo de la interfaz:
![alt text](<images/interfaces.png>)

- Ejemplo del service que usa interfaz:

![alt text](<images/generico.png>)

Observa que estamos implementando los metodos de la interface pero agrengandole la logica

Por ultimo veamos como pedimos los datos al usuario y usamos los metodos del service

![alt text](<images/main.png>)
