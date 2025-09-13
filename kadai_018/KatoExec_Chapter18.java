package kadai_018;

public class KatoExec_Chapter18 {
	
	public static void main(String[] args) {
		
		String familyName = "加藤";
        String address = "東京都中野区〇×";
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(familyName, address);
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(familyName, address);
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(familyName, address);
		
		taro.execIntroduce();
        ichiro.execIntroduce();
        hanako.execIntroduce();

	}
}
