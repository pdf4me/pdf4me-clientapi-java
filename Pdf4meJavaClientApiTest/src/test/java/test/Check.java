package test;

public class Check {

	// length difference (+/-) of original and altered pdf (in bytes)
	private int range = 10;

	/**
	 * Checks whether the length is less (or equal) than the limit and not equal to zero.
	 * @param length to be checked
	 * @param limit
	 * @return
	 */
	public Boolean belowNotZero(int length, int limit) {

		if(length <= limit && length != 0){
			return true;
		}else {
			return false;
		}

	}
	
	/**
	 * Checks whether the length is longer (or equal) than the limit
	 * @param length
	 * @param limit
	 * @return
	 */
	public Boolean above(int length, int limit) {
		
		if(length >= limit) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean notZero(int length) {
		
		if(length > 0) {
			return true;
		}else {
			return false;
		}
		
	}

	/**
	 * Checks whether the length of the original and altered PDF differ no more than by range bytes.
	 * @param altered byte array
	 * @return
	 */
	public Boolean inRange(int altered, int midpoint, int range) {

		if(midpoint + range > altered && altered > midpoint - range) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Checks whether the length of the altered PDF is within a certain range to the midpoint.
	 * @param altered byte array
	 * @return
	 */
	public Boolean inRange(int altered, int midpoint) {

		if(midpoint + range > altered && altered > midpoint - range) {
			return true;
		}else {
			return false;
		}
	}

}
