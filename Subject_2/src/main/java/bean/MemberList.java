package bean;

import java.util.ArrayList;

public class MemberList implements java.io.Serializable {
	private ArrayList<Loginbean> memberList;

	public MemberList() {
		memberList = new ArrayList<Loginbean>();
	}

	public ArrayList<Loginbean> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<Loginbean> memberList) {
		this.memberList = memberList;
	}

	public void addMember(Loginbean member) {
		memberList.add(member);
	}

	public void removeMember(Loginbean member) {
		memberList.remove(member);
	}

	@Override
	public String toString() {
		String str = "[";
		if (this.memberList != null && this.memberList.size() > 0) {
			for (int i = 0; i < this.memberList.size(); i++) {
				str += memberList.get(i).toString();
				if (i != this.memberList.size())
					str += ",";
			}
		}
		str += "]";
		return str;

	}
}
