package com.mastek.topcoders.smartkanteen.service;

import java.util.List;

import com.mastek.topcoders.smartkanteen.bean.Role;
import com.mastek.topcoders.smartkanteen.bean.User;
import com.mastek.topcoders.smartkanteen.bean.UserSession;
import com.mastek.topcoders.smartkanteen.common.util.IncorrectPasswordException;
import com.mastek.topcoders.smartkanteen.common.util.UserExistException;

public interface UserService
{
	public static final String ROLE_SUPERADMIN="SuperAdmin";
	public static final String ROLE_ADMIN="Admin";
	public static final String ROLE_USER="User";
	
	User getUserById(int userId);
	
	List<User> getUsers() throws Exception;

	Boolean authenicateUser(String loginId, String password) throws Exception;

	User createUser(User user) throws UserExistException, Exception;

	User updateUser(User user) throws Exception;

	Boolean deleteUser(User user) throws Exception;

	User changePassword(String loginId, String oldPassword, String newPassword) throws IncorrectPasswordException,
			Exception;

	User updateUserRole(User user, List<Role> roleList) throws Exception;

	UserSession loginUser(User user) throws Exception;

	void logoutUser(UserSession userSession);
}
