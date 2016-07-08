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
 * GoodsLocator generated by hbm2java
 */
@Entity
@Table(name = "goods_locator", catalog = "sywm")
public class GoodsLocator implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer goodsLocatorId;
	private StorageAreas storageAreas;
	private StorageRacks storageRacks;
	private Warehouse warehouse;
	private String locatorCode;
	private int locatorType;
	private BigDecimal maxStorageWeight;
	private Integer maxStorageQuantity;
	private BigDecimal locatorLength;
	private BigDecimal locatorWidth;
	private BigDecimal locatorHeight;
	private Integer palletsContainingCount;
	private Integer currentStorageQuantity;
	private boolean isEnable;
	private Set<DamageDetails> damageDetailses = new HashSet<DamageDetails>(0);
	private Set<Pallets> palletses = new HashSet<Pallets>(0);
	private Set<StockPallets> stockPalletses = new HashSet<StockPallets>(0);
	private Set<DamageInWarehouse> damageInWarehouses = new HashSet<DamageInWarehouse>(0);
	private Set<StockBoxs> stockBoxses = new HashSet<StockBoxs>(0);
	private Set<LoadPallets> loadPalletses = new HashSet<LoadPallets>(0);
	private Set<ReturnInWarehouse> returnInWarehouses = new HashSet<ReturnInWarehouse>(0);

	public GoodsLocator() {
	}

	public GoodsLocator(Warehouse warehouse, String locatorCode, int locatorType, BigDecimal maxStorageWeight,
			boolean isEnable) {
		this.warehouse = warehouse;
		this.locatorCode = locatorCode;
		this.locatorType = locatorType;
		this.maxStorageWeight = maxStorageWeight;
		this.isEnable = isEnable;
	}

	public GoodsLocator(StorageAreas storageAreas, StorageRacks storageRacks, Warehouse warehouse, String locatorCode,
			int locatorType, BigDecimal maxStorageWeight, Integer maxStorageQuantity, BigDecimal locatorLength,
			BigDecimal locatorWidth, BigDecimal locatorHeight, Integer palletsContainingCount,
			Integer currentStorageQuantity, boolean isEnable, Set<DamageDetails> damageDetailses,
			Set<Pallets> palletses, Set<StockPallets> stockPalletses, Set<DamageInWarehouse> damageInWarehouses,
			Set<StockBoxs> stockBoxses, Set<LoadPallets> loadPalletses, Set<ReturnInWarehouse> returnInWarehouses) {
		this.storageAreas = storageAreas;
		this.storageRacks = storageRacks;
		this.warehouse = warehouse;
		this.locatorCode = locatorCode;
		this.locatorType = locatorType;
		this.maxStorageWeight = maxStorageWeight;
		this.maxStorageQuantity = maxStorageQuantity;
		this.locatorLength = locatorLength;
		this.locatorWidth = locatorWidth;
		this.locatorHeight = locatorHeight;
		this.palletsContainingCount = palletsContainingCount;
		this.currentStorageQuantity = currentStorageQuantity;
		this.isEnable = isEnable;
		this.damageDetailses = damageDetailses;
		this.palletses = palletses;
		this.stockPalletses = stockPalletses;
		this.damageInWarehouses = damageInWarehouses;
		this.stockBoxses = stockBoxses;
		this.loadPalletses = loadPalletses;
		this.returnInWarehouses = returnInWarehouses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "goods_locator_id", unique = true, nullable = false)
	public Integer getGoodsLocatorId() {
		return this.goodsLocatorId;
	}

	public void setGoodsLocatorId(Integer goodsLocatorId) {
		this.goodsLocatorId = goodsLocatorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "storage_areas_id")
	public StorageAreas getStorageAreas() {
		return this.storageAreas;
	}

	public void setStorageAreas(StorageAreas storageAreas) {
		this.storageAreas = storageAreas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "storage_racks_id")
	public StorageRacks getStorageRacks() {
		return this.storageRacks;
	}

	public void setStorageRacks(StorageRacks storageRacks) {
		this.storageRacks = storageRacks;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id", nullable = false)
	public Warehouse getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Column(name = "locator_code", nullable = false, length = 50)
	public String getLocatorCode() {
		return this.locatorCode;
	}

	public void setLocatorCode(String locatorCode) {
		this.locatorCode = locatorCode;
	}

	@Column(name = "locator_type", nullable = false)
	public int getLocatorType() {
		return this.locatorType;
	}

	public void setLocatorType(int locatorType) {
		this.locatorType = locatorType;
	}

	@Column(name = "max_storage_weight", nullable = false, precision = 7)
	public BigDecimal getMaxStorageWeight() {
		return this.maxStorageWeight;
	}

	public void setMaxStorageWeight(BigDecimal maxStorageWeight) {
		this.maxStorageWeight = maxStorageWeight;
	}

	@Column(name = "max_storage_quantity")
	public Integer getMaxStorageQuantity() {
		return this.maxStorageQuantity;
	}

	public void setMaxStorageQuantity(Integer maxStorageQuantity) {
		this.maxStorageQuantity = maxStorageQuantity;
	}

	@Column(name = "locator_length", precision = 6)
	public BigDecimal getLocatorLength() {
		return this.locatorLength;
	}

	public void setLocatorLength(BigDecimal locatorLength) {
		this.locatorLength = locatorLength;
	}

	@Column(name = "locator_width", precision = 6)
	public BigDecimal getLocatorWidth() {
		return this.locatorWidth;
	}

	public void setLocatorWidth(BigDecimal locatorWidth) {
		this.locatorWidth = locatorWidth;
	}

	@Column(name = "locator_height", precision = 6)
	public BigDecimal getLocatorHeight() {
		return this.locatorHeight;
	}

	public void setLocatorHeight(BigDecimal locatorHeight) {
		this.locatorHeight = locatorHeight;
	}

	@Column(name = "pallets_containing_count")
	public Integer getPalletsContainingCount() {
		return this.palletsContainingCount;
	}

	public void setPalletsContainingCount(Integer palletsContainingCount) {
		this.palletsContainingCount = palletsContainingCount;
	}

	@Column(name = "current_storage_quantity")
	public Integer getCurrentStorageQuantity() {
		return this.currentStorageQuantity;
	}

	public void setCurrentStorageQuantity(Integer currentStorageQuantity) {
		this.currentStorageQuantity = currentStorageQuantity;
	}

	@Column(name = "is_enable", nullable = false)
	public boolean isIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<DamageDetails> getDamageDetailses() {
		return this.damageDetailses;
	}

	public void setDamageDetailses(Set<DamageDetails> damageDetailses) {
		this.damageDetailses = damageDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<Pallets> getPalletses() {
		return this.palletses;
	}

	public void setPalletses(Set<Pallets> palletses) {
		this.palletses = palletses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<StockPallets> getStockPalletses() {
		return this.stockPalletses;
	}

	public void setStockPalletses(Set<StockPallets> stockPalletses) {
		this.stockPalletses = stockPalletses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<DamageInWarehouse> getDamageInWarehouses() {
		return this.damageInWarehouses;
	}

	public void setDamageInWarehouses(Set<DamageInWarehouse> damageInWarehouses) {
		this.damageInWarehouses = damageInWarehouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<StockBoxs> getStockBoxses() {
		return this.stockBoxses;
	}

	public void setStockBoxses(Set<StockBoxs> stockBoxses) {
		this.stockBoxses = stockBoxses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<LoadPallets> getLoadPalletses() {
		return this.loadPalletses;
	}

	public void setLoadPalletses(Set<LoadPallets> loadPalletses) {
		this.loadPalletses = loadPalletses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsLocator")
	public Set<ReturnInWarehouse> getReturnInWarehouses() {
		return this.returnInWarehouses;
	}

	public void setReturnInWarehouses(Set<ReturnInWarehouse> returnInWarehouses) {
		this.returnInWarehouses = returnInWarehouses;
	}

}