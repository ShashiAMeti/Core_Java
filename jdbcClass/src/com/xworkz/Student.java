package com.xworkz;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Engineering E=College.getEngineering("CivilEngg");
      E.Creators();
      Engineering C=College.getEngineering("CSEngg");
      C.Creators();
      Engineering EE=College.getEngineering("EEEngg");
      EE.Creators();
      Engineering M=College.getEngineering("MechEngg");
      M.Creators();
	}

}
