package school;

public class Test {

	private static final String Name = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Student xs= new Student(); 
			 Secourse c=new Secourse(); 
			 xs.setId("0521"); 
			 xs.setName("֮��"); 
			 xs.setSex("Ů"); 
			 Teacher js= new Teacher(); 
			 js.setId("123123"); 
			 js.setName("����"); 
			 js.setSex("��"); 
			 Secourse kc= new Secourse(); 
			 kc.setCoursenId("001"); 
			 kc.setCoursename("java");  
			 kc.setPlace("ʵ����602����"); 
			 kc.setTime("10��"); 
			 kc.setTeacher("����"); 
			 System.out.println("ѧ�����:"+xs.getId()); 
			 System.out.println("ѧ������:"+xs.getName()); 
			 System.out.println("�Ա�:"+xs.getSex()); 
			 c.xuanke(Name); 
			 System.out.println("---------------------------------------------"); 
			 System.out.println("��ʦ���:"+js.getId()); 
			 System.out.println("��ʦ����:"+js.getName()); 
			 System.out.println("�Ա�:"+js.getSex()); 
			 System.out.println("�γ̱��:"+kc.getId()); 
			 System.out.println("�γ�����:"+kc.getCoursename()); 
			 System.out.println("�Ͽεص�:"+kc.getPlace()); 
			 System.out.println("�Ͽ�ʱ��:"+kc.getTime()); 
			 System.out.println("�ڿ���ʦ:"+kc.getTeacher()); 
			 System.out.println("---------------------------------------------"); 
			 c.tuike(Name); 
			 } 
	}


