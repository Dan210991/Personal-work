package task5;

public class Weapons implements Comparable<Weapons> 
{
	private String AmmoType;
	private String Name;
	private String Manufacturer;
	private int Accuracy;
	private int V_Recoil;
	private int H_Recoil;
	private int Ergonomics;
	private int RateOfFire;
	private int EffectiveRange;
	private String Firemode;
	private boolean Modifiable;
	private boolean Functional;
	
	
	public Weapons(String AmmoType, String Name, String Manufacturer, int Accuracy,
			int V_Recoil, int H_Recoil, int Ergonomics, int RateOfFire,
			int EffectiveRange, String Firemode, boolean Modifiable, boolean Functional)
	{
		this.AmmoType = AmmoType;
		this.Name = Name;
		this.Manufacturer = Manufacturer;
		this.Accuracy = Accuracy;
		this.V_Recoil = V_Recoil;
		this.H_Recoil = H_Recoil;
		this.Ergonomics = Ergonomics;
		this.RateOfFire = RateOfFire;
		this.EffectiveRange = EffectiveRange;
		this.Firemode = Firemode;
		this.Modifiable = Modifiable;
		this.Functional = Functional;
	}
	
	public String toString() 
	{
		return String.format("%-3s%-20s%10d%10b%10b", Name, Manufacturer, AmmoType, Modifiable, Functional);
	}
	
	
	//Constructor for AmmoType
	
	public String getAmmoType()
	{
		return AmmoType;
	}
	
	public void setAmmoType(String AmmoType)
	{
		this.AmmoType = AmmoType;
	}

	
	//Constructor for Name
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	
	//Constructor for Manufacturer
	
	public String getManufacturer()
	{
		return Manufacturer;
	}
	
	public void setManufacturer(String Manufacturer)
	{
		this.Manufacturer = Manufacturer;
	}
	
	
	//Constructor for Accuracy
	
	public int getAccuracy()
	{
		return Accuracy;
	}
	
	public void setAccuracy(String Accuracy)
	{
		this.Manufacturer = Accuracy;
	}
	
	
	//Constructor for Vertical Recoil
	
	public int getV_Recoil()
	{
		return V_Recoil;
	}
	
	public void setV_Recoil(int V_Recoil)
	{
		this.V_Recoil = V_Recoil;
	}
	
	
	//Constructor for Horizontal Recoil

	public int getH_Recoil()
	{
		return H_Recoil;
	}
	
	public void setH_Recoil(int H_Recoil)
	{
		this.H_Recoil = H_Recoil;
	}
	
	
	//Constructor for Ergonomics

	public int getErgonomics()
	{
		return Ergonomics;
	}
	
	public void setErgonomics(int Ergonomics)
	{
		this.Ergonomics = Ergonomics;
	}
	
	
	//Constructor for RateOfFire
	
	public int getRateOfFire()
	{
		return RateOfFire;
	}
	
	public void setRateOfFire(int RateOfFire)
	{
		this.RateOfFire = RateOfFire;
	}
	
	
	//Constructor for Effective
	
	public int getEffectiveRange()
	{
		return EffectiveRange;
	}
	
	public void setEffectiveRange(int EffectiveRange)
	{
		this.EffectiveRange = EffectiveRange;
	}
	
	
	//Constructor for Firemode
	
	public String getFiremode()
	{
		return Firemode;
	}
	
	public void setFiremode(String Firemode)
	{
		this.Firemode = Firemode;
	}
	
	
	//Constructor for Modifiable
	
	public boolean getModifiable()
	{
		return Modifiable;
	}
	
	public void setModifiable(Boolean Modifiable)
	{
		this.Modifiable = Modifiable;
	}
	
	
	//Constructor for Functional
	
	public boolean getFunctional()
	{
		return Functional;
	}
	
	public void setFunctional(Boolean Functional)
	{
		this.Functional = Functional;
	}
	
	
	
	
	
	
	
	@Override
	public int compareTo(Weapons w) {
		return ((Integer) Accuracy).compareTo(w.Accuracy);
	}

}
