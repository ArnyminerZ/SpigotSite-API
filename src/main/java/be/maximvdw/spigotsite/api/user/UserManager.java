package be.maximvdw.spigotsite.api.user;

import be.maximvdw.spigotsite.api.user.exceptions.AuthenticationFailureException;

public interface UserManager {
	/**
	 * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
	 * 
	 * @param userid
	 *            User identifier
	 * @return {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public User getUserById(int userid);

	/**
	 * Authenticate a spigot user
	 * 
	 * @param username
	 *            Username or Email address
	 * @param password
	 *            Password
	 * @return Authenticated Spigot user
	 */
	public User authenticate(String username, String password)
			throws AuthenticationFailureException;

	/**
	 * Log off a spigot user
	 * 
	 * @param user
	 *            Authenticated Spigot user
	 */
	public void logOff(User user);
}