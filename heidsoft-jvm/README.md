# How to enable Java GC Logging?

```
For Java 1.4, 5, 6, 7, 8 pass this JVM argument to your application: 
-XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:<file-path>

For Java 9, pass the JVM argument: -Xlog:gc*:file=<file-path>
file-path: is the location where GC log file will be written**
```

# 在线分析

http://gceasy.io/
https://blogs.oracle.com/poonam/how-to-programmatically-obtain-gc-information