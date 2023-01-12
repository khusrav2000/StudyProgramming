import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */

import javax.lang.model.element.Element;

class Student {

  double cgpa;
  String name;
  int ID;

  Student(int ID, String name, double cgpa) {
    this.cgpa = cgpa;
    this.name = name;
    this.ID = ID;
  }

  double getCgpa() {
    return cgpa;
  }

  String getName() {
    return name;
  }

  int getID() {
    return ID;
  }
}

class StudentComparator implements Comparator<Student> {
  public int compare(Student a, Student b){
    if (a.getCgpa() < b.getCgpa())
        return 1;
    else if (a.getCgpa() > b.getCgpa()) 
        return -1;
    else if (a.getName().compareTo(b.getName()) < 0)
        return -1;
    else if (a.getName().compareTo(b.getName()) > 0) 
        return 1;
    else if (a.getID() < b.getID())
        return -1;
    else if (a.getID() > b.getID())
        return 1;
    else
        return 0;
  }
}

class Priorities {
  PriorityQueue<Student> studentsQueue = new PriorityQueue<Student>
    (10, new StudentComparator());
  List<Student> answers = new ArrayList<>();
  List<Student> getStudents(List<String> events) {
    for (String event: events) {
      String[] elements = event.split("\\s+");
      if (elements[0].equals("SERVED")){
        Student student = studentsQueue.poll();
      } else {
        String name = elements[1];
        double cgpa = Double.parseDouble(elements[2]);
        int ID = Integer.parseInt(elements[3]);
        Student student = new Student(ID, name, cgpa);
        studentsQueue.add(student);
      }
    }
    while(!studentsQueue.isEmpty()) {
      answers.add(studentsQueue.poll());
    }
    return answers;
  }
}

public class DataStructurePriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}