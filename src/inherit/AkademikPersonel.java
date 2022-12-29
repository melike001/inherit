package inherit;

public abstract class AkademikPersonel extends Person{
	protected String departman;

	protected AkademikPersonel(String adi, String soyadi, String email, String departman) {
		super(adi, soyadi, email);
		this.departman = departman;
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	protected String giris(){
		return "Fakülte Kapısından Giris Yaptı";
	}
	protected abstract String cikis();
}
