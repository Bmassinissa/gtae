package data;


public class Position {
	private int x;
	private int y;

	public Position(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y =y;
	}

	
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
	

	

}
