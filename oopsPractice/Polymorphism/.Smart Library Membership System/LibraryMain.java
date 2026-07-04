package . Smart Library Membership System;
public class LibraryMain {

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember(
                        "Love", "S101"),

                new FacultyMember(
                        "Rahul", "F201"),

                new GuestMember(
                        "Aman", "G301")
        };

        String searchId = "F201";

        for (LibraryMember member : members) {

            member.printDetails();

            System.out.println(
                    "Fine = " +
                    member.calculateFine(5));

            System.out.println();

            if (member.memberId
                    .equals(searchId)) {

                System.out.println(
                        "Member Found");

                member.printDetails();
            }
        }
    }
}
