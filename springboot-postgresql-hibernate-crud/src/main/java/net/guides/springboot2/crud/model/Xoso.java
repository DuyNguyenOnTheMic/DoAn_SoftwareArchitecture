package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "lottery")
public class Xoso implements Serializable {

	private int lottery_id;
	private int lottery_province_id;
	private String lottery_g1;
	private String lottery_g2;
	private String lottery_g3;
	private String lottery_g4;
	private String lottery_g5;
	private String lottery_g6;
	private String lottery_g7;
	private String lottery_g8;
	private String lottery_db;
	private String lottery_ngay_so;
	private String lottery_thu_so;
	private int lottery_vung;
	private String lottery_created_at;
	private String lottery_updated_at;




	public Xoso() {
		
	}

	@Id
	@Column(name = "id")
	public int getLottery_id() {
		return lottery_id;
	}

	public void setLottery_id(int lottery_id) {
		this.lottery_id = lottery_id;
	}

	@Column(name = "province_id")
	public int getLottery_province_id() {
		return lottery_province_id;
	}

	public void setLottery_province_id(int lottery_province_id) {
		this.lottery_province_id = lottery_province_id;
	}

	@Column(name = "g1")
	public String getLottery_g1() {
		return lottery_g1;
	}

	public void setLottery_g1(String lottery_g1) {
		this.lottery_g1 = lottery_g1;
	}

	@Column(name = "g2")
	public String getLottery_g2() {
		return lottery_g2;
	}

	public void setLottery_g2(String lottery_g2) {
		this.lottery_g2 = lottery_g2;
	}

	@Column(name = "g3")
	public String getLottery_g3() {
		return lottery_g3;
	}

	public void setLottery_g3(String lottery_g3) {
		this.lottery_g3 = lottery_g3;
	}

	@Column(name = "g4")
	public String getLottery_g4() {
		return lottery_g4;
	}

	public void setLottery_g4(String lottery_g4) {
		this.lottery_g4 = lottery_g4;
	}

	@Column(name = "g5")
	public String getLottery_g5() {
		return lottery_g5;
	}

	public void setLottery_g5(String lottery_g5) {
		this.lottery_g5 = lottery_g5;
	}

	@Column(name = "g6")
	public String getLottery_g6() {
		return lottery_g6;
	}

	public void setLottery_g6(String lottery_g6) {
		this.lottery_g6 = lottery_g6;
	}

	@Column(name = "g7")
	public String getLottery_g7() {
		return lottery_g7;
	}

	public void setLottery_g7(String lottery_g7) {
		this.lottery_g7 = lottery_g7;
	}

	@Column(name = "g8")
	public String getLottery_g8() {
		return lottery_g8;
	}

	public void setLottery_g8(String lottery_g8) {
		this.lottery_g8 = lottery_g8;
	}

	@Column(name = "db")
	public String getLottery_db() {
		return lottery_db;
	}

	public void setLottery_db(String lottery_db) {
		this.lottery_db = lottery_db;
	}

	@Column(name = "ngay_so")
	public String getLottery_ngay_so() {
		return lottery_ngay_so;
	}

	public void setLottery_ngay_so(String lottery_ngay_so) {
		this.lottery_ngay_so = lottery_ngay_so;
	}

	@Column(name = "thu_so")
	public String getLottery_thu_so() {
		return lottery_thu_so;
	}

	public void setLottery_thu_so(String lottery_thu_so) {
		this.lottery_thu_so = lottery_thu_so;
	}

	@Column(name = "vung")
	public int getLottery_vung() {
		return lottery_vung;
	}

	public void setLottery_vung(int lottery_vung) {
		this.lottery_vung = lottery_vung;
	}

	@Column(name = "created_at")
	public String getLottery_created_at() {
		return lottery_created_at;
	}

	public void setLottery_created_at(String lottery_created_at) {
		this.lottery_created_at = lottery_created_at;
	}

	@Column(name = "updated_at")
	public String getLottery_updated_at() {
		return lottery_updated_at;
	}

	public void setLottery_updated_at(String lottery_updated_at) {
		this.lottery_updated_at = lottery_updated_at;
	}
}
