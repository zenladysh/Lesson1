public class Beam{
	public static void main (String args[]){
		float lenght = 5.4f; //длина в метрах
		int width = 30; //ширина в сантиметрах
		int height = 45; // высота в сантиметрах
		String material = "concrete"; //материал: бетон
		float volume = lenght*width/100*height/100; // объем в м3
		float mass = volume*24; // масса в кН
		float loadMax = 50.3f; //максимальная нагрузка на балку в кН/м
	System.out.println("Beam: "+"Lenght = "+lenght+" m; "+"Width = "+width+" cm; "+"Height = "+height+" cm; "+"Material - "+material+"; Volume = "+volume+" m3; "+"Mass = "+mass+" kN; "+"Max Load = "+loadMax+" kN/m");
    }
}