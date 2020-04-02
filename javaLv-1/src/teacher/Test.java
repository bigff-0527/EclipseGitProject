package teacher;

public class Test
 {
	public static void main(String[] args) {
		JourneyToTheWest WuKong = new JourneyToTheWest();
		WuKong.name="ËïÎò¿Õ";
		WuKong.arms="½ð¹¿°ô";
		WuKong.fight=5;
		WuKong.endurance=4;
		WuKong.show();
		
		JourneyToTheWest TangSeng = new JourneyToTheWest();
		TangSeng.name="ÌÆÉ®";
		TangSeng.arms="ÎÞ";
		TangSeng.fight=0;
		TangSeng.endurance=5;
		TangSeng.show();
		
		JourneyToTheWest BaJie = new JourneyToTheWest();
		BaJie.name="Öí°Ë½ä";
		BaJie.arms="°Ò×Ó";
		BaJie.fight=4;
		BaJie.endurance=4;
		BaJie.show();
		
		JourneyToTheWest ShaSeng = new JourneyToTheWest();
		ShaSeng.name="É³É®";
		ShaSeng.arms="ÔÂÑÀ²ù";
		ShaSeng.fight=3;
		ShaSeng.endurance=4;
		ShaSeng.show();
	}
	
}
class JourneyToTheWest{
	 String name;
	 String arms;
	 int fight;
	 int endurance;
	 
	 public void show() {
		 System.out.println(name+",ÎäÆ÷:"+arms+",Õ½¶·Á¦:"+fight+"ÐÇ,ÄÍÁ¦:"+endurance+"ÐÇ");
	 }
}