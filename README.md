## Assignment Review Steps

### Environment Requirements

You need to have docker installed in the system

### Download Artifacts

Execute the below command in your command prompt to download the docker image of the assignment

docker pull adeebdev/assignments:latest

### Execute Solution

Execute the below command in your command prompt to run the assignment solution

docker run -it adeebdev/assignments:latest

### View Results

Open Postman or any web API calling application and type below URLs to see results. Please replace localhost in the url with the IP address of the docker container that hosts the solution. 

Users: 

http://localhost/projects/elon

http://localhost/projects/bill

Projects:

http://localhost/projects/elon/1

http://localhost/projects/elon/2

http://localhost/projects/bill/1

http://localhost/projects/bill/2


Add header with key "Accept" and value "application/json" to get output in JSON format

Add header with key "Accept" and value "application/xml" to get output in XML format

