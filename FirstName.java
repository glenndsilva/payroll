package format;

public class FirstName implements Name {
	private final String name;
	
	FirstName(String name){
		this.name = name;
	}
	
	@Override
	public <T> T print(Out<T> out) {
		return out.printFirstName(name);
	}
}
