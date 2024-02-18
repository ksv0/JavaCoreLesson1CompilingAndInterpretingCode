FROM openjdk:latest
WORKDIR /usr/src/app
COPY ./src/main/java .
RUN javac -sourcepath . -d out ./ksv/Main.java
WORKDIR /usr/src/app/out
CMD java -classpath . ksv.Main