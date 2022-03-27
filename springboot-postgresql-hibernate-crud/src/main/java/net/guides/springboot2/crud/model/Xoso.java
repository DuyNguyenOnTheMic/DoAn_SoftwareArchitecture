package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "provinces")
public class Xoso {

	private String xs_id;
	private String xs_name;
	private String xs_type_region;
	
	public Xoso() {
		
	}

	@Id
	@Column(name = "id")
	public String getXs_id() {
		return xs_id;
	}

	public void setXs_id(String xs_id) {
		this.xs_id = xs_id;
	}

	@Column(name = "name")
	public String getXs_name() {
		return xs_name;
	}

	public void setXs_name(String xs_name) {
		this.xs_name = xs_name;
	}

	@Column(name = "type_region")
	public String getXs_type_region() {
		return xs_type_region;
	}

	public void setXs_type_region(String xs_type_region) {
		this.xs_type_region = xs_type_region;
	}
}
