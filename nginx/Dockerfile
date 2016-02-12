FROM        nginx

MAINTAINER  Thibaut Géry

RUN apt-get update -y && apt-get install -y python-pip
RUN pip install Jinja2

ADD config_nginx_resolver.py /root
ADD resolver.conf.j2 /root

RUN rm /etc/nginx/conf.d/default.conf

ADD default-vhost /etc/nginx/sites-available/app.conf

RUN ln -s /etc/nginx/sites-available/app.conf /etc/nginx/conf.d/app.conf

CMD /bin/bash -c 'python /root/config_nginx_resolver.py :> /etc/nginx/conf.d/resolver.conf' \
      && /bin/bash -c 'nginx -c /etc/nginx/nginx.conf -g "daemon off;"'
