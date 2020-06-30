#!/bin/bash
GEN_DIR="src/main/java/com/example/smevsid0003817/wsdl"
#rm -r $GEN_DIR
wsimport -keep -Xnocompile schema.wsdl