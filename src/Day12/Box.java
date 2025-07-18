package Day12;

public class Box {
	int length,height,width=0;
	
	Box(){
		System.out.println("Volumeof boxis:"+length*height*width);
	}
	
	Box(int l, int h, int w ){
		length=l;
		height=h;
		width=w;
	}
	
	Box(int vol){
		vol=length*height*width;
		System.out.println(vol);
	}

	public static void main(String[] args) {
		Box b=new Box();
		
		

	}

}
