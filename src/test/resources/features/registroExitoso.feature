#language: es
Característica: Registro en la Pagina de CODEBUSTER
  @CASO0002 @CODEBUSTER
  Esquema del escenario: El usuario se registra exitosamente en la Pagina de CODEBUSTER
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario se registra de manera exitosa
    Y         el usuario inicia sesion
    Y         el usuario valida el inicio de sesion exitoso
    Entonces  el usuario cierra sesion
    Ejemplos:
      | url |
      | https://code-buster.vercel.app/|