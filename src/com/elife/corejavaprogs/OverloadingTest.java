package com.elife.corejavaprogs;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OldType ot = new OldType();
		NewType nt = new NewType();
		ot=nt;
		ot= (OldType)nt;
		
		nt = (NewType)ot;
		nt = (NewType)ot;
		class OldType {
			
		}
		class NewType extends OldType{
		
		}
		
		
		
	}
	

}
