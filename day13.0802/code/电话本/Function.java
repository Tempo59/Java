package w02d10homework;

/**
 * 逻辑功能类
 * @author Administrator
 *
 */
public class Function implements Operation {

	@Override
	public Friend[] addFriend(Friend friend, Friend[] friends) {
		int count = 0;
		// 判断此联系人是否已经添加
		for (Friend f : friends) {
			if (f != null && f.getName().equals(friend.getName())) {
				System.out.println("添加失败，此联系已经存在了!");
				return friends;
			}
			count++;
		}
		// 数组中间元素可能存在null,所以要查询到最后一个元素
		if (count == friends.length) {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("新添加的联系人是："+friends[i]);
					System.out.println("添加联系人成功");
					break;
				} else if (friends[friends.length - 1] != null) {
					System.out.println("添加联系人失败，电话本已经存满了!");
				}
			}

		}

		return friends;
	}

	@Override
	public Friend[] deleteFriendByName(String name, Friend[] friends) {
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// 有对象才有属性
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				System.out.println(friends[i]);
				System.out.println("删除联系人成功");
				return friends;
			}
			count++;
		}
		// 数组中间元素可能存在null,所以要查询到最后一个元素
		if (count == friends.length) {
			System.out.println("你要查找的联系人不存在");
			return null;
		}

		return friends;
	}

	@Override
	public Friend[] deleteFriendByNumber(String number, Friend[] friends) {
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// 有对象才有属性
			if (friends[i] != null && friends[i].getNumber().equals(number)) {
				friends[i] = null;
				System.out.println(friends[i]);
				System.out.println("删除联系人成功");
				return friends;
			}
			count++;
		}
		// 数组中间元素可能存在null,所以要查询到最后一个元素
		if (count == friends.length) {
			System.out.println("你要查找的联系人不存在");
			return null;
		}

		return friends;
	}

	@Override
	public Friend[] setFriendByName(String name, String number, Friend[] friends) {
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// 有对象才有属性
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setNumber(number);
				System.out.println("修改后的联系人信息室："+friends[i]);
				System.out.println("修改联系人号码成功");
				return friends;
			}
			count++;
		}
		// 数组中间元素可能存在null,所以要查询到最后一个元素
		if (count == friends.length) {
			System.out.println("你要查找的联系人不存在");
			return null;
		}

		return friends;
	}

	@Override
	public Friend searchFriend(String name, Friend[] friends) {
		// 存储联系人个数
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// 有对象才有属性
			if (friends[i] != null) {
				if (friends[i].getName().equals(name)) {
					System.out.println("你要查找的联系人是：" + friends[i]);
					return friends[i];
				}
			}
			count++;
		}
		// 数组中间元素可能存在null,所以要查询到最后一个元素
		if (count == friends.length) {
			System.out.println("你要查找的联系人不存在");
			return null;
		}

		return null;
	}

	@Override
	public void searchAll(Friend[] friends) {
		for (Friend f : friends) {
			if (f != null) {
				System.out.println(f);
			}
		}
	}

}
