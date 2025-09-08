#  Condicionales en Java

## Objetivo
Aprender a usar las estructuras condicionales (`if`, `else`, `else if` y `switch`) para tomar decisiones en un programa.

---

## 1. Condicional `if`
Sirve para ejecutar un bloque de código **solo si** una condición es verdadera.

 **Sintaxis:**
```java
if (condición) {
    // código si la condición es verdadera
}
```

## 2. Condicional if - else

Permite ejecutar un bloque si la condición es verdadera y otro bloque si es falsa.

 Sintaxis:
```java
if (condición) {
    // código si la condición es verdadera
} else {
    // código si la condición es falsa
}
```
## 3. Condicional if - else if - else

Se utiliza cuando hay múltiples condiciones posibles.

 Sintaxis:
```java
if (condición1) {
    // código si condición1 es verdadera
} else if (condición2) {
    // código si condición2 es verdadera
} else {
    // código si ninguna condición es verdadera
}
```
## 4. Condicional switch

Se usa para evaluar una expresión frente a varios casos posibles.

 Sintaxis:
```java
switch (variable) {
    case valor1:
        // código si variable == valor1
        break;
    case valor2:
        // código si variable == valor2
        break;
    default:
        // código si no coincide con ningún caso
}
```

###  Actividad 5 – If - Else
Haz un programa que reciba un número entero e imprima:
- "Es positivo" si el número es mayor que 0.  
- "Es negativo" si es menor que 0.  
- "Es cero" si es exactamente 0.  

---

###  Actividad 6 – If - Else If
Pide al usuario su edad y muestra:
- "Niño" si tiene menos de 12.  
- "Adolescente" si tiene entre 12 y 17.  
- "Adulto" si tiene 18 o más.  

---

###  Actividad 7 – Switch
Crea un programa que pida un número del 1 al 7 y muestre el día de la semana:
- 1 → Lunes  
- 2 → Martes  
- 3 → Miércoles  
- …  
- 7 → Domingo  