public class Ab {
    
    public static void main(String[] args) {
    
        String str1 = "Hello";
        String str2 = "World";

        String concatenatedStr = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedStr);

        int length = str1.length();
        System.out.println("Length of the String: " + length);

        String upperCaseStr = concatenatedStr.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseStr);

        String subStr = "World";
        boolean contains = concatenatedStr.contains(subStr);
        System.out.println("Contains '" + subStr + "': " + contains);
        
        String replacedStr = concatenatedStr.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
    }
}
