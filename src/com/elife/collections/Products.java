package com.elife.collections;
/**
 * 
 */

/**
 * @author lputta
 *
 */
public class Products {

	private int pid;
	private String pname;
	
	public Products(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}
