#! /bin/bash -e

# Execute this script in the java-spring or scala-spring directory
# Runs all of the services
Service=transfer

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [[ -f $Service-cs.pid ]]; then
	echo pid file exists
	exit 1
fi

nohup java -jar $Service-1.0.0-SNAPSHOT.jar > $Service-cs.out &
echo $! > $Service-cs.pid


