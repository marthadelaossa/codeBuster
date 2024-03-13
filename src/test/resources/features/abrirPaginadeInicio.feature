#language: es
Característica: Ingresar a la Pagina de CODEBUSTER
@CASO0001 @CODEBUSTER
  Esquema del escenario: El usuario abre la Pagina de CODEBUSTER correctamente
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Entonces  el usuario cierra el navegador
    Ejemplos:
      | url |
      | https://code-buster.vercel.app/ |