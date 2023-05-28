package la.servlet;

import java.io.Serializable;

public class Human implements Serializable {
	//フィールド
	private String name; //名前
	private String address; //住所
	private String tel; //電話
	
	//コンストラクタ
	public Human() {
		
	}
	
	public Human(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	//セッタ＆ゲッタ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
