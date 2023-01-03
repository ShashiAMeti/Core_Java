package com.xworkz;

public class College {
   public static Engineering getEngineering(String Branch) {
	   if(Branch.equalsIgnoreCase("CivilEngg")) {
		   return new CivilEngg();
	   }
	   else if(Branch.equalsIgnoreCase("CSEngg")) {
		   return new CSEngg();
	   }else if(Branch.equalsIgnoreCase("EEEngg")) {
		   return new EEEngg();
	   }else if(Branch.equalsIgnoreCase("MechEngg")) {
		   return new MechEngg();
	   }
	return null;
   }
}
