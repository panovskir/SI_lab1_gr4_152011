class Canvas{
  List<Point> points;

  void Canvas(){
    points=new List<Point>();
  }

  void moveAllRightUP(){
    for(int i=0;i<points.size();i++)
        points.get(i).move('R','U');
  }
  String sredina(){
    return points.get((points.size() / 2) + (points.size() % 2));
  }
  void addPoints(String id,double x, double y,String color){
    Point point=new Point(id,x,y,color);
    points.add(point);
  }
}
