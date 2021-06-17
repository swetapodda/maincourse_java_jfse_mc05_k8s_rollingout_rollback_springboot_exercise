## Exercise: Experiment with rolling out and rolling back Spring Boot microservice application on a K8s Cluster

  

* In this Exercise, you will concentrate on rolling out and rolling back Spring Boot microservice application on K8s Cluster.

  
This exercise contains following files in k8s folder:

	- springboot-deployment.yml- To create the deployment
	- springboot-svc.yml- To create service of type NodePort to expose the deployed springboot application

  
This exercise contains SbService, a RESTful Spring Boot application. For this exercise perform the following steps:

	1. Build the Docker image for the Spring Boot application.
	2. Tag the docker image.
	3. Push the image to Docker Hub.


Understand and perform the following steps to complete this exercise:

	1. Follow the instructions given in the `springboot-deployment.yml` file and create deployment.
	2. Follow the instructions given in the `springboot-svc.yml` file and create service.
	3. Test the service, open the browser and check for `http://<minikube-ip>:<nodePort>/message` url, you will be able to see the message from 1.0 version.
	5. Perform rollout, make changes in `app.message` in `application.yml` of Spring boot to 2.0 and again push to docker hub by tagging it as 2.0.
	6. Change the image from `<username>/<image-name>:1.0` to `<username>/<image-name>:2.0` in apringboot-deployment.yml.
	7. Create the deployment again, run command `kubectl apply -f springboot-deployment.yml` in k8s folder.
	8. Check the rollout status, run command `kubectl rollout status deployment.apps/<name-of-deployment>`.
	9. Test the rollout , open the browser and check for `http://<minikube-ip>:<nodePort>/message` url, you will be able to see the message from 2.0 version.
	10. Perform rollback, run command `kubectl undo rollout deployment.app/<name-of-deployment>`.
	11.Test the rollback , open browser and check for `http://<minikube-ip>:<nodePort>/message` url, you will be able to see the message from 1.0 version

### Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided code unless instructed
- Ensure your code compiles without any errors/warning/deprecations
- Follow best practices while coding