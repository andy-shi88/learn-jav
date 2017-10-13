import java.util.*;

class Main {
	public static void main(String[] args) {
		BaseResponse<Assignment> assignment_response = new BaseResponse<>();
		BaseResponse<Curriculum> curricullum_response = new BaseResponse<>();
		Assignment assignment_a = new Assignment("WPM", "https://10fastfingers.com");
		Assignment assignment_b = new Assignment("Hackerrank", "https://hackerrank.com");
		Curriculum curriculum_a = new Curriculum("React Native", false);
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		ArrayList<Curriculum> curriculums = new ArrayList<Curriculum>();

		assignments.add(assignment_a);
		assignments.add(assignment_b);
		curriculums.add(curriculum_a);
		assignment_response.setData(assignments);
		curricullum_response.setData(curriculums);
		System.out.println("Assignment");
		System.out.println(assignment_response.getData().get(0).getName());
		System.out.println("Curriculum");

		System.out.println(curricullum_response.getData().get(0).getName());
	}

}