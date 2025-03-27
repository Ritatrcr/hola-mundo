@echo off
echo Desplegando la aplicación...
 
mvn clean install
java -cp target/classes HolaMundo
 
echo Despliegue completado.
 