package com.info;

import java.util.List;

public interface CourseDetails {
	String getCourseId();
    String getCourseName();
    void enrollStudent(StudentDetails student);
	List<StudentDetails> getEnrolledStudents();
	

}
