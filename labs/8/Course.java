import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList students;
	
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList();
	}
	
	public void addStudent(String student) {
		students.add(student);
	}

	public String getCourseName() {
		return courseName;
	}

	public ArrayList getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void dropStudent(String student) {
		students.remove(students);
	}
	
	public String toString() {
		String s = "";
		s = courseName + "(" + students.size() + " students) \n";
		for (int i = 0; i < students.size(); i++) {
			s += "(" + (i + 1) + ")" + students.get(i) + "\n";
		}
		return s;
	}
	
	public void clear() {
		students.clear();
	}

}
