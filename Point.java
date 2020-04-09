class Point {
	String id
	double x,y;

	String color;
	//TODO add new variable

	//TODO constructor
	public Point(String id , double x,double y,String color){
		this.id=id;
		this.x=x;
		this.y=y;
		this.color=color;
	}
	//TODO setters and getters
	public String getId(){
		return id;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String getColor(){
		return color;
	}
	public void setID(String id){
		this.id=id;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public void setColor(String color){
		this.color=color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection.equals('L'))
		x--;
		else if(xDirection.equals('R'))
		x++;

		if(yDirection.equals('U'))
		y++;
		else if(yDirection.equals('D'))
		y--;
	}



	public void draw () {
		//TODO
		System.out.print("("+x+" , "+y+")");
	}



}
