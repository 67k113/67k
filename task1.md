# Task1 安装JDK
1. JDK
    - JDK是Java开发工具包，它包含了一系列开发Java程序的工具，如编译器（javac）、调试器等。
1. JRE
    - JRE是Java运行时环境。它提供了运行Java程序所必需的所有组件，包括Java虚拟机（JVM）、Java核心类库以及支持文件。
2. JVM
    -  JVM是Java虚拟机，它是Java程序运行的核心。JVM负责加载字节码文件，并将字节码解释或编译成机器码在特定的操作系统上运行。
3. 三者关系
    -  JDK包含JRE，JRE包含JVM。
4. 运行原因
    - JDK中的javac将编写的代码编译成字节码，然后JVM就能运行这些代码，JRE的核心类库提供相关支持。三者相辅相成，使得Java代码能够运行。
# Task2 配置环境变量
1.  配置了Java环境变量，将JDK的bin目录添加到Path环境变量当中。
2.  配置环境变量后，在命令行使用相关命令时，操作系统可以在额外目录（也就是jdk的bin目录）下找可执行文件，不会局限输入命令时的当前目录。例如：当输入java或者javac命令时，操作系统能找到jdk中相应文件然后操作
# Task3 编译和运行
1. [![pA361iT.png](https://s21.ax1x.com/2024/10/02/pA361iT.png)](https://imgse.com/i/pA361iT)
2. 涉及到HelloJava.java(源代码文件)然后通过javac编译成为HelloJava.class(字节码文件)最后使用Java运行。
# Task4 IDE的安装和使用
1. [![pA36Gz4.png](https://s21.ax1x.com/2024/10/02/pA36Gz4.png)](https://imgse.com/i/pA36Gz4)