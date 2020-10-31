package school;

class Teacher extends person{ 
	 public String Teaching; 
	   public String getTeaching() { 
	 return Teaching; 
	 } 
	   public void setTeaching(String teaching) { 
	 this.Teaching = teaching; 
	 } 
	   class Student extends person{ 
		   String course; 
		     public String getCourse() { 
		   return course; 
		   } 
		     public void setCourse(String course) { 
		   this.course = course; 
		   } 
	   }
}
