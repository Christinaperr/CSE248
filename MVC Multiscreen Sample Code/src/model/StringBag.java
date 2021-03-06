package model;

public class StringBag {
	private String[] a;
	private int nElems;

	public StringBag(int maxSize) {
		a = new String[maxSize];
		nElems = 0;
	}

	public void insert(String s) {
		a[nElems++] = s;
	}

	public String remove() {
		return a[--nElems];
	}

	public int getnElems() {
		return nElems;
	}
}
