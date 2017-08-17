package friendTest;

public class Operate implements Operation {

	@Override
	public Friend[] addFriend(Friend friend, Friend[] friends) {
		//创建一个新数组，长度是原数组的长度加1
		Friend[] fs = new Friend[friends.length+1];
//		将原数组中的元素全部放进新数组，目的不丢失原有联系人
		for(int i=0; i<friends.length; i++) {
			fs[i] = friends[i];
		}
//		新添加的联系人放进数组中
		fs[fs.length-1] = friend;
//		将新数组作为返回值
		return fs;
	}

	@Override
	public Friend[] deleteFriendByName(String name, Friend[] friends) {
		//计算出指定姓名的联系人的个数
		int count = 0;
		for(Friend f:friends) {
			if(f.getName().equals(name)) {
				count++;
			}
		}
		Friend[] fs = new Friend[friends.length-count];
		//j表示fs数组的下标
		int j = 0;
		for(Friend f:friends) {
			if(!f.getName().equals(name)) {
				fs[j] = f;
				j++;
			}
		}
		return fs;
	}

	@Override
	public Friend[] deleteFriendByNumber(String number, Friend[] friends) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend[] setFriend(String name, String number, Friend[] friends) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				friends[i].setId(number);
			}
		}
		return friends;
	}

	@Override
	public Friend searchFriend(String name, Friend[] friends) {
		Friend friend = null;
		for(Friend f:friends) {
			if(f.getName().equals(name)) {
				friend = f;
//				break;
			}
		}
		return friend;
	}

	@Override
	public void searchAll(Friend[] friends) {
		for(Friend f:friends) {
			System.out.println(f);
		}
	}

}
