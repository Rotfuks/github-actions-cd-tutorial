#!/bin/bash
sh -c "gcloud auth login --cred-file=keyfile.json --project=${PROJECT_ID}"

sh -c "gcloud $*"
