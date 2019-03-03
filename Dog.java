class Dog extends Animal{
	Dog(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	
	public String toString(){
		return name + ", " + legs;
	}
}		
