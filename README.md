# ChallengeQA

CHALLENGE 1 - SerenityBDD

1. Prerequisitos:
-Hardware:  Maquina Local - Lenovo Legion 15 ()
-Sistema operativo: Windows 11
-IDE: Intellij Idea v2023.1
-JDK 1.8.0_202
-Gradle 8.1.1


2. Comandos de instalacion

-Instalar intellij

-Instalar JDK y editar variables de entorno + path 

-Instalar gradle 8.1.1 y editar variables de entorno 

-Verificar versiones en CMD

3. Instrucciones para realizar los tests

	-Crear proyecto - proyecto Serenity-bdd.git (cucumber-screenplay)
	
	-En la carpeta 'test/java' del proyecto creado:

	PASO 0 - Modificar archivos serenity.conf, pom.xml

	PASO 1 - Revisar y modificar archivo 'build.gradle'

	PASO 2 - Crear archivos runners y features

	PASO 3 - Crear sstep definitions

	PASO 4 - Crear mapeo de cada pagina necesaria para el flujo de compra

	PASO 5 - Continuar proceso de compra - crear steps para cada paso 

	PASO 6 - Llegar al mensaje final - terminar flujo de compra
 -----------------------------------------------------------------------------------------------------------------------------------------------------------------
CHALLENGE 2 - KARATE

1. Prerequisitos:
-Hardware:  Maquina Local - Lenovo Legion 15 ()
-Sistema operativo: Windows 11
-IDE: Intellij Idea v2023.1
-Java 11.0.19
-Apache Maven 3.9.2

2. Comandos de instalacion

-Instalar intellij

-Instalar JDK y editar variables de entorno + path 

-Instalar maven 3.9.2 y editar variables de entorno + path

-Verificar versiones en CMD

3. Instrucciones para realizar los tests

	-Crear proyecto maven en intellij.

	-Agregar Dependencias necesarias: maven (karate git repository)
	
	-En la carpeta 'test/java' del proyecto creado:

	1. Generar archivo .java - karateRunner (test)
	2. Crear archivo .feature (features y scenarios)
	3. Generar archivo logback.xml (logging)

	-En el archivo .feature:

	TEST 1 (agregar nueva mascota) - POST 
	1. Establecer feature y scenario
	2. Establecer url - 'given' (url base)
	3. Formular peticion - 'request' (json)
	4. Fijar metodo HTTP - 'post'
	5. Esperar respuesta exitosa - 'status 200'
	6. Verificar reporte en navegador

	TEST 2 (consultar mascota nueva agregada) - GET by id
	1. Establecer feature y scenario
	2. Establecer url - 'given' (url id)
	3. Fijar metodo HTTP - 'get'
	4. Obtener path del response (x.id) (jsonpathfinder.com-jsonpath.com)
	5. Esperar respuesta exitosa - 'status 200'
	6. Realizar asercion con id - 'match response.id == x'
	7. Verificar reporte en navegador

	TEST 3 (actualizar nueva mascota agregada) - PUT
	1. Establecer feature y scenario
	2. Establecer url - 'given' (url base)
	3. Formular peticion - 'request' (json)
	4. Fijar metodo HTTP - 'put'
	5. Esperar respuesta exitosa - 'status 200'
	6. Verificar reporte en navegador

	TEST 4 (consultar nueva mascota actualizada)  - GET by status
	1. Establecer feature y scenario
	2. Establecer url - 'given' (url/findByStatus)
	3. Fijar metodo HTTP - 'get'
	4. Obtener path del response ([?(@.value)] (jsonpathfinder.com-jsonpath.com)
	5. Esperar respuesta exitosa - 'status 200'
	6. Realizar asercion con status - 'match response.status == x'
	7. Verificar reporte en navegador



