# concurso
Buen dia, esta es mi solución al reto que ustedes solicitaron, actualmente se pudo cumplir con los objetivos de premio acumulado, preguntas aleatorias
por categorias y tambien despliegue de las opciones de acuerdo a la pregunta realizada, también se cumple con que solo una debe ser correcta, y apartir
de respuestas correctas avanzar en el juego, solo se debe responder con una de las respuestas enunciadas para que el problema corra sin problema alguno.

Ahora bien para este proyecto yo mismo realice la base de datos con dos tablas con las preguntas y respuestas  (banco de preguntas y respuestas por 
categoria. En la clase ConexionPreguntas.java lo veran como se establece la conexion con una base de datos local llamada concurso.
Para realizar esto, el proyecto lo inicialicé con Apache Netbeans, entonces se debe iniciar el proyecto como un java with maven. Modifiqué levemente el 
archivo pom.xml para aceptar esto, de igual forma en la rama principal lo veran tal cual se debe dejar.
En cada clase esta el comentario de lo que hace esta misma en el codigo.
Cualquier inquietud mi correo es sebastiangraciano95@gmail.com aunque de seguro ya lo saben.


Para la base de datos cree una llamada concurso en MySqQL Workbench, se creó una tabla llamada categoria_pregunta con los siguientes parametros: 
idcategoria_pregunta, categoria, pregunta. idcategoria_pregunta es llave primaria, entero, no nula, autoincremental. categoria y pregunta ambas son tipo VARCHAR(45).La tabla debe de seguir la siguiente estructura:
idcategoria_pregunta, categoria, pregunta
'1', 'primera categoria', '¿cual es la capital de Colombia?'
'2', 'primera categoria', '¿cual es la capital de Argentina?'
'3', 'primera categoria', '¿cual es la capital de Chile?'
'4', 'primera categoria', '¿cual es la capital de EEUU?'
'5', 'primera categoria', '¿cual es la capital de Mexico?'
'6', 'segunda categoria', '¿cual idioma se habla en Belgica?'
'7', 'segunda categoria', '¿cual idioma se habla en Sudafrica?'
'8', 'segunda categoria', '¿cual idioma se habla en Quebec?'
'9', 'segunda categoria', '¿cual idioma se habla en Jamaica?'
'10', 'segunda categoria', '¿cual idioma se habla en Suecia?'
'11', 'tercera categoria', '¿cual es la comida tipica de Mexico?'
'12', 'tercera categoria', '¿cual es la comida tipica de Argentina?'
'13', 'tercera categoria', '¿cual es la comida tipica de Alemania?'
'14', 'tercera categoria', '¿cual es la comida tipica de EEUU?'
'15', 'tercera categoria', '¿cual es la comida tipica de Colombia?'
'16', 'cuarta categoria', '¿cual es el actual presidente de España?'
'17', 'cuarta categoria', '¿cual es el actual presidente de Paraguay?'
'18', 'cuarta categoria', '¿cual es el actual presidente de Ghana?'
'19', 'cuarta categoria', '¿cual es el actual presidente de EEUU?'
'20', 'cuarta categoria', '¿cual es el actual presidente de Alemania?'
'21', 'quinta categoria', '¿cual cientifico es Colombiano?'
'22', 'quinta categoria', '¿cual cientifico es Aleman?'
'23', 'quinta categoria', '¿cual cientifico es mexicano?'
'24', 'quinta categoria', '¿cual cientifico es ingles?'
'25', 'quinta categoria', '¿cual cientifico es frances?'
'
se creó una tabla llamada respuestas con los siguientes parametros: idrespuestas es llave primaria, entero, no nula, autoincremental. numero_pregunta, respuestas y booleana de tipo VAVRCHAR(45). La tabla debe de seguir la siguiente estructura:
idrespuestas, numero_pregunta, respuestas, booleana
'1', '1', 'Bogota', 'Verdadero'
'2', '1', 'Medellin', 'Falso'
'3', '1', 'Cali', 'Falso'
'4', '1', 'Cartagena', 'Falso'
'5', '2', 'Tucuman', 'Falso'
'6', '2', 'Mendoza', 'Falso'
'7', '2', 'Buenos aires', 'Verdadero'
'8', '2', 'Cordoba', 'Falso'
'9', '3', 'Viña del mar', 'Falso'
'10', '3', 'Santiago de Chile', 'Verdadero'
'11', '3', 'Concepcion', 'Falso'
'12', '3', 'Mapuche', 'Falso'
'13', '4', 'Washinton D.C', 'Verdadero'
'14', '4', 'Seattle', 'Falso'
'15', '4', 'Miami', 'Falso'
'16', '4', 'Los Angeles', 'Falso'
'17', '5', 'Ciudad de Mexico', 'Verdadero'
'18', '5', 'Monterrey', 'Falso'
'19', '5', 'Jalisco', 'Falso'
'20', '5', 'Acapulco', 'Falso'
'21', '6', 'Frances', 'Verdadero'
'22', '6', 'Portgues', 'Falso'
'23', '6', 'Mandarin', 'Falso'
'24', '6', 'Catalan', 'Falso'
'25', '7', 'Ingles', 'Verdadero'
'26', '7', 'Catalan', 'Falso'
'27', '7', 'Quechua', 'Falso'
'28', '7', 'Noruego', 'Falso'
'29', '8', 'Frances', 'Verdadero'
'30', '8', 'Aleman', 'Falso'
'31', '8', 'Euzkera', 'Falso'
'32', '8', 'Filipino', 'Falso'
'33', '9', 'Ingles', 'Verdadero'
'34', '9', 'Maya', 'Falso'
'35', '9', 'Japones', 'Falso'
'36', '9', 'Neerlandes', 'Falso'
'37', '10', 'Sueco', 'Verdadero'
'38', '10', 'Malayo', 'Falso'
'39', '10', 'Ruso', 'Falso'
'40', '10', 'Ucraniano', 'Falso'
'41', '11', 'Tacos', 'Verdadero'
'42', '11', 'Queso', 'Falso'
'43', '11', 'Cachapas', 'Falso'
'44', '11', 'Pupusas', 'Falso'
'45', '12', 'Choripan', 'Verdadero'
'46', '12', 'Causa', 'Falso'
'47', '12', 'Pasta', 'Falso'
'48', '12', 'Patacon', 'Falso'
'49', '13', 'Schnitzel', 'Verdadero'
'50', '13', 'Fish and chips', 'Falso'
'51', '13', 'Pastas', 'Falso'
'52', '13', 'Pan con queso', 'Falso'
'53', '14', 'Hot dogs', 'Verdadero'
'54', '14', 'Pizza', 'Falso'
'55', '14', 'Frijol', 'Falso'
'56', '14', 'Tortilla', 'Falso'
'57', '15', 'Arepa', 'Verdadero'
'58', '15', 'Sushi', 'Falso'
'59', '15', 'Causa', 'Falso'
'60', '15', 'Ceviche', 'Falso'
'61', '16', 'Pedro Sanchez', 'Verdadero'
'62', '16', 'Vladimir Putin', 'Falso'
'63', '16', 'Mariano Rajoy', 'Falso'
'64', '16', 'Jose Rodriguez', 'Falso'
'65', '17', 'Mario Benitez', 'Verdadero'
'66', '17', 'Horacio Cartes', 'Falso'
'67', '17', 'Federico Franco', 'Falso'
'68', '17', 'Fernando Lugo', 'Falso'
'69', '18', 'Nana Akufo-Addo', 'Verdadero'
'70', '18', 'Jerry Rawlings', 'Falso'
'71', '18', 'Hilla Limann', 'Falso'
'72', '18', 'Kwame Nkrumah', 'Falso'
'73', '19', 'Joe Biden', 'Verdadero'
'74', '19', 'Barack Obama', 'Falso'
'75', '19', 'Donald trump', 'Falso'
'76', '19', 'George Bush', 'Falso'
'77', '20', 'Frank-Walter Steinmeier', 'Verdadero'
'78', '20', 'Joachim Gauck', 'Falso'
'79', '20', 'Horst Seehofer', 'Falso'
'80', '20', 'Christian Wulff', 'Falso'
'81', '21', 'Manuel Elkin Patarroyo', 'Verdadero'
'82', '21', 'Federico Garcia Lorca', 'Falso'
'83', '21', 'Gabriel Garcia Marquez', 'Falso'
'84', '21', 'Andres Silva', 'Falso'
'85', '22', 'Albert Einstein', 'Verdadero'
'86', '22', 'George Washinton', 'Falso'
'87', '22', 'Galileo Galilei', 'Falso'
'88', '22', 'Gerado Molina', 'Falso'
'89', '23', 'Mario Molina', 'Verdadero'
'90', '23', 'Pablo Bedoya', 'Falso'
'91', '23', 'Sebastian Graciano', 'Falso'
'92', '23', 'Julio Cortazar', 'Falso'
'93', '24', 'Isaac Newton', 'Verdadero'
'94', '24', 'Albert Camus', 'Falso'
'95', '24', 'Galileo Galilei', 'Falso'
'96', '24', 'Niels Bohr', 'Falso'
'97', '25', 'Marie Curie', 'Verdadero'
'98', '25', 'Albert Camus', 'Falso'
'99', '25', 'Niels Bohr', 'Falso'
'100', '25', 'Lorentz', 'Falso'

De esta forma estan las base de datos con las dos tablas en MySQL Workbench la cual conecto con ApacheNetBeans, adicionalmente la base de datos se aloja en localhost, en los parametros establecidos en el programa en ConexionPreguntas.java las credenciales para acceder user: root y password: admin dependen de como establecen su MySQL, solo seria cambiar estos dos parametros, porque el URL si crean la base de datos en el localhost es ese.
