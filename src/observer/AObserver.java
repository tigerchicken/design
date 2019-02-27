package observer;

public class AObserver implements Observer,Display {
	private int value;
	public Subject sb;
	public AObserver(Subject subject ) {
		this.sb=subject;
		sb.registerObserver(o);
	}
	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
