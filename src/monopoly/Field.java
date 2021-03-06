package monopoly;

public abstract class Field {
String name;
String color;
int price;
int houses;
boolean isHotel;
boolean owned;
int housePrice;
Player owner;
protected abstract void buyField(Player player);
protected abstract boolean isOwned();
protected abstract void displayInfo();
protected abstract void buildHouse(int n);
protected abstract int payFine(Player player, Player owner2);
}
