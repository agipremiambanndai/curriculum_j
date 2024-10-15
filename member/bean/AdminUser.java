package member.bean;

public class AdminUser extends User {
    private String adminCode; // 管理者コード

    // コンストラクタ
    public AdminUser(String name, String email, String adminCode) {
        super(name, email);
        this.adminCode = adminCode;
    }

    // 管理者コードのgetter
    public String getAdminCode() {
        return adminCode;
    }

    // toString() メソッドのオーバーライド
    @Override
    public String toString() {
        return "管理者ユーザー: 名前: " + getName() + ", メールアドレス: " + getEmail() + ", 管理者コード: " + adminCode;
    }
    
}
