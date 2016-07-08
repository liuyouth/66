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
 * Destroy generated by hbm2java
 */
@Entity
@Table(name = "destroy", catalog = "sywm")
public class Destroy implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer destroyId;
	private GoodsOwner goodsOwner;
	private GoodsOwnerUser goodsOwnerUser;
	private UserInfo userInfo;
	private String destroyCode;
	private Date createTime;
	private Date confirmTime;
	private String destroyExplain;
	private String rejectExplain;
	private int destroyStatus;
	private boolean isDelete;
	private Set<DestroyDetails> destroyDetailses = new HashSet<DestroyDetails>(0);

	public Destroy() {
	}

	public Destroy(GoodsOwner goodsOwner, UserInfo userInfo, String destroyCode, Date createTime, int destroyStatus,
			boolean isDelete) {
		this.goodsOwner = goodsOwner;
		this.userInfo = userInfo;
		this.destroyCode = destroyCode;
		this.createTime = createTime;
		this.destroyStatus = destroyStatus;
		this.isDelete = isDelete;
	}

	public Destroy(GoodsOwner goodsOwner, GoodsOwnerUser goodsOwnerUser, UserInfo userInfo, String destroyCode,
			Date createTime, Date confirmTime, String destroyExplain, String rejectExplain, int destroyStatus,
			boolean isDelete, Set<DestroyDetails> destroyDetailses) {
		this.goodsOwner = goodsOwner;
		this.goodsOwnerUser = goodsOwnerUser;
		this.userInfo = userInfo;
		this.destroyCode = destroyCode;
		this.createTime = createTime;
		this.confirmTime = confirmTime;
		this.destroyExplain = destroyExplain;
		this.rejectExplain = rejectExplain;
		this.destroyStatus = destroyStatus;
		this.isDelete = isDelete;
		this.destroyDetailses = destroyDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "destroy_id", unique = true, nullable = false)
	public Integer getDestroyId() {
		return this.destroyId;
	}

	public void setDestroyId(Integer destroyId) {
		this.destroyId = destroyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goods_owner_id", nullable = false)
	public GoodsOwner getGoodsOwner() {
		return this.goodsOwner;
	}

	public void setGoodsOwner(GoodsOwner goodsOwner) {
		this.goodsOwner = goodsOwner;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goods_owner_user_id")
	public GoodsOwnerUser getGoodsOwnerUser() {
		return this.goodsOwnerUser;
	}

	public void setGoodsOwnerUser(GoodsOwnerUser goodsOwnerUser) {
		this.goodsOwnerUser = goodsOwnerUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_info_id", nullable = false)
	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Column(name = "destroy_code", nullable = false, length = 14)
	public String getDestroyCode() {
		return this.destroyCode;
	}

	public void setDestroyCode(String destroyCode) {
		this.destroyCode = destroyCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "confirm_time", length = 19)
	public Date getConfirmTime() {
		return this.confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	@Column(name = "destroy_explain", length = 50)
	public String getDestroyExplain() {
		return this.destroyExplain;
	}

	public void setDestroyExplain(String destroyExplain) {
		this.destroyExplain = destroyExplain;
	}

	@Column(name = "reject_explain", length = 50)
	public String getRejectExplain() {
		return this.rejectExplain;
	}

	public void setRejectExplain(String rejectExplain) {
		this.rejectExplain = rejectExplain;
	}

	@Column(name = "destroy_status", nullable = false)
	public int getDestroyStatus() {
		return this.destroyStatus;
	}

	public void setDestroyStatus(int destroyStatus) {
		this.destroyStatus = destroyStatus;
	}

	@Column(name = "is_delete", nullable = false)
	public boolean isIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "destroy")
	public Set<DestroyDetails> getDestroyDetailses() {
		return this.destroyDetailses;
	}

	public void setDestroyDetailses(Set<DestroyDetails> destroyDetailses) {
		this.destroyDetailses = destroyDetailses;
	}

}
