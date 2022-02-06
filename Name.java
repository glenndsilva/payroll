package format;

	interface Name {
			<T> T print (Out <T> out);
	
	 interface Out<T>{
			T printFirstName(String firstname);
			T printFull(String firstname, String last);
			T printLast(String last);
	 }
}
