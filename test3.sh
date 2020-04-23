#/bin/bash

curl "localhost:8012/ver/$1/$2" | python -m json.tool
