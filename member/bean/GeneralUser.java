package member.bean;

public class GeneralUser extends User {

    // コンストラクタ
    public GeneralUser(String name, String email) {
        super(name, email);
    }

    // toString() メソッドのオーバーライド
    @Override
    public String toString() {
        return "一般ユーザー: 名前: " + getName() + ", メールアドレス: " + getEmail();
    }
}
