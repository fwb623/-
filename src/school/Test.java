package school;

public class Test {

	private static final String Name = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Student xs= new Student(); 
			 Secourse c=new Secourse(); 
			 xs.setId("0521"); 
			 xs.setName("之晴"); 
			 xs.setSex("女"); 
			 Teacher js= new Teacher(); 
			 js.setId("123123"); 
			 js.setName("老李"); 
			 js.setSex("男"); 
			 Secourse kc= new Secourse(); 
			 kc.setCoursenId("001"); 
			 kc.setCoursename("java");  
			 kc.setPlace("实验室602教室"); 
			 kc.setTime("10点"); 
			 kc.setTeacher("老李"); 
			 System.out.println("学生编号:"+xs.getId()); 
			 System.out.println("学生姓名:"+xs.getName()); 
			 System.out.println("性别:"+xs.getSex()); 
			 c.xuanke(Name); 
			 System.out.println("---------------------------------------------"); 
			 System.out.println("教师编号:"+js.getId()); 
			 System.out.println("教师姓名:"+js.getName()); 
			 System.out.println("性别:"+js.getSex()); 
			 System.out.println("课程编号:"+kc.getId()); 
			 System.out.println("课程名称:"+kc.getCoursename()); 
			 System.out.println("上课地点:"+kc.getPlace()); 
			 System.out.println("上课时间:"+kc.getTime()); 
			 System.out.println("授课老师:"+kc.getTeacher()); 
			 System.out.println("---------------------------------------------"); 
			 c.tuike(Name); 
			 } 
	}


