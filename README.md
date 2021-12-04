# peopleFlow

This solution was build to solve the challenge attached (challenge.md). 
To keep it the simplest possible a monolithic approach was followed (please ping me in case you want the microservice one). 
A MySQL database with a kafka cluster are used.


Two main functions were build the add employee and the update status one. both were build through an event driven approach. 
the first create the object and throw it in the job queue. the second one search for the object, update the status then throw it in the same job queue.

The usage of the same job queue (with the single consumer) will prevent us from having "dead lock" issue.


### Docker
To reduce the configuration complexity a `docker-compose.yml` file was attached. 
To activate it use:
`docker-compose up`

### OPENAPI 
Open api was integrated 

to get the yaml file : 
`http://localhost:8080/v3/api-docs`

to access the swagger page
`http://localhost:8080/swagger-ui.html`