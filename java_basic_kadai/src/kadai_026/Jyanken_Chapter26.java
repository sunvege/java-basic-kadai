package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//じゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		boolean jadge = false;
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		//判定
		while( jadge == false ) {
			input = scanner.next();
			if( input.equals("r") || input.equals("s") || input.equals("p")){
				jadge = true;	
				break;
			} else {
				System.out.println("r（グー）かs（チョキ）かp（パー）を入力してください");
			}

		}
		scanner.close();
		return input;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] output = { "r", "s", "p"};
		int randomnum  = (int) Math.floor(Math.random() * 3);
		return output[randomnum];
	}
	
	//じゃんけんを行う
	public void playGame( String me, String you ) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		System.out.println("自分の手は" + map.get(me) + ",対戦相手の手は" +  map.get(you));
		
		if( (me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r")) ){
			System.out.println("自分の勝ちです");
		} else if( (me.equals("r") && you.equals("p"))|| (me.equals("s") && you.equals("r")) || (me.equals("p") && you.equals("s")) ){
			System.out.println("自分の負けです");
		} else{
			System.out.println("あいこです");
		}
	}
}
