# Tipos de Datos Compuestos en Java

## Objetivo
Conocer y practicar los principales **tipos de datos compuestos en Java**, los cuales permiten trabajar con información más compleja que los tipos primitivos.

---

## 1. Tabla de Tipos Compuestos

| Tipo       | Descripción |
|------------|-------------|
| `String`   | Almacena cadenas de texto. |
| `Array`    | Colección de elementos del mismo tipo, accesibles por índices. |
| `ArrayList`| Implementación de una lista redimensionable que almacena objetos. |
| `HashMap`  | Estructura que almacena pares clave-valor. |
| `Interface`| Definición de métodos abstractos que una clase debe implementar. |
| `Enum`     | Tipo que define un conjunto de constantes. |
| `Class`    | Plantilla para crear objetos que contienen atributos y métodos. |

---

## 2. Ejemplos de Uso

### String
```java
public class EjemploString {
    public static void main(String[] args) {
        String saludo = "Hola Mundo";
        System.out.println(saludo.toUpperCase()); // HOLA MUNDO
    }
}
```
### Array
```java
public class EjemploArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Elemento en posición 0: " + numeros[0]);
    }
}   
```
### ArrayList
```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        System.out.println("Primer nombre: " + nombres.get(0));
    }
}
```

### HashMap
```java
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Carlos", 25);
        edades.put("María", 30);

        System.out.println("Edad de María: " + edades.get("María"));
    }
}
```

🔹 Enum
```java
public class EjemploEnum {
    enum Dia { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES }

    public static void main(String[] args) {
        Dia hoy = Dia.LUNES;
        System.out.println("Hoy es: " + hoy);
    }
}
```
### Class
```java
class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }
}

public class EjemploClase {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Lucía";
        p.edad = 22;
        p.saludar();
    }
}
```