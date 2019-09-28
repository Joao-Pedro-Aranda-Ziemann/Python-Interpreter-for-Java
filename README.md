# Python Interpreter for Java
Java code that uses the python interpreter to execute python scripts and lines of code.

## Tutorial Python3:
To execute a line of Python3 code in java, an object like "Python3" is created, passing the execution path of the version of python installed on the machine. However passing the path is only necessary if python is installed somewhere other than the default linux ("/usr/bin/python3"), or if you are using Windows.
After the "Python3" type object is created, the method "ᐷᐷᐷ" is called, which receives the line of python code that will be executed. In addition to this method, to execute commands that need a "TAB" to function as loops or ifs, the "ooo" function is made for this type of python command.
Finally, to execute the command lines, the "Run" method is used, which offers the option to print on the console by setting the signature to "true".

To execute a script (.py), it is necessary as already mentioned the creation of object like "Python3", along with the call of the method "PyRun", where it is passed the path and the option of print in the Java console.

## Tutorial Python2:
To run Python 2, the same previous syntax is used, changing only the object of type "Python3" to "Python2".

## Tutorial Bash:
It is also possible to execute command from the Bash terminal using the "shell" method, or to execute scripts with the "ShRun" command.

##Example Python:
Python3 python3 = new Python3();
python3.ᐷᐷᐷ("print('ok')");
python3.ᐷᐷᐷ("for x in range(1, 10):");
python3.ooo("print(x)");
python3.ᐷᐷᐷ("print('End')");
python3.Run(true);

python3.PyRun("/home/user/Desktop/test.py", true);

##Example Bash:
Bash bash = new Bash();
bash.shell("ls", true);

bash.ShRun("/home/user/Desktop/test.sh", true);
