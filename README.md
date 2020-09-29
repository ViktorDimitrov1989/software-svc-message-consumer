# Curiousity
Part of a microservice architecture, this microservice is an event queue consumer.

# Run mongoDB container
    docker pull mongo
    docker run --name mongoDB -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=secret mongo    
