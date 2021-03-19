package com.bvg;

public class MyDeprecatedExmp {
	/**
	 * @deprecated reason for why it was deprecated
	 */
	@Deprecated
	public void showDeprecatedMessage() {
		System.out.println("This method is marked as deprecated");
	}

	public static void main(String args[]) {

		MyDeprecatedExmp mde = new MyDeprecatedExmp();
		mde.showDeprecatedMessage();
	}
}
