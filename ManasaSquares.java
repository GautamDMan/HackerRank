//Enter file contents here

void ManasaStones(int s, int num1, int num2) {
	int st1 = s;
	int st2 = 0;
	int index = 0;
	int[] array = new int[20];

	while (st1 >= 0) {
		array[index] = num1 * st1 + num2 * st2;
		--st1;
		++st2;
		++index;
	}
	system.out.pinrtln(array);
}
