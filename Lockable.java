package CS131Lab2_SJK;

/**
 * @author sam Kauffman
 * @version 1.0
 */
public interface Lockable {
	/**
	 * @param key
	 */
	public void setKey(int key);
	/**
	 * @param key
	 */
	public void lock(int key);
	/**
	 * @param key
	 */
	public void unlock(int key);
	/**
	 * @return
	 */
	public boolean isLocked();
}