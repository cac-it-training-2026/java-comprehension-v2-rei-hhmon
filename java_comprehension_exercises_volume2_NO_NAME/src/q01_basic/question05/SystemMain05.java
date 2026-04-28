package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する

		NonMember member1 = new NonMember("Sato Kensuke");
		members[0] = member1;

		Member member2 = new Member(1, "passw0rd", "Miura Manabu", 28, 2);
		members[1] = member2;

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		for (AbstMember memberArray : members) {
			memberArray.buyItem();
		}

	}

}
