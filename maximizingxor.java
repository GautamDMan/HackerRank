///Enter file contents here

static int maxXor(int l, int r) {

int lcount=0, rcount =0;
lcount = l; 
int[] xormaxarray = new int[]; // if u dont know the size it could be anything

while(lcount < r) {
	int intArrayLocation = 0;
	rcount = lcount;
	while(rcount <= r) {
		xormaxarray[intArrayLocation] = xor(lcount,rcount);
		// should also be xormaxarray[].append(xor(lcount,rcount));
		++rcount;
	}
	++lcount;
	++intArrayLocation;
}
return max(xormaxarray);
}
