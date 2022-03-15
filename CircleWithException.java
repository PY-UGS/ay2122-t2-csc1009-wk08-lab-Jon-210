public class CircleWithException {
    private double radius;
    static final double PI = 3.14159;

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
	if (radius < 0) {
		throw new IllegalArgumentException("Exception: Radius should be a positive number.");
	}else {
		this.radius = radius;
	}    
    }

    public double getRadius(){
        return radius;
    }

    public double getArea() throws Exception{
        double area =  PI * this.radius * this.radius;
	if (area > 1000) {
    		throw new Exception("Exception: Area cannot be bigger than 1000.");
    	}else {
        	return area;
        }    
    }

    public double getDiameter(){
        return 2 * this.radius;
    }
}
