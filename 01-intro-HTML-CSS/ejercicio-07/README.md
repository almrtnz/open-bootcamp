# Formulario basado en registro del sitio web [dribbble](https://dribbble.com/signup/new)

Si el usuario tiene configurado el navegador o el sistema operativo para preferir un tema oscuro, este se cargará.

Esto se consigue utilizando la `media query`:

```css
@media (prefers-color-scheme: dark) {
  /* Aquí cambiamos los 
  estilos con colores para 
  el modo oscuro */
}
```

_También existe la opción de utilizar un botón para que el usuario pueda elegir un tema oscuro o uno claro. En este ejemplo no se ha utilizado este método._

La **ilustración** ha sido creado por mi utilizando **Blender**.

El *ejemplo* tiene algunas características **responsive**, cuando el ancho del viewport es inferior a 960px el sidebar con la ilustración desaparece.
