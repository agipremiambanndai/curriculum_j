package member.bean;

public class User {
	// ここに作成
	private String name;
	private String email;

	public User(String name, String email){
		this.name = name;
		this.email = email;
	}

	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	public String toString(){
		return "名前" + name + ",メールアドレス:" + email;
	}
	// ここまで
}
