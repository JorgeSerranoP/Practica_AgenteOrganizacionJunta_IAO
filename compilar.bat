set PATH=C:\Program Files\Java\jdk1.8.0_202\bin;%PATH%
set classpath=src\lib\Base64.jar;src\lib\GraphLayout.jar;src\lib\bcel.jar;\src\lib\http.jar;src\lib\iiop.jar;src\lib\jade.jar;src\lib\jadeTools.jar;src\lib\jadex_examples.jar;src\lib\jadex_jadeadapter.jar;src\lib\jadex_rt.jar;src\lib\jadex_standalone.jar;src\lib\jadex_tools.jar;src\lib\jhall.jar;src\lib\jibx-bind.jar;src\lib\jibx-extras.jar;src\lib\jibx-run.jar;src\lib\xpp3.jar;src;src\lib\commons-commons\commons-codec-1.3.jar

javac src\ontologia\acciones\*java 
javac src\ontologia\conceptos\*java 
javac src\ontologia\predicados\*java 
javac src\tablero\creencias\*java
javac src\tablero\planes\inicio_partida\*java
javac src\tablero\planes\votacion_gp\*java
javac src\tablero\planes\votacion_presupuesto\*java
javac src\tablero\planes\guardar_suiza\*java
javac src\tablero\planes\acciones_cartas\*java
javac src\tablero\planes\elegir_localizacion\*java
javac src\tablero\planes\otorgar_victoria\*java

pause
jar cvf JuntaJadex *
pause 

