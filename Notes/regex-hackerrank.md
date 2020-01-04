# Working on Hackerrank Java Regular Expressions Today and This is What I Learned

### How do I get the regular expression functions to work in Java?
Java regular expression classes are in the `java.util.regex` package. You will want to import the package with an `import java.util.regex.*;` statement at the beginning of your code.
You could also import just the package classes that you want.  Namely `Pattern` and `Matcher`.
  * `import java.util.regex.Pattern;`  and `import java.util.regex.Matcher;`

Speaking of classes in this package, there are two, I think. These are `Pattern` and `Matcher`.  There is also an exception summary called, `PatternSysntaxException` and an interface summary called `MatchedResult`.  I figure the [`PatternSyntaxException`](https://docs.oracle.com/javase/7/docs/api/java/util/regex/PatternSyntaxException.html) is used for throwing exceptions to indicate a syntax error in a regular expression pattern.  I am not sure how the interface summary, [`MatchResult`](https://docs.oracle.com/javase/7/docs/api/java/util/regex/MatchResult.html) works just yet.  I got this information from [Oracle's Java documentation on regular expressions](https://docs.oracle.com/javase/7/docs/api/index.html?java/util/regex/package-summary.html) and the website [JournalDev.](https://www.journaldev.com/634/regular-expression-in-java-regex-example)

##### Back to the Class Summaries:
  * `Pattern` - this is an object of the compiled version of the regular expression.
    * TLDR: This is where you put your regex statement.
  * `Matcher` - this is the Java regular expression engine object.  It matches the input string with the regex pattern object.
    * TLDR: This is what compares the regex pattern to a string that is passed into it.

From what I gather, since these two classes do not have a public constructor (not sure what that means but, that's fine for now), we can create an object by using a public static method called `compile()` and `matcher()` respectively.  Let's go to an example to make this a bit more concrete.
```java
import  java.util.regex.Pattern;
import  java.util.regex.Matcher;

public class RegEx {
    public static void main(String [] args) {
        
        Pattern myPattern = Pattern.compile("^S.*");
        Matcher matchEngine = myPattern.matcher("Samantha");
        boolean result = matchEngine.matches();
        System.out.println(result);  // <= outputs "true"
    }
} 

```
##### My understanding of what is going on as I know it
`Pattern myPattern = Pattern.compile("^S.*");`
  * An object, `myPattern` is created with the type `Pattern`
  * Assigned to that object is the regex pattern (passed as a string), "^S.\*"
    * The magic of regular expression is created by the `compile()` method

`Matcher matchEngine = myPattern.matcher("Samantha");`
  * An object, `matchEngine` is created with the type `Matcher`
  * Assigned to that object is the regex pattern, `myPattern` and the method, `matcher()` is run on the Pattern object with the string "Samantha" passed into the Matcher regular expression engine.

`boolean result = matchEngine.matches();`
  * We did not discuss this before but the new element here is the method, `matches()`
  * I got tripped up a few times between the differences between the method, ***`matcher()`*** and the method ***`matches()`***.  They are two different methods.
  * My understanding is that `matches()` is what will return the boolean value.

##### Alternate ways to write and use regular expressions in Java
I am sure that different situations require different uses of regular expressions.  I came across these examples in my studies and would like to document them here in case I need them later.
```java
String userName = "Samantha";
boolean result = userName.matches("^S.*");
System.out.println(result);  // <= outputs "true"
```

```java
boolean result = Pattern.matches("^S.*", "Samantha");
System.out.println(result);  // <= outputs "true"
```

This one is interesting because you do not need to call the `java.util.regex.*` package.  I think because the `matches()` function is part of the String class?.  Just my best guess.  I'll check it out later.
```java
public class RegEx {
  
    public static void main(String [] args) {
        String userName = "Samantha";
        boolean result = userName.matches(UsernameValidator.regularExpression);
        System.out.println(result);  // <= outputs "true"
    }

    class UsernameValidator {
        public static final String regularExpression = "^S.*";
    }
} 

```
Lastly, I would like to leave this bit of code for future reference if I want to go through a list of inputs and check them against a pattern.
```java
import java.util.Scanner;
class UsernameValidator {
    // I assume this is creating a public variable that is able to accessed by the main method below.
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
```
