### Paso 1: Enlazar JavaScript al HTML

Para usar JS en tu página:
Crea un archivo nuevo llamado script.js.

Dentro de tu index.html, enlázalo justo antes de cerrar la etiqueta </body>:
```css





Riwi

#btn {
  background-color: #333;
  color: #fff;
  padding: 10px 20px;
  border: none;
  cursor: pointer;
}

#btn:hover {
  background-color: #555;
}








```
⚠️ Importante: Si colocas el script en el <head>, el código podría ejecutarse antes de que cargue el contenido de la página. Por eso lo ponemos al final.


🔹 Paso 2: Capturar elementos del DOM

El DOM (Document Object Model) es la representación de tu página en forma de árbol.
Cada etiqueta HTML puede ser accedida y manipulada con JS.

Ejemplo básico en HTML:
```js
<p id="mensaje">Texto inicial</p>
<button id="btn">Haz clic aquí</button>

En script.js:
// Capturamos elementos del DOM
const parrafo = document.getElementById("mensaje");
const boton = document.getElementById("btn");
Aquí estamos trayendo desde el HTML el párrafo y el botón para poder usarlos en JS.

🔹 Paso 3: Mostrar contenido con JS

Podemos cambiar el texto de un párrafo usando la propiedad .textContent:

parrafo.textContent = "¡Hola Coder! Este texto fue cambiado con JavaScript.";

🔹 Paso 4: Responder a un evento (clic)

Para que algo suceda cuando el usuario haga clic en el botón:

boton.addEventListener("click", () => {
  parrafo.textContent = "¡Genial! Has hecho clic en el botón 🚀";
});

🔹 Paso 5: Personaliza la experiencia

Puedes combinar CSS + JS para que la interacción sea más llamativa:

#btn {
  background-color: #333;
  color: #fff;
  padding: 10px 20px;
  border: none;
  cursor: pointer;
}

#btn:hover {
  background-color: #555;
}

```