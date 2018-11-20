➜  aop git:(master) ✗ ~/research/aop/bin/ajc -d . Hello.java TxAspect.java
➜  aop git:(master) ✗ ls -alh
total 16
drwxr-xr-x  5 heidsoft  staff   170B 11 20 14:12 .
drwxr-xr-x  3 heidsoft  staff   102B 11 20 13:47 ..
-rw-r--r--  1 heidsoft  staff   341B 11 20 13:48 Hello.java
-rw-r--r--  1 heidsoft  staff   404B 11 20 13:50 TxAspect.java
drwxr-xr-x  3 heidsoft  staff   102B 11 20 14:12 com


➜  aop git:(master) ✗ java com.heidsoft.aop.Hello
开始事务 ...
Hello AspectJ!
事务结束 ...
➜  aop git:(master) ✗