package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName;
    public String givenName;
    public String address;
    
    public Kato_Chapter18(String familyName, String address) {
        this.familyName = familyName;
        this.address = address;
    }

    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}

