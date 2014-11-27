Enter file contents here

int isAnaPali(String input2) {

	String input = input2;
	int lCount = 0, rCount = 1;
	int finalLength = 0;
	while (lCount < input.length()) {
		rCount = input.length();
		while (rCount > lCount) {
			if (input.charAt(rCount) == input.charAt(lCount)) {
				StringBuilder myName = new StringBuilder(input);
				myName.setCharAt(lCount, "");
				myName.setCharAt(rCount, "");
			} else --rCount;
		}++lCount;
	}
	finalLength = input.length();
	if (finalLength > 0 && finalLength % 2 == 0) return NO;
	else if (finalLength > 1 && finalLength % 2 == 1) return NO;
	else return yes;
}






