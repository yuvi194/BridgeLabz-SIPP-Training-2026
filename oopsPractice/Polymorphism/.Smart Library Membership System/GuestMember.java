package . Smart Library Membership System;
public class GuestMember
        extends LibraryMember {

    public GuestMember(
            String memberName,
            String memberId) {

        super(memberName, memberId);
    }

    @Override
    public double calculateFine(
            int overdueDays) {

        return overdueDays * 5;
    }
}
