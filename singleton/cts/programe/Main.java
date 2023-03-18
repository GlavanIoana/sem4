package cts.programe;

import cts.singleton.registry.Firma;
import cts.singleton.registry.Registru;

public class Main {

	public static void main(String[] args) {
		Registru registru=new Registru();
		Registru registru2=new Registru();

		Firma f1=registru.getFirma("SC FLOAREA SRL");
		Firma f2=registru.getFirma("SC PANTENE");
		Firma f3=registru2.getFirma("SC PANTENE");
		
		f1.angajeaza();
		f2.angajeaza();
		f3.angajeaza();
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

//		Firma f4=new Firma("SC PANTENE",3);
//		System.out.println(f4.toString());

	}

}
