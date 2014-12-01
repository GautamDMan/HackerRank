Enter file contents here

return shtuff gstACMICPCResult(byte[]) {

	byte[] ans1, ans;
	for (int i = 0; i < n - 1; i++) {
		for (int j = 0; j < n; j++) {
			ans1 = xor(a[i], a[j]);
			if (ans1 > ans) ans = ans1;
			if (ans == ans1)++count;
		}
	}
	return ans, count;
}
