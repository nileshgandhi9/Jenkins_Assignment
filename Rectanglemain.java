class Rectangle{
	int length, width;

	void SetValue(int length, int width){
	this.length = length;
	this.width = width;
}
	void area(){
		System.out.println("Area of rec " + this.length * this.width);
	}
	void perimeter(){
		System.out.println("Perimeter of rec " + 2*(this.length* this.width));
	}
}

class Rectanglemain{
	
	public static void main(String args[]){
		Rectangle r = new Rectangle();
			
			r.SetValue(10,9);
			r.area();
			r.perimeter();
	}
}

