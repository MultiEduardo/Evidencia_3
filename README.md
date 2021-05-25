## INSTALACIÓN Y CONFIGURACIÓN
 
**¿Cómo ejecutar el programa?**

Una vez descargado o clonado el proyecto se puede ejecutar el programa de dos
maneras diferentes.

**1.** Utilizando IDE
**2.** Utilizando la consola

### -Utilizar un IDE:
**1.** Descomprimir el proyecto. (Hay que saber en qué ubicación lo estamos 
   descomprimiendo para futuros pasos).
**2.** Abrir el IDE de tu elección (InteljiJ, NetBeans, etc).
**3.** En caso de ser NetBeans, seleccionar la opción "Open Proyect..." del 
   menú "File". En caso de no encontrarse en NetBeans, seleccionar la opción 
   correspondiente a "Abrir proyecto".
**4.** Se abrirá una ventana en la que seleccionaremos nuestra carpeta. En este 
   punto, hay que buscar la ruta en que se descomprimió el proyecto, para poder 
   abrirlo. La carpeta debería aparecer con un ícono de una taza de café (ícono 
   de Java), esa es la que se seleccionará.
**5.** Ya con el proyecto abierto en NetBeans, se selecciona el botón con el ícono 
   de reproducción (Run) para correr el programa. Entonces se desplegará el 
   resultado en la consola integrada de NetBeans.
**6.** En el caso de IntelljiJ debes descomprimir el archivo, una vez descomprimido, te iras a file 
   y open proyect, en dado caso con no contar con la librería sqlite-jdbc-3.32.3.2, puedes descargar 
   el archivo zip https://jar-download.com/artifacts/org.xerial/sqlite-jdbc/3.32.3.2/source-code.

### -Instalación del sqlite librería
**1.** Cuando descargues el archivo zip del sql, lo vas a descomprimir en el caso de netbeans, 
   te vas a la librería, con el clic derecho te vas add library, una vez adentro le picas en
   crear librería, le pones el nombre SQLite y buscas el archivo que descomprimiste, le das clic
   en ok y seleccionas la librería que creaste, una vez más okay, ya tendrías la librería.
**2.** En el caso de Intellij, te iras a file, despues project Structure, una vez adentro te vas 
   a la libraries, le das clic en el símbolo de más y buscas el archivo descomprimido de sqlite
   le picas en ok y deja que se instale la librería 
 
   
### -Utilizar la consola:
Para este procedimiento, es necesario contar con el archivo ejecutable .JAR, de
lo contrario no servirá.

**1.** Descomprimir el proyecto. (Hay que saber en qué ubicación lo estamos
descomprimiendo para futuros pasos).
**2.** Abrir la consola (Símbolo del sistema).
**3.** Dirigirnos a la ruta en que está el ejecutable (en la carpeta "dist" del
proyecto), por medio de comandos (cd <Tu ruta>/dist).
**4.** Escribir el siguiente comando: java -jar "Evidencia 3.jar". Esto nos permitirá
la correcta ejecución del programa, desde la consola.

 ## USO DEL PROGRAMA
 
Para usar el programa, hay que iniciar sesión con un usuario registrado en la base
de datos.

El usuario inicial o provisional, con el que se puede probar el funcionamiento es:
 ***Usuario:** admin
 ***Contraseña:** admin

Una vez iniciada sesión, para realizar las diferentes funciones hay que seguir las 
instrucciones del menú interactivo: 

**1.** Dar de alta paciente: registrar el paciente por medio de su ID, nombre y una
breve descripción del problema que lo trajo. 
**2.** Mostar pacientes: lista todos los pacientes de la base de datos y sus atributos
**3.** Dar de alta doctor: registra el doctor mediante su ID, nombre y especialidad.
**4.** Mostrar doctores: lista todos los doctores en la base de datos y sus atributos.
**5.** Agendar cita: crea una lista con ID, fecha y hora.
**6.** Mostrar todas las citas: lista todas las citas con sus respectivos atributos.
**7.** Relacionar citas: toma los IDs de la cita, doctor y paciente como parámetros y
las relaciona en la base de datos.
**8.** Mostrar citas relacionadas: muestra todas las citas con su respectivo doctor, 
fecha y paciente.
**9.** (0)Salir: termina la ejecución del programa.


 ##CRÉDITOS 
 
_Desarrollado por Bryan Eduardo Vazquez Torres_


 ##LICENCIA 
 
_Copyright 2021 Bryan Eduardo Vazquez Torres_

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
