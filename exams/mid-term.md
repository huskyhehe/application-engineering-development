# Contents
1. Deep copy shallow copy: 
Write a class for “Something” have multiple constructors for the class, Write a Copy Constructor for the class. 

2. Difference between abstract class and interface: 
https://www.guru99.com/interface-vs-abstract-class-java.html#:~:text=An%20abstract%20class%20permits%20you,class%20can%20implement%20multiple%20interfaces

3. Create a parent class and child class 

4. Singleton/Pubsub:
https://github.com/HappyCoder29/Spring2022-Info5100/blob/main/DesignPatterns/SingletonDesignpattern/src/edu/northeastern/ashish/Camera.java

5. Some string question.

## summary
| | Shallow Copy | Deep Copy |
| -| -- | -- |
| Cloned object & source object | are not disjoint completely | are completely independent of each other | 
| Speed | fast | slow |
| Will changes made in the cloned instance impact the reference variable of the source object? | Yes | No |
| Condition preferred:|  if class variables of the object are only primitive type as fields |  if the object’s class variables have references to other objects as fields. |
