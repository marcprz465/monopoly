package monopoly;

import java.util.ArrayList;

public class Board {
ArrayList<Field> fields=new ArrayList<Field>();
public Board()
{
	fields.set(0, new OtherField());
	fields.set(1, new HouseField("Mediterranean Avenue","brown",60,50));
	fields.set(2, new OtherField());
	fields.set(3, new HouseField("Baltic Ave","brown",60,50));
	fields.set(4, new OtherField());
	fields.set(5, new HouseField("Reading Railroad","black",200));
	fields.set(6, new HouseField("Oriental Avenue","light blue",100,50));
	fields.set(7, new OtherField());
	fields.set(8, new HouseField("Vermont Avenue","light blue",100,50));
	fields.set(9, new HouseField("Connecticut Avenue","light blue",120,50));
	fields.set(10, new OtherField());
	fields.set(11, new HouseField("St. Charles Place","pink",140,100));
	fields.set(12, new HouseField("Electric Company","white",150));
	fields.set(13, new HouseField("States Avenue","pink",140,100));
	fields.set(14, new HouseField("Virginia Avenue","pink",160,100));
	fields.set(15, new HouseField("Pennsylvania Railroad","black",200));
	fields.set(16, new HouseField("St. James Place","orange",180,100));
	fields.set(17, new OtherField());
	fields.set(18, new HouseField("Tennessee Avenue","orange",180,100));
	fields.set(19, new HouseField("New York Avenue","orange",200,100));
	fields.set(20, new OtherField());
	fields.set(21, new HouseField("Kentucky Avenue","red",220,150));
	fields.set(22, new OtherField());
	fields.set(23, new HouseField("Indiana Avenue","red",220,150));
	fields.set(24, new HouseField("Illinois Avenue","red",240,150));
	fields.set(25, new HouseField("B. & O. Railroad","black",200));
	fields.set(26, new HouseField("Atlantic Avenue","yellow",260,150));
	fields.set(27, new HouseField("Ventor Avenue","yellow",260,150));
	fields.set(28, new HouseField("Water Works","white",150));
	fields.set(29, new HouseField("Marvin Gardens","yellow",280,150));
	fields.set(30, new OtherField());//jail
	fields.set(31, new HouseField("Pacific Avenue","green",300,200));
	fields.set(32, new HouseField("North Carolina Avenue","green",300,200));
	fields.set(33, new OtherField());
	fields.set(34, new HouseField("Pennsylvania Avenue","green",320,200));
	fields.set(35, new HouseField("Short Line","black",200));
	fields.set(36, new OtherField());
	fields.set(37, new HouseField("Park Place","blue",350,200));
	fields.set(38, new OtherField());
	fields.set(39, new HouseField("Boardwalk","blue",400,200));
}
}
