package com.rescam.sywm.server.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReturnInfo generated by hbm2java
 */
@Entity
@Table(name = "return_info", catalog = "sywm")
public class ReturnInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer returnInfoId;
	private Driver driver;
	private GoodsOwnerUser goodsOwnerUserByUpdateUserId;
	private GoodsOwnerUser goodsOwnerUserByCommitUserId;
	private GoodsOwnerUser goodsOwnerUserByCreateUserId;
	private int goodsOwnerId;
	private String returnCode;
	private String returnAddress;
	private String returnContact;
	private String returnContactTel;
	private Date returnDate;
	private int returnType;
	private String returnRemark;
	private Date createTime1;
	private Date createTime2;
	private Date updateTime;
	private Date commitTime;
	private int returnStatus;
	private boolean isDelete;
	private Set<ReturnDetails> returnDetailses = new HashSet<ReturnDetails>(0);

	public ReturnInfo() {
	}

	public ReturnInfo(int goodsOwnerId, String returnCode, String returnAddress, String returnContact,
			String returnContactTel, int returnType, int returnStatus, boolean isDelete) {
		this.goodsOwnerId = goodsOwnerId;
		this.returnCode = returnCode;
		this.returnAddress = returnAddress;
		this.returnContact = returnContact;
		this.returnContactTel = returnContactTel;
		this.returnType = returnType;
		this.returnStatus = returnStatus;
		this.isDelete = isDelete;
	}

	public ReturnInfo(Driver driver, GoodsOwnerUser goodsOwnerUserByUpdateUserId,
			GoodsOwnerUser goodsOwnerUserByCommitUserId, GoodsOwnerUser goodsOwnerUserByCreateUserId, int goodsOwnerId,
			String returnCode, String returnAddress, String returnContact, String returnContactTel, Date returnDate,
			int returnType, String returnRemark, Date createTime1, Date createTime2, Date updateTime, Date commitTime,
			int returnStatus, boolean isDelete, Set<ReturnDetails> returnDetailses) {
		this.driver = driver;
		this.goodsOwnerUserByUpdateUserId = goodsOwnerUserByUpdateUserId;
		this.goodsOwnerUserByCommitUserId = goodsOwnerUserByCommitUserId;
		this.goodsOwnerUserByCreateUserId = goodsOwnerUserByCreateUserId;
		this.goodsOwnerId = goodsOwnerId;
		this.returnCode = returnCode;
		this.returnAddress = returnAddress;
		this.returnContact = returnContact;
		this.returnContactTel = returnContactTel;
		this.returnDate = returnDate;
		this.returnType = returnType;
		this.returnRemark = returnRemark;
		this.createTime1 = createTime1;
		this.createTime2 = createTime2;
		this.updateTime = updateTime;
		this.commitTime = commitTime;
		this.returnStatus = returnStatus;
		this.isDelete = isDelete;
		this.returnDetailses = returnDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "return_info_id", unique = true, nullable = false)
	public Integer getReturnInfoId() {
		return this.returnInfoId;
	}

	public void setReturnInfoId(Integer returnInfoId) {
		this.returnInfoId = returnInfoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_id")
	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "update_user_id")
	public GoodsOwnerUser getGoodsOwnerUserByUpdateUserId() {
		return this.goodsOwnerUserByUpdateUserId;
	}

	public void setGoodsOwnerUserByUpdateUserId(GoodsOwnerUser goodsOwnerUserByUpdateUserId) {
		this.goodsOwnerUserByUpdateUserId = goodsOwnerUserByUpdateUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commit_user_id")
	public GoodsOwnerUser getGoodsOwnerUserByCommitUserId() {
		return this.goodsOwnerUserByCommitUserId;
	}

	public void setGoodsOwnerUserByCommitUserId(GoodsOwnerUser goodsOwnerUserByCommitUserId) {
		this.goodsOwnerUserByCommitUserId = goodsOwnerUserByCommitUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "create_user_id")
	public GoodsOwnerUser getGoodsOwnerUserByCreateUserId() {
		return this.goodsOwnerUserByCreateUserId;
	}

	public void setGoodsOwnerUserByCreateUserId(GoodsOwnerUser goodsOwnerUserByCreateUserId) {
		this.goodsOwnerUserByCreateUserId = goodsOwnerUserByCreateUserId;
	}

	@Column(name = "goods_owner_id", nullable = false)
	public int getGoodsOwnerId() {
		return this.goodsOwnerId;
	}

	public void setGoodsOwnerId(int goodsOwnerId) {
		this.goodsOwnerId = goodsOwnerId;
	}

	@Column(name = "return_code", nullable = false, length = 14)
	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	@Column(name = "return_address", nullable = false, length = 50)
	public String getReturnAddress() {
		return this.returnAddress;
	}

	public void setReturnAddress(String returnAddress) {
		this.returnAddress = returnAddress;
	}

	@Column(name = "return_contact", nullable = false, length = 20)
	public String getReturnContact() {
		return this.returnContact;
	}

	public void setReturnContact(String returnContact) {
		this.returnContact = returnContact;
	}

	@Column(name = "return_contact_tel", nullable = false, length = 20)
	public String getReturnContactTel() {
		return this.returnContactTel;
	}

	public void setReturnContactTel(String returnContactTel) {
		this.returnContactTel = returnContactTel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "return_date", length = 10)
	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Column(name = "return_type", nullable = false)
	public int getReturnType() {
		return this.returnType;
	}

	public void setReturnType(int returnType) {
		this.returnType = returnType;
	}

	@Column(name = "return_remark", length = 50)
	public String getReturnRemark() {
		return this.returnRemark;
	}

	public void setReturnRemark(String returnRemark) {
		this.returnRemark = returnRemark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time1", length = 19)
	public Date getCreateTime1() {
		return this.createTime1;
	}

	public void setCreateTime1(Date createTime1) {
		this.createTime1 = createTime1;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time2", length = 19)
	public Date getCreateTime2() {
		return this.createTime2;
	}

	public void setCreateTime2(Date createTime2) {
		this.createTime2 = createTime2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "commit_time", length = 19)
	public Date getCommitTime() {
		return this.commitTime;
	}

	public void setCommitTime(Date commitTime) {
		this.commitTime = commitTime;
	}

	@Column(name = "return_status", nullable = false)
	public int getReturnStatus() {
		return this.returnStatus;
	}

	public void setReturnStatus(int returnStatus) {
		this.returnStatus = returnStatus;
	}

	@Column(name = "is_delete", nullable = false)
	public boolean isIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "returnInfo")
	public Set<ReturnDetails> getReturnDetailses() {
		return this.returnDetailses;
	}

	public void setReturnDetailses(Set<ReturnDetails> returnDetailses) {
		this.returnDetailses = returnDetailses;
	}

}
