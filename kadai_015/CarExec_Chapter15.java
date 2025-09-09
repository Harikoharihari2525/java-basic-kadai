package kadai_015;

public class CarExec_Chapter15 {
	
	private int gear  = 6;
	private int speed = 11;
	
	
	public CarExec_Chapter15( int gear, int speed ) {
		this.gear  = gear;
		this.speed = speed;
	
		System.out.println( "ギア" + gear + "から" + gear + "に切り替えました" );
		System.out.println( "速度は時速" + this.speed + "kmです" );
	}
	
	

}
