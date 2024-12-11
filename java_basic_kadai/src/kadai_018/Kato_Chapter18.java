package kadai_018;

abstract public class Kato_Chapter18 {
	//フィールド
	public String familyName;
	public String givenName;
	public String address;
	
	//コンストラクタ
	public Kato_Chapter18() {
		this.familyName = "加藤";
		this.givenName = "";
		this.address = "東京都中野区〇×";
	}
	
	//メソッド
	public void commonIntroduce( String familyName, String givenName, String address) {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		}
	//抽象メソッド
	public abstract void eachIntroduce();
	
	//紹介実行メソッド
	public void execIntroduce() {
		commonIntroduce( familyName,givenName,address );
		eachIntroduce();
	}
}