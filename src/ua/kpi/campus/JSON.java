package ua.kpi.campus;

public final class JSON {
	private final String original;
	
	public JSON(String str){
		this.original = str;
	}
	private int trial;
	//TODO Siryoga, make a parser plz
	
	@Override
	public String toString(){
		return original;
	}

}
