package com.rescam.sywm.server.entity;
// Generated 2016-7-1 17:29:15 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReceiptReturnDetail generated by hbm2java
 */
@Entity
@Table(name = "receipt_return_detail", catalog = "sywm")
public class ReceiptReturnDetail implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer receiptReturnDetailId;
	private CommodityBase commodityBase;
	private CommodityPacking commodityPacking;
	private DeliverOrderDetails deliverOrderDetails;
	private GoodsOwner goodsOwner;
	private GoodsOwnerCommodity goodsOwnerCommodity;
	private ReturnDetails returnDetails;
	private String goodsOwnerCommodityCode;
	private String commodityBarcode;
	private String commodityName;
	private String commodityStandard;
	private String commodityPackingUnit;
	private Integer commodityPackingQuantity;
	private int estiReturnQuantity;
	private int receiptQuantity;
	private Date madeTime;
	private Date soonExpire;
	private Date shelfLife;
	private boolean isDamage;
	private String damageExplain;
	private Integer inWarehouseQuantity;

	public ReceiptReturnDetail() {
	}

	public ReceiptReturnDetail(GoodsOwner goodsOwner, String commodityName, int estiReturnQuantity, int receiptQuantity,
			Date madeTime, Date soonExpire, Date shelfLife, boolean isDamage) {
		this.goodsOwner = goodsOwner;
		this.commodityName = commodityName;
		this.estiReturnQuantity = estiReturnQuantity;
		this.receiptQuantity = receiptQuantity;
		this.madeTime = madeTime;
		this.soonExpire = soonExpire;
		this.shelfLife = shelfLife;
		this.isDamage = isDamage;
	}

	public ReceiptReturnDetail(CommodityBase commodityBase, CommodityPacking commodityPacking,
			DeliverOrderDetails deliverOrderDetails, GoodsOwner goodsOwner, GoodsOwnerCommodity goodsOwnerCommodity,
			ReturnDetails returnDetails, String goodsOwnerCommodityCode, String commodityBarcode, String commodityName,
			String commodityStandard, String commodityPackingUnit, Integer commodityPackingQuantity,
			int estiReturnQuantity, int receiptQuantity, Date madeTime, Date soonExpire, Date shelfLife,
			boolean isDamage, String damageExplain, Integer inWarehouseQuantity) {
		this.commodityBase = commodityBase;
		this.commodityPacking = commodityPacking;
		this.deliverOrderDetails = deliverOrderDetails;
		this.goodsOwner = goodsOwner;
		this.goodsOwnerCommodity = goodsOwnerCommodity;
		this.returnDetails = returnDetails;
		this.goodsOwnerCommodityCode = goodsOwnerCommodityCode;
		this.commodityBarcode = commodityBarcode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.commodityPackingUnit = commodityPackingUnit;
		this.commodityPackingQuantity = commodityPackingQuantity;
		this.estiReturnQuantity = estiReturnQuantity;
		this.receiptQuantity = receiptQuantity;
		this.madeTime = madeTime;
		this.soonExpire = soonExpire;
		this.shelfLife = shelfLife;
		this.isDamage = isDamage;
		this.damageExplain = damageExplain;
		this.inWarehouseQuantity = inWarehouseQuantity;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "receipt_return_detail_id", unique = true, nullable = false)
	public Integer getReceiptReturnDetailId() {
		return this.receiptReturnDetailId;
	}

	public void setReceiptReturnDetailId(Integer receiptReturnDetailId) {
		this.receiptReturnDetailId = receiptReturnDetailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commodity_base_id")
	public CommodityBase getCommodityBase() {
		return this.commodityBase;
	}

	public void setCommodityBase(CommodityBase commodityBase) {
		this.commodityBase = commodityBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commodity_packing_id")
	public CommodityPacking getCommodityPacking() {
		return this.commodityPacking;
	}

	public void setCommodityPacking(CommodityPacking commodityPacking) {
		this.commodityPacking = commodityPacking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deliver_order_details_id")
	public DeliverOrderDetails getDeliverOrderDetails() {
		return this.deliverOrderDetails;
	}

	public void setDeliverOrderDetails(DeliverOrderDetails deliverOrderDetails) {
		this.deliverOrderDetails = deliverOrderDetails;
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
	@JoinColumn(name = "goods_owner_commodity_id")
	public GoodsOwnerCommodity getGoodsOwnerCommodity() {
		return this.goodsOwnerCommodity;
	}

	public void setGoodsOwnerCommodity(GoodsOwnerCommodity goodsOwnerCommodity) {
		this.goodsOwnerCommodity = goodsOwnerCommodity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "return_details_id")
	public ReturnDetails getReturnDetails() {
		return this.returnDetails;
	}

	public void setReturnDetails(ReturnDetails returnDetails) {
		this.returnDetails = returnDetails;
	}

	@Column(name = "goods_owner_commodity_code", length = 20)
	public String getGoodsOwnerCommodityCode() {
		return this.goodsOwnerCommodityCode;
	}

	public void setGoodsOwnerCommodityCode(String goodsOwnerCommodityCode) {
		this.goodsOwnerCommodityCode = goodsOwnerCommodityCode;
	}

	@Column(name = "commodity_barcode", length = 20)
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

	@Column(name = "commodity_standard", length = 50)
	public String getCommodityStandard() {
		return this.commodityStandard;
	}

	public void setCommodityStandard(String commodityStandard) {
		this.commodityStandard = commodityStandard;
	}

	@Column(name = "commodity_packing_unit", length = 10)
	public String getCommodityPackingUnit() {
		return this.commodityPackingUnit;
	}

	public void setCommodityPackingUnit(String commodityPackingUnit) {
		this.commodityPackingUnit = commodityPackingUnit;
	}

	@Column(name = "commodity_packing_quantity")
	public Integer getCommodityPackingQuantity() {
		return this.commodityPackingQuantity;
	}

	public void setCommodityPackingQuantity(Integer commodityPackingQuantity) {
		this.commodityPackingQuantity = commodityPackingQuantity;
	}

	@Column(name = "esti_return_quantity", nullable = false)
	public int getEstiReturnQuantity() {
		return this.estiReturnQuantity;
	}

	public void setEstiReturnQuantity(int estiReturnQuantity) {
		this.estiReturnQuantity = estiReturnQuantity;
	}

	@Column(name = "receipt_quantity", nullable = false)
	public int getReceiptQuantity() {
		return this.receiptQuantity;
	}

	public void setReceiptQuantity(int receiptQuantity) {
		this.receiptQuantity = receiptQuantity;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "made_time", nullable = false, length = 10)
	public Date getMadeTime() {
		return this.madeTime;
	}

	public void setMadeTime(Date madeTime) {
		this.madeTime = madeTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "soon_expire", nullable = false, length = 10)
	public Date getSoonExpire() {
		return this.soonExpire;
	}

	public void setSoonExpire(Date soonExpire) {
		this.soonExpire = soonExpire;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "shelf_life", nullable = false, length = 10)
	public Date getShelfLife() {
		return this.shelfLife;
	}

	public void setShelfLife(Date shelfLife) {
		this.shelfLife = shelfLife;
	}

	@Column(name = "is_damage", nullable = false)
	public boolean isIsDamage() {
		return this.isDamage;
	}

	public void setIsDamage(boolean isDamage) {
		this.isDamage = isDamage;
	}

	@Column(name = "damage_explain", length = 50)
	public String getDamageExplain() {
		return this.damageExplain;
	}

	public void setDamageExplain(String damageExplain) {
		this.damageExplain = damageExplain;
	}

	@Column(name = "in_warehouse_quantity")
	public Integer getInWarehouseQuantity() {
		return this.inWarehouseQuantity;
	}

	public void setInWarehouseQuantity(Integer inWarehouseQuantity) {
		this.inWarehouseQuantity = inWarehouseQuantity;
	}

}
