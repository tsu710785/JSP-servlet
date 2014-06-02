package model;

import model.User;

/*
 * 此Java Class扮演MVC架構中Model的角色, 會讓Controller來呼叫使用
 */
public class AccountUtil {

	/**
	 * 此方法用來新增一位使用者
	 * 
	 * @param name
	 *            使用者所輸入的名字
	 * @param address
	 *            使用者所輸入的地址
	 * @param phone
	 *            使用者所輸入的電話號碼
	 * @param edu
	 *            使用者所輸入的教育程度
	 * @param sport
	 * 			  使用者所輸入的運動
	 * @param hobby
	 * 			  使用者所輸入的嗜好
	 * @param introduction
	 * 			  使用者所輸入的自介
	 * @return 傳回一個User物件
	 */
	public static User addNewUser(String name, String address, String phone,
			String edu, String accountName ,String password) {

		User user = new User();
		user.setName(name);
		user.setAddress(address);
		user.setPhoneNumber(phone);
		user.setEdu(edu);
		user.setAccountName(accountName);
		user.setPassword(password);


		return user;
	}

}
