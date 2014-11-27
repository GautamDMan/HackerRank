Enter file contents here

int isAnaPali(String input) {

    int lCount = 0, rCount = 1;
    int finalLength = 0;
    while(lCount < input.length()) {
        rCount = lCount;

        while (rCount < input.length()) {
            if(input.charAt(rCount) == input.charAt(lCount) && lCount == rCount) {
	            StringBuilder myName = new StringBuilder(input);
	            myName.setCharAt(lCount, "");
            }
            else if(input.charAt(rCount) == input.charAt(lCount))             {
        	    StringBuilder myName = new StringBuilder(input);
	            myName.setCharAt(lCount, "");
	            myName.setCharAt(rCount, "");
            }
            ++rCount;
        }
        ++lCount;
    }

    finalLength = input.length();
    if(finalLength > 1)
    	return NO;
    else 
    	return yes;
}
