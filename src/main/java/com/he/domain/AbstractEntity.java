package com.he.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hzq on 16/11/15.
 */
@MappedSuperclass
public class AbstractEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Date createTime = new Date();

	private Date lastModifyTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && this.getClass().equals(obj.getClass())
				&& this.id.equals(((AbstractEntity)obj).getId());
	}

	@Override
	public int hashCode() {
		return this.id == null ? 0 : this.getId().hashCode();
	}
}
