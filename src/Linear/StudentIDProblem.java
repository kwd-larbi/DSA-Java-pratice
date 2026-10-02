package Linear;

public class StudentIDProblem {
    public static void main(String[] args){
        int studentIds[] ={105, 203, 411,509, 509, 678};
        int target = 6;

        // function call
        int foundMatch = findstudent(studentIds, target);
        if (foundMatch == -1)
            System.out.print("This Student ID does not exist.");
        else
            System.out.print("Student ID is found at index " + foundMatch);

    }
    public static int findstudent(int studentIds[], int target){
        int size = studentIds.length;
        // iterate through to finding  the target
        for(int i = 0; i < size; i++){
            // if found in i then return
            if (studentIds[i] == target)
                return i;
        }
        return -1;
    }
}
