import java.util.*;

public class EmployeeSkillAssignment {

    static void findTeams(int[] arr,
                          int index,
                          int target,
                          ArrayList<Integer> team,
                          int currentSum) {

        if (index == arr.length) {

            if (currentSum == target) {
                System.out.println(team);
            }

            return;
        }

        team.add(arr[index]);

        findTeams(arr,
                index + 1,
                target,
                team,
                currentSum + arr[index]);

        team.remove(team.size() - 1);

        findTeams(arr,
                index + 1,
                target,
                team,
                currentSum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills,
                0,
                target,
                new ArrayList<>(),
                0);
    }
}