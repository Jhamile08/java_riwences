#  CRUD de Frutas con Listas (POO + Encapsulamiento)

##  Objetivo
Construir un **menú interactivo** para gestionar una colección de **Frutas** aplicando:
- Clases, atributos, métodos, **encapsulamiento** y `toString`.
- **Listas** (`ArrayList<Fruta>`) para almacenar los objetos.
- Operaciones **CRUD**: Crear, Listar, Buscar, Actualizar y Eliminar.

---

##  Modelo sugerido (`Fruta`)
Agrega más atributos además de `nombre` y `peso`:
- `id` (int, autoincremental)
- `nombre` (String)
- `pesoKg` (double)
- `color` (String)
- `precio` (double)
- (opcional) `origen` (String), `esOrganica` (boolean)

> Encapsula todos los campos (private) y expón **getters/setters** con validaciones simples (ej. `peso > 0`, `precio >= 0`).

---

##  Menú (requerido)
1) **Crear** fruta  
2) **Listar** todas  
3) **Buscar** (por `id` o por nombre parcial)  
4) **Actualizar** (cambiar uno o más atributos)  
5) **Eliminar** (por `id`)  
6) **Salir**

---

##  Criterios de Aceptación
- Usa **`ArrayList<Fruta>`** como contenedor principal.
- `id` se **autoincrementa** y no se repite.
- Validaciones mínimas: nombre no vacío, peso > 0, precio ≥ 0.
- `toString()` legible para imprimir la fruta.
- No se rompe con entradas inválidas (maneja `NumberFormatException`).

---