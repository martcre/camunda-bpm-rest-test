# camunda-bpm-rest-test


Start a new Process Instance:

`curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:9080/camunda-bpm-rest-test/process-definition/key/orderPizza/start`

Query started Process Instances:

`curl http://localhost:9080/camunda-bpm-rest-test/process-instance`

Query activity of a Process instance:

`curl http://localhost:9080/camunda-bpm-rest-test/process-instance/4/activity-instances`