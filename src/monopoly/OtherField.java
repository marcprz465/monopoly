package monopoly;

public class OtherField extends Field{
	int type;
	String typeName;
	public OtherField(String _name, int t)
	{
		this.name=_name;
		this.type=t;
		this.price=0;
	}
	public void doAction()
	{
		switch(this.type)
		{
		case 0://start/end
			break;
		case 1://com chest
			break;
		case 2://income tax
			break;
		case 3://chance
			break;
		case 4://jail
			break;
		case 5://luxury tax
			break;
		}
	}
	@Override
	protected void buyField(Player player) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected boolean isOwned() {
		// TODO Auto-generated method stub
		return false;
	}
	public void displayInfo()
	{
		System.out.println(this.name);
		System.out.println("This field can't be bought");
	}
	@Override
	protected void buildHouse(int n) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected int payFine(Player player, Player owner2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
