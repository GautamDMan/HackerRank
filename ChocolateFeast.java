//Enter file contents here

int ChocolateFeast(int n, int c, int m) {

	int chocolate = wrapper = 0;
	do {
		chocolate = n / c;
		wrapper = n / c + n % c;

		if (wrapper >= m) n = wrapper;
	} while (wrapper >= m)

	return chocolate;
}
