@echo off
echo [INFO] ������Ŀģ��...
cd %~dp0
cd ..
call mvn archetype:create-from-project
cd bin
pause