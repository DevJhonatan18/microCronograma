#/bin/bash

curl "localhost:8012/ver/$1" | python -m json.tool
