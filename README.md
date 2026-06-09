[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24109315)
# testingObjectsWithJava

Name: Edwin Granados
Date: June 9, 2026

Q1. If you print your object without having a toString() defined for it, then Java will print the name of the class of your object preceded by a "@" and a hexadecimal hashcode. That’s because the toString() method, which is inherited by your object from the Object class, returns just that string. In other words, it’s Java saying "I have your identity, but how do you wish to present it?"

Q2. The fields of String printed as null since String is a reference variable type, while reference variables that remain uninitialized take a value of null by default. The field for int was printed as 0 since it is a primitive type whose values initialize automatically to their respective defaults.

Q3. In part B, the field variables were set to their default values until such a time that something was assigned to them. By using constructors, the object would already have some initial value as soon as it is instantiated since the constructor controls the state in which the object starts its existence.

Q4. When the object was printed in Part A, the output came out in the default form of "ClassName@hexcode". In Part D, however, the output became readable since you have overridden the toString() method. The use of the @Override annotation is helpful since Java checks if you really are overriding an actual method. If you make mistakes on your method name or signature, Java warns you instead of creating a new one.

Q5. Privacy ensures that these values cannot be altered from anywhere else in the program. Methods like getters and setters allow you to have complete control over the reading and updating of the value. For instance, if we use setters to update the value for the ‘age’ field, we could ensure that only positive integers are accepted.
