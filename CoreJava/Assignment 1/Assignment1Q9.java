
class Student {
    private int subjectA,subjectB,subjectC;

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int size = students.length;
        int total=0;
        for(int i=0;i<size;++i)
        {
            total += (students[i].subjectA + students[i].subjectB + students[i].subjectC);
        }
        return total;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int total = studentsTotalMarksInAllSubjects(students);
        return total / (students.length * 3);
    }

    public int[] subjectWiseMarks(Student[] students,String subjectName){
        int[] ans = new int[students.length];

        switch (subjectName){
            case "A": int[] marksA = {students[0].subjectA, students[1].subjectA, students[2].subjectA};
                      ans[0] = subjectATotalByStudents(marksA);
         

            case "B":int[] marksB = {students[0].subjectB, students[1].subjectB, students[2].subjectB};
                ans[1] = subjectBTotalByStudents(marksB);
             

            case "C":int[] marksC = {students[0].subjectC, students[1].subjectC, students[2].subjectC};
                ans[2] = subjectCTotalByStudents(marksC);
  
        }
        return ans;
    }
    public int subjectATotalByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length; i++){
            total+=marks[i];
        }
        return total;
    }
    public int subjectBTotalByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length; i++){
            total+=marks[i];
        }
        return total;
    }
    public int subjectCTotalByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length; i++){
            total+=marks[i];
        }
        return total;
    }

    public int subjectTotalByStudents(int[] marks){
        int size = marks.length;
        int total = 0;
        for(int i=0;i<size;++i) total += marks[i];
        return total;

    }

    public double subjectAAverageByStudents(int[] marks) {
        int size = marks.length;
        int total = 0;
        for (int mark : marks) total += mark;
        return total / size;

    }
    public double subjectBAverageByStudents(int[] marks) {
        int size = marks.length;
        int total = 0;
        for (int mark : marks) total += mark;
        return total / size;
    }
    public double subjectCAverageByStudents(int[] marks) {
        int size = marks.length;
        int total = 0;
        for (int mark : marks) total += mark;
        return total / size;
    }

}

public class Assignment1Q9 {

    public static void main(String[] args) {}
}
