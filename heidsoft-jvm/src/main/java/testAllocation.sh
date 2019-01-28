#!/bin/bash

java -XX:+PrintCommandLineFlags \
-verbose:gc -Xms20M -Xmx20M -Xmn10M \
-XX:SurvivorRatio=8  \
-XX:+PrintGCDetails \
-XX:+PrintGCTimeStamps \
-XX:+PrintGCDateStamps \
-XX:+PrintTenuringDistribution \
-XX:+PrintGCApplicationStoppedTime \
-Xloggc:testAllocation.gc.log \
-XX:+PrintTenuringDistribution \
YoungGenGC