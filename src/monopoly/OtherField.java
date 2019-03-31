package monopoly;

public class OtherField extends Field{
//public void()
	int type;
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
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
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
}
