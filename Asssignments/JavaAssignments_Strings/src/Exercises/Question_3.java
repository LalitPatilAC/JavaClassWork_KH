package Exercises;

//Question_3:
//3. Write a Java program to check whether a given string ends with the contents of another string.  
//Sample Output:
//"Python Exercises" ends with "se"? false                                                                      
//"Python Exercise" ends with "se"? true

public class Question_3 {

	public static void main(String[] args) {
		
		String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String suffix = "se";
        
        boolean result1 = str1.endsWith(suffix);
        boolean result2 = str2.endsWith(suffix);
        
        System.out.println("\"" + str1 + "\" ends with \"" + suffix + "\"? " + result1);
        System.out.println("\"" + str2 + "\" ends with \"" + suffix + "\"? " + result2);

	}

}
