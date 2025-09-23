# Mini Taller MySQL — Sistema de Usuarios (enfocado a JDBC)

## Contexto
Vas a implementar la parte de **base de datos** para el ejercicio **Sistema de Usuarios con POO (Clases, Encapsulamiento, Herencia, Polimorfismo, Abstracción)**.  
Tu objetivo es diseñar las tablas y operaciones SQL que luego consumirás desde **Java con JDBC**.

---

## Ejercicios

### 1. Crear base de datos y seleccionarla
- Crea una base de datos llamada `usuarios_db`.
- Selecciónala para trabajar en ella.

---

### 2. Crear tablas base
- Una tabla para **roles** (`ADMIN`, `CLIENTE`).
- Una tabla para **usuarios** que guarde: id, nombre, email, password, estado (activo/bloqueado), rol.
- Una tabla para **clientes** con datos adicionales (teléfono, dirección).
- Una tabla de **bitácora de bloqueos** para registrar cuándo un Admin bloquea o desbloquea a un usuario.

---

### 3. Insertar datos iniciales
- Inserta al menos un **Admin** y un **Cliente** en la base de datos.

---

### 4. Consultas CRUD básicas
- Registrar un nuevo usuario con `INSERT`.
- Crear un perfil de cliente relacionado a un usuario.
- Actualizar datos de contacto de un cliente.
- Listar todos los usuarios con su rol y estado.

---

### 5. Acciones de administrador
- **bloquea** y **desbloquea** un usuario.
- Registrar la acción en la tabla de bitácora.

---

### 6. Relaciones y restricciones
- Define claves foráneas entre:
  - usuarios ↔ roles
  - usuarios ↔ clientes
  - usuarios ↔ bloqueos
- Asegúrate de que al borrar un usuario, también se eliminen sus datos de cliente.

---

### 7. Validaciones mínimas
- Garantizar que el **email sea único**.

---

### 9. Eliminaciones
- Eliminar un cliente de la base de datos.
- Eliminar un usuario de la base de datos y verificar qué ocurre con sus registros relacionados.
