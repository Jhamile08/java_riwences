
#  Variables 

##  Objetivo
Comprender qué son las variables en Java, cómo declararlas y usarlas con los distintos tipos de datos disponibles.

---

##  1. ¿Qué es una variable?
Una **variable** es un espacio en memoria donde podemos guardar información para luego usarla en un programa.

En Java, una variable tiene:
1. **Tipo de dato** (qué puede almacenar).
2. **Nombre** (identificador).
3. **Valor** (dato almacenado).

 **Sintaxis:**
```java
tipo nombre = valor;
```
#  Tipos de Datos en Java

##  Objetivo
Conocer y diferenciar los **tipos de datos primitivos** en Java, así como aprender a usarlos en programas sencillos.

---

##  1. Tipos de Datos Primitivos
Son los más básicos del lenguaje, almacenan valores simples y **no son objetos**.

| Tipo     | Descripción                          | Ejemplo |
|----------|--------------------------------------|---------|
| `byte`   | Entero pequeño (–128 a 127)          | `byte edad = 25;` |
| `short`  | Entero mediano (–32,768 a 32,767)    | `short año = 2025;` |
| `int`    | Entero grande (más usado)            | `int salario = 1200;` |
| `long`   | Entero muy grande                    | `long poblacion = 8000000000L;` |
| `float`  | Decimal simple (4 bytes, poca precisión) | `float precio = 19.99f;` |
| `double` | Decimal doble precisión (8 bytes)    | `double pi = 3.14159;` |
| `char`   | Un solo carácter Unicode             | `char inicial = 'J';` |
| `boolean`| Lógico: verdadero o falso            | `boolean activo = true;` |

 **Ejemplo:**
```java
public class Primitivos {
    public static void main(String[] args) {
        int edad = 20;
        double altura = 1.75;
        boolean estudiante = true;
        char inicial = 'J';

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es estudiante? " + estudiante);
        System.out.println("Inicial: " + inicial);
    }
}
```

##  1. Datos Simples

###  Actividad 1
Declara las siguientes variables con tus propios datos:
- `String nombre`
- `int edad`
- `double altura`
- `boolean estudiante`
- `char inicial`

Imprime en consola un mensaje como este:
Hola, mi nombre es Ana, tengo 20 años, mido 1.65 metros y mi inicial es A.