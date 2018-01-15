echo "INSTALLING SAUCE CONNECT LOCALLY"
mvn install:install-file -Dfile=lib/sauce-connect-3.1.32.jar -DpomFile=lib/sauce-connect-3.1.32.pom
echo "SAUCE CONNECT INSTALLATION SUCCESSFUL!"