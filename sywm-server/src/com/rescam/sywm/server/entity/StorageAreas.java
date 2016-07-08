package com.rescam.sywm.server.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
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
 * StorageAreas generated by hbm2java
 */
@Entity
@Table(name = "storage_areas", catalog = "sywm")
public class StorageAreas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer storageAreasId;
	private Warehouse warehouse;
	private String areasName;
	private BigDecimal chargeAmount;
	private Integer billingUnit;
	private BigDecimal areasArea;
	private String areasColor;
	private boolean isEnable;
	private Set<GoodsLocator> goodsLocators = new HashSet<GoodsLocator>(0);
	private Set<CommodityBase> commodityBases = new HashSet<CommodityBase>(0);
	private Set<CommodityType> commodityTypes = new HashSet<CommodityType>(0);
	private Set<StockBoxs> stockBoxses = new HashSet<StockBoxs>(0);
	private Set<StockPallets> stockPalletses = new HashSet<StockPallets>(0);
	private Set<StorageRacks> storageRackses = new HashSet<StorageRacks>(0);

	public StorageAreas() {
	}

	public StorageAreas(Warehouse warehouse, String areasName, BigDecimal areasArea, String areasColor,
			boolean isEnable) {
		this.warehouse = warehouse;
		this.areasName = areasName;
		this.areasArea = areasArea;
		this.areasColor = areasColor;
		this.isEnable = isEnable;
	}

	public StorageAreas(Warehouse warehouse, String areasName, BigDecimal chargeAmount, Integer billingUnit,
			BigDecimal areasArea, String areasColor, boolean isEnable, Set<GoodsLocator> goodsLocators,
			Set<CommodityBase> commodityBases, Set<CommodityType> commodityTypes, Set<StockBoxs> stockBoxses,
			Set<StockPallets> stockPalletses, Set<StorageRacks> storageRackses) {
		this.warehouse = warehouse;
		this.areasName = areasName;
		this.chargeAmount = chargeAmount;
		this.billingUnit = billingUnit;
		this.areasArea = areasArea;
		this.areasColor = areasColor;
		this.isEnable = isEnable;
		this.goodsLocators = goodsLocators;
		this.commodityBases = commodityBases;
		this.commodityTypes = commodityTypes;
		this.stockBoxses = stockBoxses;
		this.stockPalletses = stockPalletses;
		this.storageRackses = storageRackses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "storage_areas_id", unique = true, nullable = false)
	public Integer getStorageAreasId() {
		return this.storageAreasId;
	}

	public void setStorageAreasId(Integer storageAreasId) {
		this.storageAreasId = storageAreasId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id", nullable = false)
	public Warehouse getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Column(name = "areas_name", nullable = false, length = 50)
	public String getAreasName() {
		return this.areasName;
	}

	public void setAreasName(String areasName) {
		this.areasName = areasName;
	}

	@Column(name = "charge_amount", precision = 13)
	public BigDecimal getChargeAmount() {
		return this.chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	@Column(name = "billing_unit")
	public Integer getBillingUnit() {
		return this.billingUnit;
	}

	public void setBillingUnit(Integer billingUnit) {
		this.billingUnit = billingUnit;
	}

	@Column(name = "areas_area", nullable = false, precision = 11, scale = 3)
	public BigDecimal getAreasArea() {
		return this.areasArea;
	}

	public void setAreasArea(BigDecimal areasArea) {
		this.areasArea = areasArea;
	}

	@Column(name = "areas_color", nullable = false, length = 10)
	public String getAreasColor() {
		return this.areasColor;
	}

	public void setAreasColor(String areasColor) {
		this.areasColor = areasColor;
	}

	@Column(name = "is_enable", nullable = false)
	public boolean isIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storageAreas")
	public Set<GoodsLocator> getGoodsLocators() {
		return this.goodsLocators;
	}

	public void setGoodsLocators(Set<GoodsLocator> goodsLocators) {
		this.goodsLocators = goodsLocators;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storageAreas")
	public Set<CommodityBase> getCommodityBases() {
		return this.commodityBases;
	}

	public void setCommodityBases(Set<CommodityBase> commodityBases) {
		this.commodityBases = commodityBases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storageAreas")
	public Set<CommodityType> getCommodityTypes() {
		return this.commodityTypes;
	}

	public void setCommodityTypes(Set<CommodityType> commodityTypes) {
		this.commodityTypes = commodityTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storageAreas")
	public Set<StockBoxs> getStockBoxses() {
		return this.stockBoxses;
	}

	public void setStockBoxses(Set<StockBoxs> stockBoxses) {
		this.stockBoxses = stockBoxses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storageAreas")
	public Set<StockPallets> getStockPalletses() {
		return this.stockPalletses;
	}

	public void setStockPalletses(Set<StockPallets> stockPalletses) {
		this.stockPalletses = stockPalletses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storageAreas")
	public Set<StorageRacks> getStorageRackses() {
		return this.storageRackses;
	}

	public void setStorageRackses(Set<StorageRacks> storageRackses) {
		this.storageRackses = storageRackses;
	}

}
