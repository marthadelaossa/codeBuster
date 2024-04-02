#language: es
Característica: Validar Contenido del menu Ciberseguridad Pagina de CODEBUSTER
@CASO0006 @CODEBUSTER
  Esquema del escenario: El usuario Valida el Contenido del menu Ciberseguridad en la  Pagina de CODEBUSTER correctamente
    Dado      que el usuario ingresa a la pagina de CodeBuster <url>
    Y         el usuario verifica que la página carga correctamente
    Y         el usuario inicia sesion con los datos "<email>" "<contrasenha>"
    Y         el usuario valida el inicio de sesion exitoso
    Y         el usuario ingresa al menu Ciberseguridad y valida el contenido
    Entonces  el usuario cierra el navegador
    Ejemplos:
      | url |email|contrasenha|
      | https://code-buster.vercel.app/ |micaela.franco@yahoo.com|Codebuster123#|

