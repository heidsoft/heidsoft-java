# StopThread.class
```
➜  chapter11 git:(master) ✗ javap -c StopThread.class
Compiled from "StopThread.java"
public class com.heidsoft.chapter11.StopThread {
  public com.heidsoft.chapter11.StopThread();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]) throws java.lang.InterruptedException;
    Code:
       0: new           #2                  // class java/lang/Thread
       3: dup
       4: invokedynamic #3,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
       9: invokespecial #4                  // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
      12: astore_1
      13: aload_1
      14: invokevirtual #5                  // Method java/lang/Thread.start:()V
      17: getstatic     #6                  // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
      20: lconst_1
      21: invokevirtual #7                  // Method java/util/concurrent/TimeUnit.sleep:(J)V
      24: iconst_1
      25: putstatic     #8                  // Field stopRequested:Z
      28: return

  static {};
    Code:
       0: iconst_0
       1: putstatic     #8                  // Field stopRequested:Z
       4: return
}

```

# StopThreadGood.class
```aidl
➜  chapter11 git:(master) ✗ javap -c StopThreadGood.class
Compiled from "StopThreadGood.java"
public class com.heidsoft.chapter11.StopThreadGood {
  public com.heidsoft.chapter11.StopThreadGood();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]) throws java.lang.InterruptedException;
    Code:
       0: new           #3                  // class java/lang/Thread
       3: dup
       4: invokedynamic #4,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
       9: invokespecial #5                  // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
      12: astore_1
      13: aload_1
      14: invokevirtual #6                  // Method java/lang/Thread.start:()V
      17: getstatic     #7                  // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
      20: lconst_1
      21: invokevirtual #8                  // Method java/util/concurrent/TimeUnit.sleep:(J)V
      24: invokestatic  #9                  // Method requestedStop:()V
      27: return

  static {};
    Code:
       0: iconst_0
       1: putstatic     #2                  // Field stopRequested:Z
       4: return
}

```
# SerialNumberBad.class
```aidl
Compiled from "SerialNumberBad.java"
public class com.heidsoft.chapter11.SerialNumberBad {
  public com.heidsoft.chapter11.SerialNumberBad();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]) throws java.lang.InterruptedException;
    Code:
       0: new           #2                  // class java/lang/Thread
       3: dup
       4: invokedynamic #3,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
       9: invokespecial #4                  // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
      12: astore_1
      13: aload_1
      14: invokevirtual #5                  // Method java/lang/Thread.start:()V
      17: new           #2                  // class java/lang/Thread
      20: dup
      21: invokedynamic #6,  0              // InvokeDynamic #1:run:()Ljava/lang/Runnable;
      26: invokespecial #4                  // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
      29: astore_2
      30: aload_2
      31: invokevirtual #5                  // Method java/lang/Thread.start:()V
      34: return

  public static int generateSerialNumber();
    Code:
       0: getstatic     #7                  // Field nextSerialNumber:I
       3: dup
       4: iconst_1
       5: iadd
       6: putstatic     #7                  // Field nextSerialNumber:I
       9: ireturn

  static {};
    Code:
       0: iconst_0
       1: putstatic     #7                  // Field nextSerialNumber:I
       4: return
}

```

# T.class
```aidl
https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html

-g:{keyword list}
    Generate only some kinds of debugging information, specified by a comma separated list of keywords. Valid keywords are:
    source
    Source file debugging information
    lines
    Line number debugging information
    vars
    Local variable debugging information

javac -g:vars  T.java


➜  chapter11 git:(master) ✗ javap -v -l T.class
Classfile /Users/heidsoft/Downloads/research/heidsoft-java/heidsoft-effective-java/src/main/java/com/heidsoft/chapter11/T.class
  Last modified 2021-10-10; size 311 bytes
  MD5 checksum c906794c86272fe91339479f27558825
public class com.heidsoft.chapter11.T
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #3.#15         // java/lang/Object."<init>":()V
   #2 = Class              #16            // com/heidsoft/chapter11/T
   #3 = Class              #17            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LocalVariableTable
   #8 = Utf8               this
   #9 = Utf8               Lcom/heidsoft/chapter11/T;
  #10 = Utf8               addFun
  #11 = Utf8               (II)I
  #12 = Utf8               a
  #13 = Utf8               I
  #14 = Utf8               b
  #15 = NameAndType        #4:#5          // "<init>":()V
  #16 = Utf8               com/heidsoft/chapter11/T
  #17 = Utf8               java/lang/Object
{
  public com.heidsoft.chapter11.T();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/heidsoft/chapter11/T;

  public int addFun(int, int);
    descriptor: (II)I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1
         1: iload_2
         2: iadd
         3: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lcom/heidsoft/chapter11/T;
            0       4     1     a   I
            0       4     2     b   I
}

```