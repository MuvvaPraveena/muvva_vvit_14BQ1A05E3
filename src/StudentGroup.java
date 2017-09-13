import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) throws IllegalArgumentException{
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws IllegalArgumentException{
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{
		// Add your implementation here
		this.students = students;
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		// Add your implementation here
		return students[index];
		
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
		for(int i = students.length;i >= 1;i--)
			students[i] = students[i - 1];
		students[0] = student;
			
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{
		// Add your implementation here
		students[students.length] = student;
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		students[index] = student;
	}

	@Override
	public void remove(int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index <= students.length)
		{
			for(int j = index + 1;j < students.length - 1;j++)
				students[j - 1] = students[j];
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException{
		// Add your implementation here
		for(int i = 0; i <= students.length;i++)
		{
			if(students[i] == student)
			{
				for(int j = i + 1;j < students.length - 1;j++)
					students[j - 1] = students[j];
				break;
			}
		}
	}

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException{
		// Add your implementation here
		
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
		
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException{
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length - 1;i++)
		{
			int j = i + 1;
			if(students[i].compareTo(students[j]) > 0)
				students[i] = students[j];
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) throws IllegalArgumentException{
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException{
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) throws IllegalArgumentException{
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) throws IllegalArgumentException{
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) throws IllegalArgumentException{
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() throws IllegalArgumentException{
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) throws IllegalArgumentException{
		// Add your implementation here
		return null;
	}
}
