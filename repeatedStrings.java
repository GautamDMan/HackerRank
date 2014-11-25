Enter file contents here

int repeatedStrings(String input) {
	int i = 0;
	int count = 0;
	while(input.chatAt(i) != "\n") {
		char firstChar = input.charAt(i);
		char secondChar = input.charAt(i+1);

		if(firstchar == secondChar) {
			++count;
		}
		i++;
	}
return count;
}
