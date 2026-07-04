package . Smart Library Membership System;

public class StudentMember
        extends LibraryMember {

    public StudentMember(
            String memberName,
            String memberId) {

        super(memberName, memberId);
    }

    @Override
    public double calculateFine(
            int overdueDays) {

        return overdueDays * 2;
    }
}
