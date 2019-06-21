#!/bin/bash
DOCKER_IMG=mq-image
DOCKER_CONTAIN=mq-app
APP_PORT=4003
HOST_PROT=4003
APP_LOG_DIR=/var/log/
HOST_LOG_DIR=/home/docker/logs/mq/
docker stop ${DOCKER_CONTAIN}
docker rm  ${DOCKER_CONTAIN}
docker rmi  ${DOCKER_IMG}
docker build -t ${DOCKER_IMG} /home/docker/
docker run --name ${DOCKER_CONTAIN} --restart=always --privileged=true  -p ${HOST_PROT}:${APP_PORT} -v ${HOST_LOG_DIR}:${APP_LOG_DIR} -d ${DOCKER_IMG}


