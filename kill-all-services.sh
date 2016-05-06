#! /bin/bash 
Service=transfer
datename=$(date +%Y%m%d-%H%M%S) 

mkdir log
mv $Service-cs.out log/$Service.$datename
kill `cat $Service-cs.pid`
rm $Service-cs.pid
