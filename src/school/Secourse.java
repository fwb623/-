package school;

class Secourse extends person{ 
	 String Name; 
	 private String courseId; 
	 private String coursename; 
	 private String place;
	 private String time; 
	 private String teacher; 
	 String [] a= {"����","Ӣ��","java"}; 
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
	 Stu.setName("֮��");  
	 Stu.getId(); 
	 if(Stu.getId()=="0521") { 
	 place="����ѧ¥"+202;time="7��50��"; 

	 System.out.println("ѧ��������"+Stu.getName());
     System.out.println("ѧ��ѡ��Ŀγ� ��"+a[1]);
     System.out.println("�Ͽεص㣺"+place+"����");
     System.out.println("�Ͽ�ʱ�䣺"+time); 
     place="ʵ����"+602;time="10��"; 
     System.out.println("ѧ��ѡ��Ŀγ� ��"+a[2]);
     System.out.println("�Ͽεص㣺"+place+"����");

     System.out.println("�Ͽ�ʱ�䣺"+time);  
    }
	 }
public void tuike(String name) {
 Student xuesheng=new Student();
 xuesheng.getName();
 xuesheng.setId("0521");
 xuesheng.setName("֮��");
 xuesheng.getId();
 if(xuesheng.getId()=="0521") {
  System.out.println("ѧ��������"+xuesheng.getName());
  System.out.println("ѧ��ѡ����˿ογ� ��"+a[0]);
  System.out.println("���Ѿ��˿��ˣ�������ѡ��");
 }
}
	 	}
