package . Smart Library Membership System;

public class FacultyMember
        extends LibraryMember {

    public FacultyMember(
            String memberName,
            String memberId) {

        super(memberName, memberId);
    }

    @Override
    public double calculateFine(
            int overdueDays) {

        return overdueDays * 1;
    }
}
