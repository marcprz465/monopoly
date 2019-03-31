package monopoly;

public class OtherField extends Field{
//public void()
	public OtherField(String _name)
	{
		this.name=_name;
	}
	int checkWhat()
	{
		int what=0;
		switch(this.name)
		{
		case "Stard/End":
			what=0;
			break;
		case "Community Chest":
			what=1;
			break;
		case "Income Tax":
			what=2;
			break;
		case "Chance":
			what=3;
			break;
		case "Visiting Jail":
			what=0;
			break;
		case "Free Parking":
			what=0;
			break;
		case "Jail":
			what=4;
			break;
		case "Luxury Tax":
			what=5;
			break;
		}
		return what;
	}
}
