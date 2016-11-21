package com.he.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hzq on 16/11/15.
 */
@Entity
@Table(name = "merchant")
public class Merchant extends AbstractEntity{

	private String slug;

	private String phone;

	private String name;

	private String company;

	private int status = 0;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public enum Status{
		DEFAULT(0),

		APPLY_ING(1),

		SUCCESS(2);

		Status(int id) {
			this.id = id;
		}

		private int id;

		public int getId() {
			return id;
		}
	}
}
