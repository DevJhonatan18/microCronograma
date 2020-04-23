#/bin/bash

curl 'localhost:8012/listar' | python -m json.tool
