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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Warehouse generated by hbm2java
 */
@Entity
@Table(name = "warehouse", catalog = "sywm")
public class Warehouse implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer warehouseId;
	private String warehouseCode;
	private String warehouseName;
	private int warehouseType;
	private BigDecimal warehouseArea;
	private String remark;
	private boolean isEnable;
	private Set<StorageRacks> storageRackses = new HashSet<StorageRacks>(0);
	private Set<GoodsLocator> goodsLocators = new HashSet<GoodsLocator>(0);
	private Set<StockBoxs> stockBoxses = new HashSet<StockBoxs>(0);
	private Set<DamageInWarehouse> damageInWarehouses = new HashSet<DamageInWarehouse>(0);
	private Set<ReturnInWarehouse> returnInWarehouses = new HashSet<ReturnInWarehouse>(0);
	private Set<StockPallets> stockPalletses = new HashSet<StockPallets>(0);
	private Set<LoadPallets> loadPalletses = new HashSet<LoadPallets>(0);
	private Set<StorageAreas> storageAreases = new HashSet<StorageAreas>(0);

	public Warehouse() {
	}

	public Warehouse(String warehouseCode, String warehouseName, int warehouseType, BigDecimal warehouseArea,
			boolean isEnable) {
		this.warehouseCode = warehouseCode;
		this.warehouseName = warehouseName;
		this.warehouseType = warehouseType;
		this.warehouseArea = warehouseArea;
		this.isEnable = isEnable;
	}

	public Warehouse(String warehouseCode, String warehouseName, int warehouseType, BigDecimal warehouseArea,
			String remark, boolean isEnable, Set<StorageRacks> storageRackses, Set<GoodsLocator> goodsLocators,
			Set<StockBoxs> stockBoxses, Set<DamageInWarehouse> damageInWarehouses,
			Set<ReturnInWarehouse> returnInWarehouses, Set<StockPallets> stockPalletses, Set<LoadPallets> loadPalletses,
			Set<StorageAreas> storageAreases) {
		this.warehouseCode = warehouseCode;
		this.warehouseName = warehouseName;
		this.warehouseType = warehouseType;
		this.warehouseArea = warehouseArea;
		this.remark = remark;
		this.isEnable = isEnable;
		this.storageRackses = storageRackses;
		this.goodsLocators = goodsLocators;
		this.stockBoxses = stockBoxses;
		this.damageInWarehouses = damageInWarehouses;
		this.returnInWarehouses = returnInWarehouses;
		this.stockPalletses = stockPalletses;
		this.loadPalletses = loadPalletses;
		this.storageAreases = storageAreases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "warehouse_id", unique = true, nullable = false)
	public Integer getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Column(name = "warehouse_code", nullable = false, length = 10)
	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	@Column(name = "warehouse_name", nullable = false, length = 50)
	public String getWarehouseName() {
		return this.warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	@Column(name = "warehouse_type", nullable = false)
	public int getWarehouseType() {
		return this.warehouseType;
	}

	public void setWarehouseType(int warehouseType) {
		this.warehouseType = warehouseType;
	}

	@Column(name = "warehouse_area", nullable = false, precision = 11, scale = 3)
	public BigDecimal getWarehouseArea() {
		return this.warehouseArea;
	}

	public void setWarehouseArea(BigDecimal warehouseArea) {
		this.warehouseArea = warehouseArea;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "is_enable", nullable = false)
	public boolean isIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<StorageRacks> getStorageRackses() {
		return this.storageRackses;
	}

	public void setStorageRackses(Set<StorageRacks> storageRackses) {
		this.storageRackses = storageRackses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<GoodsLocator> getGoodsLocators() {
		return this.goodsLocators;
	}

	public void setGoodsLocators(Set<GoodsLocator> goodsLocators) {
		this.goodsLocators = goodsLocators;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<StockBoxs> getStockBoxses() {
		return this.stockBoxses;
	}

	public void setStockBoxses(Set<StockBoxs> stockBoxses) {
		this.stockBoxses = stockBoxses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<DamageInWarehouse> getDamageInWarehouses() {
		return this.damageInWarehouses;
	}

	public void setDamageInWarehouses(Set<DamageInWarehouse> damageInWarehouses) {
		this.damageInWarehouses = damageInWarehouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<ReturnInWarehouse> getReturnInWarehouses() {
		return this.returnInWarehouses;
	}

	public void setReturnInWarehouses(Set<ReturnInWarehouse> returnInWarehouses) {
		this.returnInWarehouses = returnInWarehouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<StockPallets> getStockPalletses() {
		return this.stockPalletses;
	}

	public void setStockPalletses(Set<StockPallets> stockPalletses) {
		this.stockPalletses = stockPalletses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<LoadPallets> getLoadPalletses() {
		return this.loadPalletses;
	}

	public void setLoadPalletses(Set<LoadPallets> loadPalletses) {
		this.loadPalletses = loadPalletses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<StorageAreas> getStorageAreases() {
		return this.storageAreases;
	}

	public void setStorageAreases(Set<StorageAreas> storageAreases) {
		this.storageAreases = storageAreases;
	}

}