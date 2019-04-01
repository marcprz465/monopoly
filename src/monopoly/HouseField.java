package monopoly;

public class HouseField extends Field{
public HouseField(String _name, String _color, int _price, int houP)
{
	this.name=_name;
	this.color=_color;
	this.price=_price;
	this.houses=0;
	this.isHotel=false;
	this.housePrice=houP;
	this.owned=false;
}
public HouseField(String _name, String _color, int _price)
{
	this.name=_name;
	this.color=_color;
	this.price=_price;
}

public boolean isOwned()
{
	return this.owned;
}
public void buyField(Player pl)
{
	this.owner=pl;
	this.owned=true;
	pl.cash-=this.price;
}
public void buildHouse(int n, Player pl)
{
	if(pl.cash>=this.housePrice)
	{
	this.houses+=n;
	pl.cash-=this.housePrice;}
	else
	{
		System.err.println("Not enough money.");
	}
}
public void buildHotel(Player pl)
{
	if(pl.cash>=this.housePrice)
	{
		if(this.houses==4)
		{
	this.isHotel=true;
	pl.cash-=this.housePrice;
		}
		else
		{
			System.err.println("Buy 4 houses at first.");
		}
	}
	else
	{
		System.err.println("Not enough money.");
	}
}
public void sellHouse()
{
	this.houses--;
}
public void sellHotel()
{
	this.isHotel=false;
}
public void displayInfo()
{
	/*this.name=_name;
	this.color=_color;
	this.price=_price;
	this.houses=0;
	this.isHotel=false;
	this.housePrice=houP;
	this.owned=false;*/
	System.out.println(this.name);
	System.out.println(this.color);
	if(this.owned)
	{
		System.out.println("Owner: "+this.owner.name);
		if(!isHotel)
		System.out.println("Houses: "+this.houses);
		else
			System.out.println("Hotel: "+isHotel);
		System.out.println(this.housePrice);
	}
	else
	{
		System.out.println("No owner.");
		System.out.println("Price: "+this.price);
	}
	System.out.println(this.housePrice);
}
@Override
protected void buildHouse(int n) {
	// TODO Auto-generated method stub
	
}
}
