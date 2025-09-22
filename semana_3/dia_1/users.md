## Ejercicio: Sistema de Usuarios con POO (Clases, Encapsulamiento, Herencia, Polimorfismo, Abstracción)
### Objetivo

Diseñar y programar un mini sistema de gestión de usuarios que aplique los cuatro principios de POO:

- Encapsulamiento
- Herencia
- Polimorfismo
- Abstracción (con clase abstracta y/o interfaz)

### Contexto

Una plataforma necesita manejar distintos tipos de usuarios (por ejemplo, Administrador y Cliente). Todos deben poder iniciar sesión, mostrar su perfil, y algunos tendrán permisos especiales.

### Requerimientos funcionales

- Registro y autenticación
- Crear usuarios con datos mínimos.
- Iniciar sesión validando credenciales.
- Perfiles
- Mostrar información básica del usuario (nombre, correo, rol).

#### Acciones por rol

- Administrador: puede bloquear/desbloquear usuarios.
- Ver listado de usuarios (Tanto de admin como de clientes) con su rol y estado (activo/bloqueado).

- Cliente: puede actualizar su información su contacto.
- Listado de clientes
### Requerimientos de POO (obligatorios)

- Encapsulamiento
- Atributos privados (p. ej. password, email, estado).
- Getters/Setters con validaciones (e.g., email válido, contraseña con longitud mínima).
- Herencia
- Clase base Usuario y subclases Administrador y Cliente (o más, si quieres).
- Polimorfismo
- Un método común (p. ej. mostrarPerfil() o rolDescripcion()) que se sobrescribe en cada subclase.
- Abstracción

Usa una clase abstracta (Usuario abstracta con al menos un método abstracto) y/o una interfaz (p. ej. Autenticable con login()).

Bonus si usas ambas (recomendado).

### Reglas de negocio mínimas

- El Cliente puede actualizar teléfono y dirección (validar que no sean vacíos).
- El email debe tener formato simple válido (contener @ y un dominio).
- La contraseña debe tener mínimo 6 caracteres.

### Estructura sugerida (carpetas/clases)

model/

Usuario (abstracta)
Administrador (extiende Usuario)
Cliente (extiende Usuario)

security/

Autenticable (interfaz)

service/

UsuarioInterface (interfaz de usuario)
UsuarioService (implemetacion) 

app/

Main (menú simple para probar)

Puedes cambiar los nombres, pero debes mantener la separación modelo / lógica de negocio.
