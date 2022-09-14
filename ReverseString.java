class ReverseString {
//   First Learning Method
    String reverse1(String inputString) {
        // Step 1. Create an empty string that will host the new created string
        String newString = "";
        //Step 2. Convert the reversing array into character array
        char charArray[]= inputString.toCharArray();  
        // Step 3. Create the FOR loop
        /* The starting point of the loop will be (charArray.length - 1) which                corresponds to the last character of the string, "o"As long as i is                  greater than or equals 0, the loop will go on We decrement i after                   each iteration */
        
        for (int i = charArray.length - 1; i >= 0; i--){
            newString += charArray[i]; 
            // or newString = newString + inputString[i];
        }
        
        /* let inputString = "hello"
        => Here hello length = 5
        => For Each Iteration: i = inputString.length - 1 
                                            and newString += inputString[i]; 
 
        Initially , i = 5 and newString = ""
 
        => First Iteration:   i-- = 5 - 1 = 4    newString = "" + "o" = "o"
        => Second Iteration:  i-- = 4 - 1 = 3  newString = "o" + "l" = "ol"
        => Third Iteration:   i-- = 3 - 1 = 2  newString = "ol" + "l" = "oll"
        => Fourth Iteration:  i-- = 2 - 1 = 1  newString = "oll" + "e" = "olle"
        => Fifth Iteration:   i-- = 1 - 1 = 0  newString = "olle" + "h" = "olleh"
 
        End of for loop
        */
        // Step 3. Return the reversed string
        return newString; // "olleh"
        
    }
}

// Second Method
    String reverse(String inputString) {
            String outString = "";
            for(char c : inputString.toCharArray()) {
                outString = c + outString;
            }
            return outString;
        }


// Third Method
      String reverse3(String inputString) {
              return new StringBuilder(inputString).reverse().toString();
          }

public static void main(String[] args){
  
  ReverseString string = new ReverseString();
  
  string.reverse1("Hello World"); // dlroW olleH
  string.reverse2("Hello World"); // dlroW olleH
  string.reverse3("Hello World"); // dlroW olleH
  
}

