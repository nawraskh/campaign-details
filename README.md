# campaign-details

## Instruction to run the project locally(using docker):
* clone the repository(note: code is in master).
  ```
   git clone https://github.com/nawraskh/campaign-details.git
   git checkout master
  ```
* navigate to the project root directory.
* build jar:
  ```
  mvn package
  ```
* create docker image:
  ```
  docker build .
  ```
  * tag the created image(take the image id from running the command ```docker image ls```):
    run command 
    ```
    docker image tag <imageId> campaign:latest
    ```
 * run the container:
    ```
    docker run -it -p 8080:8080 campaign
    ```
    
## Testing
try send request(using postman or chrome):
  ```
  http://localhost:8080/listings?min_price=0.0081&max_price=0.15&min_min_cpm=1&max_min_cpm=2
  ``` 


## points to improve or add :
*  Uploding the csv file into database table
*  using spring boot ORM to read out data from DB
*  create an data transfer object (response object)- that will contan specefic return objects
*  mapping mechanism to map Entities to DTOs

