#language: es
Característica: Solucion Reto  en la Pagina de CODEBUSTER
@CASO0007 @CODEBUSTER
  Esquema del escenario: El usuario soluciona un reto correctamente en la  Pagina de CODEBUSTER
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario inicia sesion con los datos "<email>" "<contrasenha>"
    Y         el usuario valida el inicio de sesion exitoso
    Y         el usuario ingresa a un reto y valida la informacion
    Y         el usuario soluciona el reto correctamente
    Entonces  el usuario cierra el navegador
    Ejemplos:
      | url |email|contrasenha|
      | https://code-buster.vercel.app/ |micaela.franco@yahoo.com|Codebuster123#|

  @CASO0008 @CODEBUSTER
  Esquema del escenario: El usuario soluciona un reto incorrectamente en la  Pagina de CODEBUSTER
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario inicia sesion con los datos "<email>" "<contrasenha>"
    Y         el usuario valida el inicio de sesion exitoso
    Y         el usuario ingresa a un reto y valida la informacion
    Y         el usuario soluciona el reto incorrectamente
    Entonces  el usuario cierra el navegador
    Ejemplos:
      | url |email|contrasenha|
      | https://code-buster.vercel.app/ |micaela.franco@yahoo.com|Codebuster123#|

  @CASO0009 @CODEBUSTER
  Esquema del escenario: El usuario solicita una pista para resolver correctamente un reto en la  Pagina de CODEBUSTER
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario inicia sesion con los datos "<email>" "<contrasenha>"
    Y         el usuario valida el inicio de sesion exitoso
    Y         el usuario ingresa a un reto y valida la informacion
    Y         el usuario solicita una pista
    Y         el usuario soluciona el reto correctamente
    Entonces  el usuario cierra el navegador
    Ejemplos:
      | url |email|contrasenha|
      | https://code-buster.vercel.app/ |micaela.franco@yahoo.com|Codebuster123#|