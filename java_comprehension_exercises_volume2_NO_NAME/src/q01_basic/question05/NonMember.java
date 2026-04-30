package q01_basic.question05;

public class NonMember extends AbstMember {

	/**
	 * コンストラクタ
	 */
	public NonMember(String name) {
		//super();
		this.name = name;
	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getName() + " purchased the item at a fixed price");
	}

	@Override
	public void showMember() {
		System.out.println("*** MEMBER DATA ***");
		System.out.println(name + "is a non-member");
		System.out.println("*******************");
	}
}
