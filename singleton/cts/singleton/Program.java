package cts.singleton;

public class Program {
	public static void main(String[] args) {
//		Rector rector = Rector.getInstanta("Vasile", 2, 50);
//		Rector rector2 = Rector.getInstanta("Ion", 1, 40);
//		System.out.println(rector);
//		System.out.println(rector2);
//		Decan decan=Decan.getInstanta();
//		Decan decan1=Decan.getInstanta();
//		decan1.setNume("Maria");
//		System.out.println(decan);
//		System.out.println(decan1);
//		System.out.println(decan.getNume());
//		System.out.println(decan1.getNume());

		Firma f1=Firma.getFirma("SC. STEAUA SRL.");
		Firma f2=Firma.getFirma("SC DINAMO");
		Firma f3=Firma.getFirma("SC. STEAUA SRL.");
		f1.setNumarAngajati(2);
		f2.setNumarAngajati(4);
		f3.setNumarAngajati(31);

		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

	}
	
}
