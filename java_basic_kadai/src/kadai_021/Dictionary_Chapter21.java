package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void search(String[] name) {
		HashMap<String,String> word = new HashMap<>();
		word.put("apple","りんご");
		word.put("peach","桃");
		word.put("banana","バナナ");
		word.put("lemon","レモン");
		word.put("pear","梨");
		word.put("kiwi","キウイ");
		word.put("strawberry","いちご");
		word.put("grape","ぶどう");
		word.put("muscat","マスカット");
		word.put("cherry","さくらんぼ");
		
		for( int i = 0; i < name.length; i++) {
			if ( word.get(name[i]) == null) {
				System.out.println( name[i] + "は辞書に存在しません");
			} else {
				System.out.println( name[i]  + "の意味は" + word.get(name[i]));
			}
		}
	}
}
