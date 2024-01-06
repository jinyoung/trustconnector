# 

## Model
www.msaez.io/#/storming/2e024bc134f31c9495f0d089376e701e

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- demand-company
- supply-company
- ai-technology-provider
- advertising-and-marketing-partner
- cloud-service-provider
- developer-and-technical-expert
- marketing-and-sales-expert


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- demand-company
```
 http :8088/aiSolutionRequests 
 http :8088/consultingAndRequirementAnalyses 
 http :8088/solutionProvisionAndMaintenances 
 http :8088/technicalSupports 
```
- supply-company
```
 http :8088/developedAndProvidedSolutions 
 http :8088/customerRequirementAnalyses 
 http :8088/technologyUpdateAndMaintenances 
 http :8088/technicalSupports 
```
- ai-technology-provider
```
 http :8088/providedAiTechnologies 
```
- advertising-and-marketing-partner
```
 http :8088/marketingAndAdvertisingActivities 
```
- cloud-service-provider
```
 http :8088/providedCloudServices 
```
- developer-and-technical-expert
```
 http :8088/solutionDevelopments 
 http :8088/technicalSupports 
```
- marketing-and-sales-expert
```
 http :8088/marketingAndSalesActivities 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

