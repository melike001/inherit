package inherit;

public class Student extends Person{
	protected int ogrID;

	protected Student(String adi, String soyadi, String email, int ogrID) {
		super(adi, soyadi, email);
		this.ogrID = ogrID;
	}

	protected int getOgrID() {
		return ogrID;
	}

	protected void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}
	protected String giris(){
		return super.giris();
	}
	

}
