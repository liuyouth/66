package com.rescam.sywm.server.entity;

import static javax.persistence.GenerationType.IDENTITY;

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

/**
 * ReturnDetails generated by hbm2java
 */
@Entity
@Table(name = "return_details", catalog = "sywm")
public class ReturnDetails implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer returnDetailsId;
	private CommodityBase commodityBase;
	private CommodityPacking commodityPacking;
	private GoodsOwner goodsOwner;
	private GoodsOwnerCommodity goodsOwnerCommodity;
	private ReturnInfo returnInfo;
	private String goodsOwnerCommodityCode;
	private String commodityBarcode;
	private String commodityName;
	private String commodityStandard;
	private String commodityPackingUnit;
	private int commodityPackingQuantity;
	private int returnQuantity;
	private Integer receiptQuantity;
	private Set<DamageDetails> damageDetailses = new HashSet<DamageDetails>(0);
	private Set<DestroyDetails> destroyDetailses = new HashSet<DestroyDetails>(0);

	public ReturnDetails() {
	}

	public ReturnDetails(CommodityBase commodityBase, CommodityPacking commodityPacking, GoodsOwner goodsOwner,
			GoodsOwnerCommodity goodsOwnerCommodity, ReturnInfo returnInfo, String commodityBarcode,
			String commodityName, String commodityStandard, String commodityPackingUnit, int commodityPackingQuantity,
			int returnQuantity) {
		this.commodityBase = commodityBase;
		this.commodityPacking = commodityPacking;
		this.goodsOwner = goodsOwner;
		this.goodsOwnerCommodity = goodsOwnerCommodity;
		this.returnInfo = returnInfo;
		this.commodityBarcode = commodityBarcode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.commodityPackingUnit = commodityPackingUnit;
		this.commodityPackingQuantity = commodityPackingQuantity;
		this.returnQuantity = returnQuantity;
	}

	public ReturnDetails(CommodityBase commodityBase, CommodityPacking commodityPacking, GoodsOwner goodsOwner,
			GoodsOwnerCommodity goodsOwnerCommodity, ReturnInfo returnInfo, String goodsOwnerCommodityCode,
			String commodityBarcode, String commodityName, String commodityStandard, String commodityPackingUnit,
			int commodityPackingQuantity, int returnQuantity, Integer receiptQuantity,
			Set<DamageDetails> damageDetailses, Set<DestroyDetails> destroyDetailses) {
		this.commodityBase = commodityBase;
		this.commodityPacking = commodityPacking;
		this.goodsOwner = goodsOwner;
		this.goodsOwnerCommodity = goodsOwnerCommodity;
		this.returnInfo = returnInfo;
		this.goodsOwnerCommodityCode = goodsOwnerCommodityCode;
		this.commodityBarcode = commodityBarcode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.commodityPackingUnit = commodityPackingUnit;
		this.commodityPackingQuantity = commodityPackingQuantity;
		this.returnQuantity = returnQuantity;
		this.receiptQuantity = receiptQuantity;
		this.damageDetailses = damageDetailses;
		this.destroyDetailses = destroyDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "return_details_id", unique = true, nullable = false)
	public Integer getReturnDetailsId() {
		return this.returnDetailsId;
	}

	public void setReturnDetailsId(Integer returnDetailsId) {
		this.returnDetailsId = returnDetailsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commodity_base_id", nullable = false)
	public CommodityBase getCommodityBase() {
		return this.commodityBase;
	}

	public void setCommodityBase(CommodityBase commodityBase) {
		this.commodityBase = commodityBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commodity_packing_id", nullable = false)
	public CommodityPacking getCommodityPacking() {
		return this.commodityPacking;
	}

	public void setCommodityPacking(CommodityPacking commodityPacking) {
		this.commodityPacking = commodityPacking;
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
	@JoinColumn(name = "goods_owner_commodity_id", nullable = false)
	public GoodsOwnerCommodity getGoodsOwnerCommodity() {
		return this.goodsOwnerCommodity;
	}

	public void setGoodsOwnerCommodity(GoodsOwnerCommodity goodsOwnerCommodity) {
		this.goodsOwnerCommodity = goodsOwnerCommodity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "return_info_id", nullable = false)
	public ReturnInfo getReturnInfo() {
		return this.returnInfo;
	}

	public void setReturnInfo(ReturnInfo returnInfo) {
		this.returnInfo = returnInfo;
	}

	@Column(name = "goods_owner_commodity_code", length = 20)
	public String getGoodsOwnerCommodityCode() {
		return this.goodsOwnerCommodityCode;
	}

	public void setGoodsOwnerCommodityCode(String goodsOwnerCommodityCode) {
		this.goodsOwnerCommodityCode = goodsOwnerCommodityCode;
	}

	@Column(name = "commodity_barcode", nullable = false, length = 20)
	public String getCommodityBarcode() {
		return this.commodityBarcode;
	}

	public void setCommodityBarcode(String commodityBarcode) {
		this.commodityBarcode = commodityBarcode;
	}

	@Column(name = "commodity_name", nullable = false, length = 50)
	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	@Column(name = "commodity_standard", nullable = false, length = 50)
	public String getCommodityStandard() {
		return this.commodityStandard;
	}

	public void setCommodityStandard(String commodityStandard) {
		this.commodityStandard = commodityStandard;
	}

	@Column(name = "commodity_packing_unit", nullable = false, length = 10)
	public String getCommodityPackingUnit() {
		return this.commodityPackingUnit;
	}

	public void setCommodityPackingUnit(String commodityPackingUnit) {
		this.commodityPackingUnit = commodityPackingUnit;
	}

	@Column(name = "commodity_packing_quantity", nullable = false)
	public int getCommodityPackingQuantity() {
		return this.commodityPackingQuantity;
	}

	public void setCommodityPackingQuantity(int commodityPackingQuantity) {
		this.commodityPackingQuantity = commodityPackingQuantity;
	}

	@Column(name = "return_quantity", nullable = false)
	public int getReturnQuantity() {
		return this.returnQuantity;
	}

	public void setReturnQuantity(int returnQuantity) {
		this.returnQuantity = returnQuantity;
	}

	@Column(name = "receipt_quantity")
	public Integer getReceiptQuantity() {
		return this.receiptQuantity;
	}

	public void setReceiptQuantity(Integer receiptQuantity) {
		this.receiptQuantity = receiptQuantity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "returnDetails")
	public Set<DamageDetails> getDamageDetailses() {
		return this.damageDetailses;
	}

	public void setDamageDetailses(Set<DamageDetails> damageDetailses) {
		this.damageDetailses = damageDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "returnDetails")
	public Set<DestroyDetails> getDestroyDetailses() {
		return this.destroyDetailses;
	}

	public void setDestroyDetailses(Set<DestroyDetails> destroyDetailses) {
		this.destroyDetailses = destroyDetailses;
	}

}
