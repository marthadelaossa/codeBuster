#language: es
Característica: Inicio de Sesion en la Pagina de CODEBUSTER
  @CASO0003 @CODEBUSTER
  Esquema del escenario: El usuario registrado inicia sesion exitosamente en la Pagina de CODEBUSTER
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario inicia sesion con los datos "<email>" "<contrasenha>"
    Y         el usuario valida el inicio de sesion exitoso
    Entonces  el usuario cierra sesion
    Ejemplos:
      | url |email|contrasenha|
      | https://code-buster.vercel.app/ |marcos.marquez@gmail.com|BenjamínE2oV#|
      | https://code-buster.vercel.app/ |bart@mail.com|P@ssword123|

  @CASO0004 @CODEBUSTER
  Esquema del escenario: Login Fallido por contraseña incorrecta en la Pagina de CODEBUSTER
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario inicia sesion con los datos "<email>" "<contrasenha>"
    Entonces  el usuario valida el inicio de sesion no exitoso

    Ejemplos:
      | url |email|contrasenha|
      | https://code-buster.vercel.app/ |marcos.marquez@gmail.com|BenjamínE|
