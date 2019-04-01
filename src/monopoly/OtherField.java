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
//	public String checkType()
//	{
//		String temp;
//		switch(this.type)
//		{
//		case 0:
//			break;
//		case 1:
//			break;
//		case 2:
//			break;
//		case 3:
//			break;
//		case 4:
//			break;
//		case 5:
//			break;
//		}
//		return temp;
//	}
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
}
