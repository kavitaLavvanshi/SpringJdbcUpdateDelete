package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Student;
import com.spring.jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started" );
        //spring jdbc=> jdbctemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao dao=context.getBean("studentDao",StudentDao.class);
        //insert data
//        Student s=new Student();
//        s.setId(205);
//        s.setName("shanu");
//        s.setAddress("dewas");
//        s.setCity("riwa");
//         int result=dao.insert(s);
//         System.out.println("Student added "+ result);    
//         }
//update data        
//      Student student= new Student();
//      student.setId(200);
//      student.setName("manika");
//      student.setCity("mandsour");
//      student.setAddress("satna");
//      int result=dao.change(student);
//      System.out.println("Student updated "+result);
//    }
//delete data
//        Student student = new Student();
//        int result= dao.delete(203);
//        System.out.println(" deleted " +result);
        
//        Student student = dao.getStudent(201);
//        System.out.println(student);
        
  //multiple data      
         List<Student>students   =dao.getAllStudents();
         for (Student s : students) {
			
        	 System.out.println(s);
		}
}
}