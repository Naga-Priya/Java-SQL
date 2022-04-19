package com.training.mars;

public class Consumer {
	
	int consumerNumber;
	String name;
	int unitConsumption;
	float due;
	/**
	 * @param consumerNumber
	 * @param name
	 * @param unitConsumption
	 * @param due
	 */
	public Consumer(int consumerNumber, String name, int unitConsumption) {
		try {
			this.consumerNumber = consumerNumber;
			this.name = name;
			this.unitConsumption = unitConsumption;
			
			if(unitConsumption <50)
				throw new MinimumUnitsException();
			
			this.due = calculatedue();
		}
		catch(MinimumUnitsException e) {
			System.out.println("Exception: No of units can not be less than 50");
			//System.out.println(e.getMessage());
			this.due = (float)50.00;
		}
		
	}
	
	private float calculatedue() {
		if(this.unitConsumption<=200) return (float)50.0;
		//Up to 200 units every consumer must pay flat an amount $50. 
		//
		else if (this.unitConsumption<=500) return (float)(this.unitConsumption*1.25);
		//From 201 to 500 units rate is $1.25/unit. 
		//
		else if (this.unitConsumption<=1000) return (float)(this.unitConsumption*1.00);
		//From 501 to 1000 units’ rate is $1.00/unit. 
		//
		else return (float)(this.unitConsumption*0.75);
		//From 1001 units and above rate is $0.75/unit. 
		
		
	}
	
	@Override
	public String toString() {
		
		String strDouble = String.format("%.2f", this.due); 
		//System.out.println(strDouble); // print 2.00

		
			
		return "["+this.consumerNumber+",\t"+
					this.name+","+
					this.unitConsumption+","+
					strDouble+"]";
		
	}
	
	

}
