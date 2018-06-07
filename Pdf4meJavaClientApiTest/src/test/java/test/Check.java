package test;

public class Check {

	/**
	 * Checks whether the length is less than the limit (or equal) and not equal to
	 * zero.
	 * 
	 * @param length
	 *            to be checked
	 * @param limit
	 *            upper limit
	 * @return
	 */
	public Boolean belowNotZero(int length, int limit) {
		if (length <= limit && length != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks whether the length is longer than the limit (or equal).
	 * 
	 * @param length
	 * @param limit
	 *            lower limit
	 * @return
	 */
	public Boolean above(int length, int limit) {
		if (length >= limit) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks whether the length is not equalt to zero.
	 * 
	 * @param length
	 * @return
	 */
	public Boolean notZero(int length) {
		if (length > 0) {
			return true;
		} else {
			return false;
		}
	}
}
