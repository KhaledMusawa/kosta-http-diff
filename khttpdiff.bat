@echo off
REM httpdiff - Windows batch wrapper

REM Get the directory where this script is located
set SCRIPT_DIR=%~dp0

REM Run the JAR file with all arguments passed through
java -jar "%SCRIPT_DIR%target\khttpdiff.jar" %*