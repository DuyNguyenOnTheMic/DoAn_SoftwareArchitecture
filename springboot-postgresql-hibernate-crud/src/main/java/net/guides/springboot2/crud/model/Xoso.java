package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "provinces")
public class Xoso {

	private int province_id;
	private String province_name;
	private int province_type_region;
	
	public Xoso() {
		
	}

	@Id
	@Column(name = "id")
	public int getProvince_id() {
		return province_id;
	}

	public void setProvince_id(int province_id) {
		this.province_id = province_id;
	}

	@Column(name = "name")
	public String getProvince_name() {
		return province_name;
	}

	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}

	@Column(name = "type_region")
	public int getProvince_type_region() {
		return province_type_region;
	}

	public void setProvince_type_region(int province_type_region) {
		this.province_type_region = province_type_region;
	}
}
