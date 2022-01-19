import java.util.Scanner;
public class UcakBiletiFiyat�Hesaplama {

	public static void main(String[] args) {
		//kullan�c�dan mesafe (km), ya�� ve yolculuk tipi bilgilerini al
		Scanner input=new Scanner(System.in);
		System.out.println("�ki �ehir aras� mesafeyi giriniz.");
		double mesafe = input.nextDouble();
		System.out.println("Ya��n�z� giriniz.");
		int yas =input.nextInt();
		System.out.println("1-Tek Y�n\n2-Gidi� D�n��");
		System.out.println("Yolculuk tipinizi se�iniz.");
		int yolculukTipi=input.nextInt();
		
		//mesafe ba��na �cret 0.10TL/km 
		double ucusTopFiyat = mesafe*0.1;
		
		//12 ya��ndan k���k ise �50 indirim
		if (yas<12) {
			ucusTopFiyat= ucusTopFiyat - ucusTopFiyat/2;
		}else if ((12<yas)&&(yas<24)) {
			ucusTopFiyat=ucusTopFiyat - ucusTopFiyat/10;
		}else if (yas>65) {
			ucusTopFiyat= ucusTopFiyat -(ucusTopFiyat*3)/10;
		}else {
			System.out.println("Hatal� veri giridiniz.");
		}
		
		switch (yolculukTipi) {
		case 2: 
			ucusTopFiyat= ucusTopFiyat - (ucusTopFiyat*2)/10;
			break;
		case 1:
			break;
		default:
			System.out.println("Hatal� veri girdiniz.");
		}
		System.out.println("Bilet Fiyat�= " +ucusTopFiyat);
		

	}

}
