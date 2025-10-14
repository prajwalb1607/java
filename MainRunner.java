class MainRunner{
public static void main(String [] args){
		
	    SportsEquipment s = new SportsEquipment();
        System.out.println("\nType: " + s.type);
        System.out.println("Quantity: " + s.quantity);
        System.out.println("Size: " + s.size);
        System.out.println("Price: ₹" + s.price);
		
		Truck t = new Truck();
        System.out.println("\nBrand: " + t.brand);
        System.out.println("Capacity: " + t.capacity + " tons");
        System.out.println("Model Code: " + t.modelCode);
        System.out.println("Price: ₹" + t.price);
		
		Television tv = new Television();
        System.out.println("\nBrand: " + tv.brand);
        System.out.println("Screen Size: " + tv.screenSize + " inches");
        System.out.println("Type: " + tv.type);
        System.out.println("Price: ₹" + tv.price);
		
		Scooter s1 = new Scooter();
        System.out.println("\nBrand: " + s1.brand);
        System.out.println("Engine CC: " + s1.engineCC);
        System.out.println("Model Grade: " + s1.modelGrade);
        System.out.println("Mileage: " + s1.mileage + " km/l");
		
		Teacher t1 = new Teacher();
        System.out.println("\nName: " + t1.name);
        System.out.println("ID: " + t1.id);
        System.out.println("Grade: " + t1.grade);
        System.out.println("Salary: ₹" + t1.salary);
    }

	}
