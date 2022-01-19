import java.util.Scanner;
public class UcakBiletiFiyatýHesaplama {

	public static void main(String[] args) {
		//kullanýcýdan mesafe (km), yaþý ve yolculuk tipi bilgilerini al
		Scanner input=new Scanner(System.in);
		System.out.println("Ýki þehir arasý mesafeyi giriniz.");
		double mesafe = input.nextDouble();
		System.out.println("Yaþýnýzý giriniz.");
		int yas =input.nextInt();
		System.out.println("1-Tek Yön\n2-Gidiþ Dönüþ");
		System.out.println("Yolculuk tipinizi seçiniz.");
		int yolculukTipi=input.nextInt();
		
		//mesafe baþýna ücret 0.10TL/km 
		double ucusTopFiyat = mesafe*0.1;
		
		//12 yaþýndan küçük ise ½50 indirim
		if (yas<12) {
			ucusTopFiyat= ucusTopFiyat - ucusTopFiyat/2;
		}else if ((12<yas)&&(yas<24)) {
			ucusTopFiyat=ucusTopFiyat - ucusTopFiyat/10;
		}else if (yas>65) {
			ucusTopFiyat= ucusTopFiyat -(ucusTopFiyat*3)/10;
		}else {
			System.out.println("Hatalý veri giridiniz.");
		}
		
		switch (yolculukTipi) {
		case 2: 
			ucusTopFiyat= ucusTopFiyat - (ucusTopFiyat*2)/10;
			break;
		case 1:
			break;
		default:
			System.out.println("Hatalý veri girdiniz.");
		}
		System.out.println("Bilet Fiyatý= " +ucusTopFiyat);
		

	}

}
