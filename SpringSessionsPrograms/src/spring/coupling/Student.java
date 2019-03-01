/**
 * 
 */
package spring.coupling;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author satya
 *
 */
public class Student {
	private String name;
	private int age;
	private List<String> add;
	private Set<Object> phoneNo;
	private Map<Object, Object> value;
	private Properties prop;
	private Address address; // autoWire is only applicable for reference data
								// types not for primitive data types

	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	/*
	 * public Student(String name, int age) { super(); this.name = name;
	 * this.age = age; //this.address = address; }
	 */

	public String getName() {
		return name;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Map<Object, Object> getValue() {
		return value;
	}

	public void setValue(Map<Object, Object> value) {
		this.value = value;
	}

	public Set<Object> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<Object> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<String> getAdd() {
		return add;
	}

	public void setAdd(List<String> add) {
		this.add = add;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + add + ", phone No= " + phoneNo + ", Address= "
				+ address + ",Map data=" + value + ", prop ="+prop+"]";
	}

}
