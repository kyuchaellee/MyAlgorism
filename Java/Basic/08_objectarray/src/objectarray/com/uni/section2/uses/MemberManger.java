package objectarray.com.uni.section2.uses;

public class MemberManger {
	public MemberDTO[] singUpMembers() {
		MemberDTO[] members = new MemberDTO[5];
		members[0] = new MemberDTO(1,"user01","pass01","유재석",20,'남');
		members[1] = new MemberDTO(2,"user02","pass02","유재석",20,'남');
		members[2] = new MemberDTO(3,"user03","pass03","유재석",20,'남');
		members[3] = new MemberDTO(4,"user04","pass04","유재석",20,'남');
		members[4] = new MemberDTO(5,"user05","pass05","유재석",20,'남');
		
		MemberInsertManager memberInsertManager = new MemberInsertManager();
		memberInsertManager.insert(members);
		
		return members;
	}
	
	public void printAllmembers(MemberDTO[] mem) {
		for(MemberDTO member : mem) {
			System.out.println(member.getInformation());
		}
		
		System.out.println("===============================");
		System.out.println("총" + mem.length+"명의 회원이 가입함.");
	}
}
