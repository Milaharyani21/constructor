public class Petani extends Pekerjaan {
	//deklarasi variabel
	String nama;
	String tanaman;

	
	public Petani(String nama, String tanaman){
		//mendefinisikann variabel ke dalam constructor
		super (nama);
		this.tanaman = tanaman;
	}
	public Petani (String nama){
		super(nama);
	}
	public void showTanaman(){
		System.out.println(tanaman);
	}
}