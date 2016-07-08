package com.rescam.sywm.server.entity;

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
 * DeliverOrderBatchDetails generated by hbm2java
 */
@Entity
@Table(name = "deliver_order_batch_details", catalog = "sywm")
public class DeliverOrderBatchDetails implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer deliverOrderBatchDetailsId;
	private CommodityBase commodityBase;
	private CommodityPacking commodityPacking;
	private DeliverOrder deliverOrder;
	private DeliverOrderDetails deliverOrderDetails;
	private GoodsOwner goodsOwner;
	private ShipInfo shipInfo;
	private String commodityCode;
	private String commodityName;
	private String commodityStandard;
	private String commodityPackingUnit;
	private Integer commodityPackingQuantity;
	private Integer goodsReceiptDetailsId;
	private Date madeTime;
	private Date soonExpire;
	private Date shelfLife;
	private int saleQuantity;
	private int batchSetter;

	public DeliverOrderBatchDetails() {
	}

	public DeliverOrderBatchDetails(CommodityBase commodityBase, DeliverOrder deliverOrder,
			DeliverOrderDetails deliverOrderDetails, GoodsOwner goodsOwner, String commodityCode, String commodityName,
			String commodityStandard, Date madeTime, Date soonExpire, Date shelfLife, int saleQuantity,
			int batchSetter) {
		this.commodityBase = commodityBase;
		this.deliverOrder = deliverOrder;
		this.deliverOrderDetails = deliverOrderDetails;
		this.goodsOwner = goodsOwner;
		this.commodityCode = commodityCode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.madeTime = madeTime;
		this.soonExpire = soonExpire;
		this.shelfLife = shelfLife;
		this.saleQuantity = saleQuantity;
		this.batchSetter = batchSetter;
	}

	public DeliverOrderBatchDetails(CommodityBase commodityBase, CommodityPacking commodityPacking,
			DeliverOrder deliverOrder, DeliverOrderDetails deliverOrderDetails, GoodsOwner goodsOwner,
			ShipInfo shipInfo, String commodityCode, String commodityName, String commodityStandard,
			String commodityPackingUnit, Integer commodityPackingQuantity, Integer goodsReceiptDetailsId, Date madeTime,
			Date soonExpire, Date shelfLife, int saleQuantity, int batchSetter) {
		this.commodityBase = commodityBase;
		this.commodityPacking = commodityPacking;
		this.deliverOrder = deliverOrder;
		this.deliverOrderDetails = deliverOrderDetails;
		this.goodsOwner = goodsOwner;
		this.shipInfo = shipInfo;
		this.commodityCode = commodityCode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.commodityPackingUnit = commodityPackingUnit;
		this.commodityPackingQuantity = commodityPackingQuantity;
		this.goodsReceiptDetailsId = goodsReceiptDetailsId;
		this.madeTime = madeTime;
		this.soonExpire = soonExpire;
		this.shelfLife = shelfLife;
		this.saleQuantity = saleQuantity;
		this.batchSetter = batchSetter;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "deliver_order_batch_details_id", unique = true, nullable = false)
	public Integer getDeliverOrderBatchDetailsId() {
		return this.deliverOrderBatchDetailsId;
	}

	public void setDeliverOrderBatchDetailsId(Integer deliverOrderBatchDetailsId) {
		this.deliverOrderBatchDetailsId = deliverOrderBatchDetailsId;
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
	@JoinColumn(name = "commodity_packing_id")
	public CommodityPacking getCommodityPacking() {
		return this.commodityPacking;
	}

	public void setCommodityPacking(CommodityPacking commodityPacking) {
		this.commodityPacking = commodityPacking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deliver_order_id", nullable = false)
	public DeliverOrder getDeliverOrder() {
		return this.deliverOrder;
	}

	public void setDeliverOrder(DeliverOrder deliverOrder) {
		this.deliverOrder = deliverOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deliver_order_details_id", nullable = false)
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
	@JoinColumn(name = "ship_info_id")
	public ShipInfo getShipInfo() {
		return this.shipInfo;
	}

	public void setShipInfo(ShipInfo shipInfo) {
		this.shipInfo = shipInfo;
	}

	@Column(name = "commodity_code", nullable = false, length = 20)
	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
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

	@Column(name = "goods_receipt_details_id")
	public Integer getGoodsReceiptDetailsId() {
		return this.goodsReceiptDetailsId;
	}

	public void setGoodsReceiptDetailsId(Integer goodsReceiptDetailsId) {
		this.goodsReceiptDetailsId = goodsReceiptDetailsId;
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

	@Column(name = "sale_quantity", nullable = false)
	public int getSaleQuantity() {
		return this.saleQuantity;
	}

	public void setSaleQuantity(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	@Column(name = "batch_setter", nullable = false)
	public int getBatchSetter() {
		return this.batchSetter;
	}

	public void setBatchSetter(int batchSetter) {
		this.batchSetter = batchSetter;
	}

}
