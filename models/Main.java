import java.util.*;

class Main {
	public static void main(String[] args) {
		/*Create response object for assignment*/
		BaseResponse<Assignment> assignment_response = new BaseResponse<>();
		/*Create response object for curricullum*/
		BaseResponse<Curriculum> curricullum_response = new BaseResponse<>();
		/*Create assignment objects*/
		Assignment assignment_a = new Assignment("WPM", "https://10fastfingers.com");
		Assignment assignment_b = new Assignment("Hackerrank", "https://hackerrank.com");
		/*Create curriculum object*/		
		Curriculum curriculum_a = new Curriculum("React Native", false);
		/*Create the array and fill them*/
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		ArrayList<Curriculum> curriculums = new ArrayList<Curriculum>();

		assignments.add(assignment_a);
		assignments.add(assignment_b);
		curriculums.add(curriculum_a);
		assignment_response.setData(assignments);
		curricullum_response.setData(curriculums);
		/*Testing goes here*/
		System.out.println("Assignment");
		System.out.println(assignment_response.getData().get(0).getName());
		System.out.println("Curriculum");

		System.out.println(curricullum_response.getData().get(0).getName());
	}

}