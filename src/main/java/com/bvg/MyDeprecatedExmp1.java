package com.bvg;

public class MyDeprecatedExmp1 {
	@Deprecated
    public void showDeprecatedMessage(){
        System.out.println("This method is marked as deprecated");
	}
	@SuppressWarnings("deprecation")  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDeprecatedExmp mde = new MyDeprecatedExmp();
        mde.showDeprecatedMessage();


	}

}
