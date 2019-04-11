#!/usr/bin/env bash
dokcerfile_path="src/main/docker"
image_name="webapp:latest"
mvn clean package -Dmaven.test.skip=true \
&& cp target/webapp.jar ${dokcerfile_path} \
#&& cd ${dokcerfile_path} \
#&& docker build -t ${image_name} . \
