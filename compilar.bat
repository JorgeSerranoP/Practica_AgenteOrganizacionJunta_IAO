set PATH=D:\Programas\Java\JDK\bin;%PATH%
set classpath=src\lib\Base64.jar;src\lib\GraphLayout.jar;src\lib\bcel.jar;\src\lib\http.jar;src\lib\iiop.jar;src\lib\jade.jar;src\lib\jadeTools.jar;src\lib\jadex_examples.jar;src\lib\jadex_jadeadapter.jar;src\lib\jadex_rt.jar;src\lib\jadex_standalone.jar;src\lib\jadex_tools.jar;src\lib\jhall.jar;src\lib\jibx-bind.jar;src\lib\jibx-extras.jar;src\lib\jibx-run.jar;src\lib\xpp3.jar;src;src\lib\commons-commons\commons-codec-1.3.jar

javac src\ontologia\acciones\*java 
javac src\ontologia\conceptos\*java 
javac src\ontologia\predicados\*java 
javac src\tablero\creencias\*java
javac src\tablero\planes\*java

pause
jar cvf JuntaJadex *
pause 

