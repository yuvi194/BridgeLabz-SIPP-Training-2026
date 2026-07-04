package . Smart Library Membership System;

public class LibraryMember {

    protected String memberName;
    protected String memberId;

    public LibraryMember(
            String memberName,
            String memberId) {

        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(
            int overdueDays) {

        return 0;
    }

    public void printDetails() {

        System.out.println(
                "Name : " + memberName);

        System.out.println(
                "ID : " + memberId);
    }
}
