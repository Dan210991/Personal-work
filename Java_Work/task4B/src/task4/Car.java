package task4;

public class Car 
{
	public String Manufacturer;
	public String Model;
	public String Type;
	public double DoorCount;
	public double EngineSize;
	public Boolean Taxed;
	
	
	public Car(String Manufacturer, String Model, String Type, double DoorCount, double EngineSize, boolean Taxed) {
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
	
	public void setModel(String Model)
	{
		this.Model = Model;
	}
	
	public String getModel()
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
	
}
