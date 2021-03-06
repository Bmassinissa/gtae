package data;

import java.util.ArrayList;

import dataEnum.AirportID;

public class Trajectory {
	
	private ArrayList<Position> points; 
	private int altitude;
	private AirportID source;
	private AirportID destination;
	public Trajectory(AirportID source, AirportID destination) {
		this.source = source;
		this.destination = destination;
		points=new ArrayList<>();
		calculateTrajectory();
	}
		
	public ArrayList<Position> getTrajectory(){
		return points;
	}
	public void setPoints (ArrayList<Position> points) {
		this.points = points;
	}

	public void setAltitude (int altitude) {
		this.altitude = altitude;
	}
	
	
	public int getAltitude() {
		return this.altitude;
	}
	
	public double distance(){
		Position sourcePosition =  this.source.getAirportPosition();
		Position destinationPosition = this.destination.getAirportPosition();		
		double dx = (sourcePosition.getX() - destinationPosition.getX());
		double dy = (sourcePosition.getY() - destinationPosition.getY());
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance;
		
	}
	


	public void calculateTrajectory() {
		// TODO Auto-generated method stub
		int xA, xB, yA, yB ,x, y;
		double distance=distance();
		xA = this.source.getAirportPosition().getX();
		yA = this.source.getAirportPosition().getY();		
		xB = this.destination.getAirportPosition().getX();
		yB = this.destination.getAirportPosition().getY();
		for(int i=0;i<distance;i++) {
			x=(int) (xA+(xB-xA)*(i/distance));
			y=(int) (yA+(yB-yA)*(i/distance));
			points.add(new Position(x, y));
			
		}
		
		
		
		
	}
	
	
}

