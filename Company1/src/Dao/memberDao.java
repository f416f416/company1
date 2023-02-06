package Dao;

import java.util.List;
import Model.member;

public interface memberDao {

	//create新增
	//void add(String name,String username,String password,String address,String phone,String mobile);
	void add(member m);//inject注入
	//read查詢
	String queryAll1();
	List<member> queryAll2();
	member queryId(int id);
	member queryMember(String name,String password);
	boolean queryUser(String username);
	//update修改
	void update(member m);//inject注入
	//delete刪除
	void delete(int id);
}
