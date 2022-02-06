package format;

public class FormattedOut implements Name.Out<String> {
	@Override
	public String printFirstName(String firstname) {
		return firstname;
	}

	@Override
	public String printFull(String firstname, String last) {
		return firstname +" "+ last;
	}

	@Override
	public String printLast(String last) {
		return last;
	}
	
	public static void main(String args[]) {
		String xml = new FirstName("glenn").print(new FormattedOut());
		System.out.println(xml);
	}
}
