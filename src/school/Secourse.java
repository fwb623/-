package school;

class Secourse extends person{ 
	 String Name; 
	 private String courseId; 
	 private String coursename; 
	 private String place;
	 private String time; 
	 private String teacher; 
	 String [] a= {"高数","英语","java"}; 
	 public String getId() { 
	 return courseId; 
	 } 
	 public void setCoursenId(String courseId) { 
	 this.courseId = courseId; 
	 } 
	 public String getCoursename() { 
	 return coursename; 
	 } 
	 public void setCoursename(String coursename) { 
	 this.coursename = coursename; 
	 } 
	 public String getPlace() { 
	 return place; 
	 } 
	 public void setPlace(String place) { 
	 this.place = place; 
	 } 
	 public String getTime() { 
	 return time; 
	 } 
	 public void setTime(String time) { 
	 this.time = time; 
	 } 
	 public String getTeacher() { 
	 return teacher; 
	 } 
	 public void setTeacher(String teacher) { 
	 this.teacher = teacher; 
	 }

	 public void xuanke(String Name){ 
	 Student Stu=new Student(); 
	 Stu.getName(); 
	 Stu.setId("0521"); 
	 Stu.setName("之晴");  
	 Stu.getId(); 
	 if(Stu.getId()=="0521") { 
	 place="主教学楼"+202;time="7点50分"; 

	 System.out.println("学生姓名："+Stu.getName());
     System.out.println("学生选择的课程 ："+a[1]);
     System.out.println("上课地点："+place+"教室");
     System.out.println("上课时间："+time); 
     place="实验室"+602;time="10点"; 
     System.out.println("学生选择的课程 ："+a[2]);
     System.out.println("上课地点："+place+"教室");

     System.out.println("上课时间："+time);  
    }
	 }
public void tuike(String name) {
 Student xuesheng=new Student();
 xuesheng.getName();
 xuesheng.setId("0521");
 xuesheng.setName("之晴");
 xuesheng.getId();
 if(xuesheng.getId()=="0521") {
  System.out.println("学生姓名："+xuesheng.getName());
  System.out.println("学生选择的退课课程 ："+a[0]);
  System.out.println("你已经退课了，请重新选课");
 }
}
	 	}
