package teacher;

public class Test
 {
	public static void main(String[] args) {
		JourneyToTheWest WuKong = new JourneyToTheWest();
		WuKong.name="�����";
		WuKong.arms="�𹿰�";
		WuKong.fight=5;
		WuKong.endurance=4;
		WuKong.show();
		
		JourneyToTheWest TangSeng = new JourneyToTheWest();
		TangSeng.name="��ɮ";
		TangSeng.arms="��";
		TangSeng.fight=0;
		TangSeng.endurance=5;
		TangSeng.show();
		
		JourneyToTheWest BaJie = new JourneyToTheWest();
		BaJie.name="��˽�";
		BaJie.arms="����";
		BaJie.fight=4;
		BaJie.endurance=4;
		BaJie.show();
		
		JourneyToTheWest ShaSeng = new JourneyToTheWest();
		ShaSeng.name="ɳɮ";
		ShaSeng.arms="������";
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
		 System.out.println(name+",����:"+arms+",ս����:"+fight+"��,����:"+endurance+"��");
	 }
}