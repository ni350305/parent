@echo off
echo [INFO] ȷ������mvn install���btools\maven�µ���Ŀģ��

set MVN=mvn
if exist "tools\maven\apache-maven-3.0.4\" set MVN="%cd%\tools\maven\apache-maven-3.0.4\bin\mvn.bat"
echo Maven����Ϊ%MVN%


set /p drive=������Ŀ¼��(��:E:\\):
if "%drive%"=="" set drive=E:\\
if not exist "%drive%" mkdir %drive%
echo %drive%
cd /d %drive%
call %MVN% archetype:generate -DarchetypeCatalog=local
pause
