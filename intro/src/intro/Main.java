package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		//Java'da değişken adları camelCase formatında yazılır.
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if(dolarBugun<dolarDun) {
			
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//Diziler
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan Alanlara","Mutlu Emekli"};
		
		//Diziyi ekrana yazdırmanın ilkel yolu
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		//Diziyi döngü kullanarak ekrana yazdırmak
		for(int i = 0;i<krediler.length;i++) {
			
			System.out.println(krediler[i]);
		} /*dizinin uzunluğu kadar döngüye giriyor örneğin şuan krediler dizisinde 3 adet veri var
		   *bu yüzden döngüye 3 kez girecek.Eğer 10 verimiz olsaydı 10 kez girecekti.Her döngü girişinde o anki indexi diziye
		   *parametre olarak veriyoruz ve o indexdeki elemanı ekrana yazdırıyor.*/
		
		
		
	}

}
