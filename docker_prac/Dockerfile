FROM openjdk:11

WORKDIR /usr/src/app

COPY . /usr/src/app/

# no need for this if we use jar file or python as no compilation req
RUN javac Test.java

CMD [ "java" , "Test" ]

# CMD [ "java" , "-jar", "xyz.jar" ]
# EXPOSE 9595