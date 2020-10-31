# school system

### 第二次实验
 #### 范文博 2020322103 G计202
## 1.实验内容：
- 1,初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
- 2,掌握面向对象的类设计方法（属性、方法）；
- 3,掌握类的继承用法，通过构造方法实例化对象；
- 4,学会使用super()，用于实例化子类；
- 5,掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 1.实验要求：
- 1.学校有“人员”preson，分为“教师”Teacher和“学生”Student，教师教授“课程”Secourse，学生选择“课程”course。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
- 2.编写上述实体类以及测试主类（注意类之间继承关系的适用）
- 3.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。


 ## 3.实验过程：        
- 1.定义各类的成员对象

         person（id，name,sex）
         Student(id,name,sex,course)
         Teacher(id,name,sex,course)
         Secourse(courseid,coursename,place,time,teaching)
- 2,创建5个类分别是person,Student,Teacher,Secourse,test.设置person为父类剩下继承父类成员变量和方法

        class Student extends person
        class Teacher extends person
        class Secourse extends person
 - 3，在课程中加入选课和退课
 ## 4.流程图：
 https://github.com/fwb623/-/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png
 ## 5.核心代码：
 
     public String getId() { 
	            return Id;     } 
	        public void setId(String Id) { 
	            this.Id = Id;  } 
           
     class Secourse extends person{ 
	        String Name; 
	        private String courseId; 
	        private String coursename; 
	        private String place;
	        private String time; 
	        private String teacher; 
	       String [] a= {"高数","英语","java"}; }
        
    public void xuanke(String Name){ 
	       Student Stu=new Student(); 
	       Stu.getName(); 
### 6.系统运行结果
https://github.com/fwb623/-/blob/main/%E7%B3%BB%E7%BB%9F%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C.png
### 7.实验感想
 


