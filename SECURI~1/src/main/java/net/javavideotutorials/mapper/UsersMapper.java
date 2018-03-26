package net.javavideotutorials.mapper;

import java.util.HashMap;

import net.javavideotutorials.vo.Users;

public interface UsersMapper {

	int insert(Users u);

	Users login(HashMap<String, String> map);
}
