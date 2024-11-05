package kadai_015;

//クラス
public class Car_Chapter15 {
	//フィールド
	private int gear = 1;
	private int speed = 10;
	
	//コンストラクタ
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
		//最初に表示したい内容
		
	}
	
	//メソッド
	//ギアの値を変更
	public void gearChange ( int afterGear ) {
		System.out.println( "ギア" + gear + "から" + afterGear + "に切り替えました" );
		this.gear = afterGear;
	}
	
	//ギアチェンジ後の速度表示
	public void run () {
		switch(this.gear) {
		case 1, 2, 3, 4, 5 -> this.speed = this.gear * 10;
		default -> this.speed = 10;
		}
		System.out.println( "速度は時速" + this.speed + "kmです" );
	}
}
