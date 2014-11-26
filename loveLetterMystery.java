Enter file contents here

int getLoveLetter(String input) {

int count = 0;
int firstChar = 0;
int lastChar = (input.length() - 1);

while( firstChar < = lastChar ){

	if (input.charAt(firstChar) > input.charAt(lastChar))
		count += (int) input.charAt(firstChar) - input.charAt(lastChar);
	else if (input.charAt(firstChar) < input.charAt(lastChar))
		count += (int) input.charAt(lastChar) - input.charAt(firstChar);

	++firstChar;
	--lastChar;
	}
return count;
}
