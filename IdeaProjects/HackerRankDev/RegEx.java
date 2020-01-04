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
