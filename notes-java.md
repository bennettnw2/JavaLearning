Module 3 from edx Java course from Microsoft

Data flow; seems I'll learn here how to modularize and better structure my doce.

* how does one pass information into a method using parameter
  * what does this do to make my code better?
  * what are some side effects and precautions to be aware of?

* how does one get information out of a method using returns?
  * how and why is this useful
  * what are some side effects and precautions to be aware of?

* What are some built in methods I can use now?

* How do you build a recursive algorithms?
  * WTF is a recursive algorithm?
  * What does a recursive algorithm do?
  * How is a recursive algorithm useful?


* ##### Parameters
  * things you can abstract away from your program that you can plug said thing into a method 
  * said another way, a parameter is just a variable that is declared in your method.
    * the value of the parameter is set when the method is called
      * for example; if you had a method that took an integer
      ```
      public static void main cookieMix(int cupsOfSugar) {
          System.out.println( "Add " + cupsOfSugar + " cups of sugar" );
      }
      * you can call that method with cookieMix(4) or cookinMix(2)
      * the output would be:
        > Add 4 cups of sugar
        > Add 2 cups of sugar

  * Be sure to let your method you create know what type of parameters to expect
    * you do this by giving the data type and the name (hook) to use within the context of the method
    * parameters function just like variables
    * scope of the parameter exists only within the method
    * you can multiple variables of any type

  * Be sure to add the values for your method in the order that you declared in your method header
    * also know that you are simply passing a value into the method when you call it
    * we are passing a variable nor the type; just a value
    * therefore; modifying the parameter within the method will not affect the original variable

* ##### Returns
  * Parameters have a flaw in that once the method instance is done, you have nothing to show for it
  * the scope of everything done in a method; stays in the method
    * eg: if you pass a variable as a parameter into a method and the method multiplies the variable, the variable outsie the method does not change
    * the reason is you are only passing a value to the method and not really a variable
      * a variable is the location that happens to store a value
  * so how do we get information out of a method?  The answer is with a return.
  * a return is a specific way to send information out of a method
  * a return is the opposite of a parameter that sends information in
  * a return will send back one specific piece of information
  * there are three pieces needed within a parameter to set it up to also do a return
    * first you need to change the method header to show a data type instead of "void"
      * a "void" means it does not return anything, a data type means it can
      * you can only ever return one thing so you will only have one data type to return
      * eg: `public static int methodName(int parameter) {`
    * second you need the word "return" in the end of your method
      * make sure that the data type in the return, matches the data type in your header
      * also, if java sees return, it will short circut the method and stop running
        * so don't have any code after the return statement
    * third, we need to make sure that we are capturing what we are returning from a method
      * this is typically done by calling the method and assigning the return value to a variable outside of the scope of the method
        * eg: `variableName = methodName(parameter);`
  * Some typical errors are:
    * not having a return statement when you want to
    * forgetting step one of replacing void in the header "unexpected return"
    * not capturing the return
    
* Returns and Methods and Parameters really help you to break bigger problems into smaller problems and then build your solutions from there
  * this is the fundamental thinking in computational problem solving / thinking like a computer

* Manipulating strings:
  * here are some useful methods that belong to the String class
  * `.lentgh()` will give us the length of a string
  * `.charAt()` will give us the individual char in the index of a string
  * `.indexOf()` will give us the index of a char in a string
    * if it does not exist, we will get a -1


  * `toUpperCase`
    * will make everything upper case


* ##### Recursion
  * Is a type of algorithim that is made up of smaller versions of itself.
    * meaning: you take a big problem and break it up into small pieces and then put those pieces back together
    * you can also think of it as solving a big problem by solving smaller versions of the same problem
    * in programming, it is methods that call themself to solve problems


* Peano Arithmetic
  * if the first number is zero then the answer is the second number
  * otherwise, it is the increment of the sum, of the decrement of the first number and the second
    * add together the decrement of the first number to the second number
    * and then increment the whole thing
