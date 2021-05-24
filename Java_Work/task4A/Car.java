package task4A;

public class Car {
	public String Manufacturer;
	public String Model;
	public String Type;
	public double DoorCount;
	public double EngineSize;
	public Boolean Taxed;
	
	public Car()
	{
		
	}
	
	public Car(String Manufacturer, String Model, String Type, double DoorCount, double EngineSize, boolean Taxed) 
	{
		this.Manufacturer = Manufacturer;
		this.Model = Model;
		this.Type = Type;
		this.DoorCount = DoorCount;
		this.EngineSize = EngineSize;
		this.Taxed = Taxed;
	}
	
	
	public void setManufacturer(String Manufacturer)
	{
		this.Manufacturer = Manufacturer;
	}
	
	public String getManufacturer()
	{
		return Manufacturer;
	}
	
	private void setModel(String Model)
	{
		this.Model = Model;
	}
	
	private String getModel()
	{
		return Model;
	}
	
	public void setType(String Type)
	{
		this.Type = Type;
	}
	
	public String getType ()
	{
		return Type;
	}
	
	public void setDoorCount (double DoorCount)
	{
		this.DoorCount = DoorCount;
	}
	
	public double getDoorCount ()
	{
		return DoorCount;
	}
	
	public void setEngineSize (double EngineSize)
	{
		this.EngineSize = EngineSize;
	}
	
	public double getEngineSize ()
	{
		return EngineSize;
	}
	
	public void setTaxed (Boolean Taxed)
	{
		this.Taxed = Taxed;
	}
	
	public boolean getTaxed ()
	{
		return Taxed;
	}
	
	public String toString() 
	{
	    return String.format("(Manufacturer:%s, Model:%s, Type:%s, DoorCount:%f, EngineSize:%f, Taxed:%b)", Manufacturer, Model, Type, DoorCount, EngineSize, Taxed);
	}
}
	

