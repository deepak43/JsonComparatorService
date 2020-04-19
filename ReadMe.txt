REST end points :
---------------

1. To retrieve base JSON content with given primary key (id) of base json record
GET : /base-json/{id}

2. To add base JSON content
POST : /base-json
Payload : JSON content from Base.json file

3. To update base JSON content
PUT : /base-json
Payload : Updated JSON content

4. To delete base JSON content with given primary key (id) of base json record
DELETE : /base-json/{id}

5. To compare JSON content with base JSON record content
POST : /compare-json/{id}
Payload : JSON content from Input.json

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

To run program :
--------------

1. To generate .jar : 

    - For Linux/Mac
        Open Terminal/command line, change current directory to JsonComparatorService root directory and run below command
        ./mvnw package

    - For windows
        Open command prompt change current directory to JsonComparatorService root directory and run below command
        ./mvnw.cmd package

Here, .jar file will be created in ./target folder

2. To run .jar
    java -jar <jar file name>.jar

Now, application is running and you can access at - 

localhost:8080/

3. You can use above REST end-points for specific purpose as mentioned above.
4. First add base JSON content using POST : /base-json end-point with payload as JSON content from Base.json file
5. This will return Id of the base json record which you need to notedown since it is important for multiple calls
6. You can see the base JSON content by GET : /base-json/{id} where id is retrieved in above step.
e.g. If id retrieved in above step is 101 then, GET call be -
GET : localhost:8080/base-json/101
7. To compare the JSON from Input.json with base JSON content, use POST : /compare-json/{id} where id is of the base json record and payload for this is JSON content from Input.json file
8. This will return difference between two JSONs if any.

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-