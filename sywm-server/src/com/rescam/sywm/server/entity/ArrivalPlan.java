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
 * ArrivalPlan generated by hbm2java
 */
@Entity
@Table(name = "arrival_plan", catalog = "sywm")
public class ArrivalPlan implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer arrivalPlanId;
	private GoodsOwner goodsOwner;
	private GoodsOwnerUser goodsOwnerUserByCreateUserId;
	private GoodsOwnerUser goodsOwnerUserByCommitUserId;
	private GoodsOwnerUser goodsOwnerUserByUpdateUserId;
	private String arrivalPlanCode;
	private Date deliverDate;
	private Date arrivalPlanDate;
	private String deliverContact;
	private String deliverContactTel;
	private boolean directDelivery;
	private String directDeliveryExplain;
	private String remark;
	private Date createTime;
	private Date updateTime;
	private Date commitTime;
	private int arrivalPlanStatus;
	private boolean isDelete;
	private Set<GoodsReceipt> goodsReceipts = new HashSet<GoodsReceipt>(0);
	private Set<ArrivalPlanDetails> arrivalPlanDetailses = new HashSet<ArrivalPlanDetails>(0);

	public ArrivalPlan() {
	}

	public ArrivalPlan(GoodsOwner goodsOwner, GoodsOwnerUser goodsOwnerUserByCreateUserId,
			GoodsOwnerUser goodsOwnerUserByCommitUserId, GoodsOwnerUser goodsOwnerUserByUpdateUserId,
			String arrivalPlanCode, Date deliverDate, Date arrivalPlanDate, String deliverContact,
			String deliverContactTel, boolean directDelivery, String directDeliveryExplain, String remark,
			Date createTime, Date updateTime, Date commitTime, int arrivalPlanStatus, boolean isDelete) {
		this.goodsOwner = goodsOwner;
		this.goodsOwnerUserByCreateUserId = goodsOwnerUserByCreateUserId;
		this.goodsOwnerUserByCommitUserId = goodsOwnerUserByCommitUserId;
		this.goodsOwnerUserByUpdateUserId = goodsOwnerUserByUpdateUserId;
		this.arrivalPlanCode = arrivalPlanCode;
		this.deliverDate = deliverDate;
		this.arrivalPlanDate = arrivalPlanDate;
		this.deliverContact = deliverContact;
		this.deliverContactTel = deliverContactTel;
		this.directDelivery = directDelivery;
		this.directDeliveryExplain = directDeliveryExplain;
		this.remark = remark;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.commitTime = commitTime;
		this.arrivalPlanStatus = arrivalPlanStatus;
		this.isDelete = isDelete;
	}

	public ArrivalPlan(GoodsOwner goodsOwner, GoodsOwnerUser goodsOwnerUserByCreateUserId,
			GoodsOwnerUser goodsOwnerUserByCommitUserId, GoodsOwnerUser goodsOwnerUserByUpdateUserId,
			String arrivalPlanCode, Date deliverDate, Date arrivalPlanDate, String deliverContact,
			String deliverContactTel, boolean directDelivery, String directDeliveryExplain, String remark,
			Date createTime, Date updateTime, Date commitTime, int arrivalPlanStatus, boolean isDelete,
			Set<GoodsReceipt> goodsReceipts, Set<ArrivalPlanDetails> arrivalPlanDetailses) {
		this.goodsOwner = goodsOwner;
		this.goodsOwnerUserByCreateUserId = goodsOwnerUserByCreateUserId;
		this.goodsOwnerUserByCommitUserId = goodsOwnerUserByCommitUserId;
		this.goodsOwnerUserByUpdateUserId = goodsOwnerUserByUpdateUserId;
		this.arrivalPlanCode = arrivalPlanCode;
		this.deliverDate = deliverDate;
		this.arrivalPlanDate = arrivalPlanDate;
		this.deliverContact = deliverContact;
		this.deliverContactTel = deliverContactTel;
		this.directDelivery = directDelivery;
		this.directDeliveryExplain = directDeliveryExplain;
		this.remark = remark;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.commitTime = commitTime;
		this.arrivalPlanStatus = arrivalPlanStatus;
		this.isDelete = isDelete;
		this.goodsReceipts = goodsReceipts;
		this.arrivalPlanDetailses = arrivalPlanDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "arrival_plan_id", unique = true, nullable = false)
	public Integer getArrivalPlanId() {
		return this.arrivalPlanId;
	}

	public void setArrivalPlanId(Integer arrivalPlanId) {
		this.arrivalPlanId = arrivalPlanId;
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
	@JoinColumn(name = "create_user_id", nullable = false)
	public GoodsOwnerUser getGoodsOwnerUserByCreateUserId() {
		return this.goodsOwnerUserByCreateUserId;
	}

	public void setGoodsOwnerUserByCreateUserId(GoodsOwnerUser goodsOwnerUserByCreateUserId) {
		this.goodsOwnerUserByCreateUserId = goodsOwnerUserByCreateUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commit_user_id", nullable = false)
	public GoodsOwnerUser getGoodsOwnerUserByCommitUserId() {
		return this.goodsOwnerUserByCommitUserId;
	}

	public void setGoodsOwnerUserByCommitUserId(GoodsOwnerUser goodsOwnerUserByCommitUserId) {
		this.goodsOwnerUserByCommitUserId = goodsOwnerUserByCommitUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "update_user_id", nullable = false)
	public GoodsOwnerUser getGoodsOwnerUserByUpdateUserId() {
		return this.goodsOwnerUserByUpdateUserId;
	}

	public void setGoodsOwnerUserByUpdateUserId(GoodsOwnerUser goodsOwnerUserByUpdateUserId) {
		this.goodsOwnerUserByUpdateUserId = goodsOwnerUserByUpdateUserId;
	}

	@Column(name = "arrival_plan_code", nullable = false, length = 14)
	public String getArrivalPlanCode() {
		return this.arrivalPlanCode;
	}

	public void setArrivalPlanCode(String arrivalPlanCode) {
		this.arrivalPlanCode = arrivalPlanCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "deliver_date", nullable = false, length = 10)
	public Date getDeliverDate() {
		return this.deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "arrival_plan_date", nullable = false, length = 10)
	public Date getArrivalPlanDate() {
		return this.arrivalPlanDate;
	}

	public void setArrivalPlanDate(Date arrivalPlanDate) {
		this.arrivalPlanDate = arrivalPlanDate;
	}

	@Column(name = "deliver_contact", nullable = false, length = 20)
	public String getDeliverContact() {
		return this.deliverContact;
	}

	public void setDeliverContact(String deliverContact) {
		this.deliverContact = deliverContact;
	}

	@Column(name = "deliver_contact_tel", nullable = false, length = 20)
	public String getDeliverContactTel() {
		return this.deliverContactTel;
	}

	public void setDeliverContactTel(String deliverContactTel) {
		this.deliverContactTel = deliverContactTel;
	}

	@Column(name = "direct_delivery", nullable = false)
	public boolean isDirectDelivery() {
		return this.directDelivery;
	}

	public void setDirectDelivery(boolean directDelivery) {
		this.directDelivery = directDelivery;
	}

	@Column(name = "direct_delivery_explain", nullable = false, length = 50)
	public String getDirectDeliveryExplain() {
		return this.directDeliveryExplain;
	}

	public void setDirectDeliveryExplain(String directDeliveryExplain) {
		this.directDeliveryExplain = directDeliveryExplain;
	}

	@Column(name = "remark", nullable = false, length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
	@Column(name = "update_time", nullable = false, length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "commit_time", nullable = false, length = 19)
	public Date getCommitTime() {
		return this.commitTime;
	}

	public void setCommitTime(Date commitTime) {
		this.commitTime = commitTime;
	}

	@Column(name = "arrival_plan_status", nullable = false)
	public int getArrivalPlanStatus() {
		return this.arrivalPlanStatus;
	}

	public void setArrivalPlanStatus(int arrivalPlanStatus) {
		this.arrivalPlanStatus = arrivalPlanStatus;
	}

	@Column(name = "is_delete", nullable = false)
	public boolean isIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arrivalPlan")
	public Set<GoodsReceipt> getGoodsReceipts() {
		return this.goodsReceipts;
	}

	public void setGoodsReceipts(Set<GoodsReceipt> goodsReceipts) {
		this.goodsReceipts = goodsReceipts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arrivalPlan")
	public Set<ArrivalPlanDetails> getArrivalPlanDetailses() {
		return this.arrivalPlanDetailses;
	}

	public void setArrivalPlanDetailses(Set<ArrivalPlanDetails> arrivalPlanDetailses) {
		this.arrivalPlanDetailses = arrivalPlanDetailses;
	}

}
