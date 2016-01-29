FROM        node:4.2-wheezy

MAINTAINER  Thibaut Géry

RUN mkdir -p /var/www/app && mkdir -p /root/front

WORKDIR /root/front

## Get the dependencies
COPY package.json /root/front/package.json
RUN npm install

## Copy the source
COPY webpack.* /root/front/
COPY src /root/front/src

#Create app
RUN npm run build

#Copy app to destination
RUN cp -r /root/front/dist/* /var/www/app/
VOLUME /var/www/app

CMD sh
