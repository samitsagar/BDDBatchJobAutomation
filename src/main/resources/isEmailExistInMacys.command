#!/bin/bash

# Get SMART status of main drive
#diskutil info disk0 | grep -i smart

# Get the model of the machine in question
#system_profiler SPHardwareDataType | grep -i Identifier

curl -X POST -H "Content-Type: application/json" \
    -d '{"user":{"email":"amol.ray@macys.com"}}' \
    https://www.mcom-128.tbe.zeus.fds.com/account-xapi/api/myaccount/email?from=createAccount 
    #>> /Users/b009283/Desktop/log/batchLog.log
