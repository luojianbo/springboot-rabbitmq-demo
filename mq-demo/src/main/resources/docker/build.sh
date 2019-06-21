#!/bin/bash
DOCKER_IMG=@docker.image@
DOCKER_CONTAIN=@docker.container@
APP_PORT=@project.port@
HOST_PROT=@docker.host.port@
APP_LOG_DIR=@project.log@
HOST_LOG_DIR=@docker.host.log@
docker stop ${DOCKER_CONTAIN}
docker rm  ${DOCKER_CONTAIN}
docker rmi  ${DOCKER_IMG}
docker build -t ${DOCKER_IMG} /home/docker/
docker run --name ${DOCKER_CONTAIN} --restart=always --privileged=true  -p ${HOST_PROT}:${APP_PORT} -v ${HOST_LOG_DIR}:${APP_LOG_DIR} -d ${DOCKER_IMG}


