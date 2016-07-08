package com.rescam.sywm.server.entity;
// Generated 2016-7-1 17:29:15 by Hibernate Tools 4.3.1.Final

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
 * SortingDetail generated by hbm2java
 */
@Entity
@Table(name = "sorting_detail", catalog = "sywm")
public class SortingDetail implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer sortingDetailId;
	private CommodityBase commodityBase;
	private CommodityPacking commodityPacking;
	private GoodsLocator goodsLocator;
	private GoodsOwner goodsOwner;
	private GoodsOwnerCommodity goodsOwnerCommodity;
	private Pallets pallets;
	private Sorting sorting;
	private StorageAreas storageAreas;
	private StorageRacks storageRacks;
	private UserInfo userInfoByOutUserId;
	private UserInfo userInfoBySortingUserId;
	private UserInfo userInfoByTransferUserId;
	private Warehouse warehouse;
	private String palletsCode;
	private String commodityBarcode;
	private String commodityName;
	private String commodityStandard;
	private String commodityPackingUnit;
	private Integer commodityPackingQuantity;
	private int outQuantity;
	private int sortingType;
	private int sortingStatus;
	private Date sortingTime;
	private Date transferTime;
	private Date outTime;
	private Set<BoxDetail> boxDetails = new HashSet<BoxDetail>(0);

	public SortingDetail() {
	}

	public SortingDetail(CommodityBase commodityBase, GoodsLocator goodsLocator, GoodsOwner goodsOwner,
			GoodsOwnerCommodity goodsOwnerCommodity, Pallets pallets, Sorting sorting, UserInfo userInfoByOutUserId,
			UserInfo userInfoBySortingUserId, UserInfo userInfoByTransferUserId, Warehouse warehouse,
			String palletsCode, String commodityBarcode, String commodityName, String commodityStandard,
			int outQuantity, int sortingType, int sortingStatus, Date sortingTime, Date transferTime, Date outTime) {
		this.commodityBase = commodityBase;
		this.goodsLocator = goodsLocator;
		this.goodsOwner = goodsOwner;
		this.goodsOwnerCommodity = goodsOwnerCommodity;
		this.pallets = pallets;
		this.sorting = sorting;
		this.userInfoByOutUserId = userInfoByOutUserId;
		this.userInfoBySortingUserId = userInfoBySortingUserId;
		this.userInfoByTransferUserId = userInfoByTransferUserId;
		this.warehouse = warehouse;
		this.palletsCode = palletsCode;
		this.commodityBarcode = commodityBarcode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.outQuantity = outQuantity;
		this.sortingType = sortingType;
		this.sortingStatus = sortingStatus;
		this.sortingTime = sortingTime;
		this.transferTime = transferTime;
		this.outTime = outTime;
	}

	public SortingDetail(CommodityBase commodityBase, CommodityPacking commodityPacking, GoodsLocator goodsLocator,
			GoodsOwner goodsOwner, GoodsOwnerCommodity goodsOwnerCommodity, Pallets pallets, Sorting sorting,
			StorageAreas storageAreas, StorageRacks storageRacks, UserInfo userInfoByOutUserId,
			UserInfo userInfoBySortingUserId, UserInfo userInfoByTransferUserId, Warehouse warehouse,
			String palletsCode, String commodityBarcode, String commodityName, String commodityStandard,
			String commodityPackingUnit, Integer commodityPackingQuantity, int outQuantity, int sortingType,
			int sortingStatus, Date sortingTime, Date transferTime, Date outTime, Set<BoxDetail> boxDetails) {
		this.commodityBase = commodityBase;
		this.commodityPacking = commodityPacking;
		this.goodsLocator = goodsLocator;
		this.goodsOwner = goodsOwner;
		this.goodsOwnerCommodity = goodsOwnerCommodity;
		this.pallets = pallets;
		this.sorting = sorting;
		this.storageAreas = storageAreas;
		this.storageRacks = storageRacks;
		this.userInfoByOutUserId = userInfoByOutUserId;
		this.userInfoBySortingUserId = userInfoBySortingUserId;
		this.userInfoByTransferUserId = userInfoByTransferUserId;
		this.warehouse = warehouse;
		this.palletsCode = palletsCode;
		this.commodityBarcode = commodityBarcode;
		this.commodityName = commodityName;
		this.commodityStandard = commodityStandard;
		this.commodityPackingUnit = commodityPackingUnit;
		this.commodityPackingQuantity = commodityPackingQuantity;
		this.outQuantity = outQuantity;
		this.sortingType = sortingType;
		this.sortingStatus = sortingStatus;
		this.sortingTime = sortingTime;
		this.transferTime = transferTime;
		this.outTime = outTime;
		this.boxDetails = boxDetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sorting_detail_id", unique = true, nullable = false)
	public Integer getSortingDetailId() {
		return this.sortingDetailId;
	}

	public void setSortingDetailId(Integer sortingDetailId) {
		this.sortingDetailId = sortingDetailId;
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
	@JoinColumn(name = "goods_locator_id", nullable = false)
	public GoodsLocator getGoodsLocator() {
		return this.goodsLocator;
	}

	public void setGoodsLocator(GoodsLocator goodsLocator) {
		this.goodsLocator = goodsLocator;
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
	@JoinColumn(name = "pallets_id", nullable = false)
	public Pallets getPallets() {
		return this.pallets;
	}

	public void setPallets(Pallets pallets) {
		this.pallets = pallets;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sorting_id", nullable = false)
	public Sorting getSorting() {
		return this.sorting;
	}

	public void setSorting(Sorting sorting) {
		this.sorting = sorting;
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
	@JoinColumn(name = "out_user_id", nullable = false)
	public UserInfo getUserInfoByOutUserId() {
		return this.userInfoByOutUserId;
	}

	public void setUserInfoByOutUserId(UserInfo userInfoByOutUserId) {
		this.userInfoByOutUserId = userInfoByOutUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sorting_user_id", nullable = false)
	public UserInfo getUserInfoBySortingUserId() {
		return this.userInfoBySortingUserId;
	}

	public void setUserInfoBySortingUserId(UserInfo userInfoBySortingUserId) {
		this.userInfoBySortingUserId = userInfoBySortingUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transfer_user_id", nullable = false)
	public UserInfo getUserInfoByTransferUserId() {
		return this.userInfoByTransferUserId;
	}

	public void setUserInfoByTransferUserId(UserInfo userInfoByTransferUserId) {
		this.userInfoByTransferUserId = userInfoByTransferUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id", nullable = false)
	public Warehouse getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Column(name = "pallets_code", nullable = false, length = 13)
	public String getPalletsCode() {
		return this.palletsCode;
	}

	public void setPalletsCode(String palletsCode) {
		this.palletsCode = palletsCode;
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

	@Column(name = "out_quantity", nullable = false)
	public int getOutQuantity() {
		return this.outQuantity;
	}

	public void setOutQuantity(int outQuantity) {
		this.outQuantity = outQuantity;
	}

	@Column(name = "sorting_type", nullable = false)
	public int getSortingType() {
		return this.sortingType;
	}

	public void setSortingType(int sortingType) {
		this.sortingType = sortingType;
	}

	@Column(name = "sorting_status", nullable = false)
	public int getSortingStatus() {
		return this.sortingStatus;
	}

	public void setSortingStatus(int sortingStatus) {
		this.sortingStatus = sortingStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sorting_time", nullable = false, length = 19)
	public Date getSortingTime() {
		return this.sortingTime;
	}

	public void setSortingTime(Date sortingTime) {
		this.sortingTime = sortingTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "transfer_time", nullable = false, length = 19)
	public Date getTransferTime() {
		return this.transferTime;
	}

	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "out_time", nullable = false, length = 19)
	public Date getOutTime() {
		return this.outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sortingDetail")
	public Set<BoxDetail> getBoxDetails() {
		return this.boxDetails;
	}

	public void setBoxDetails(Set<BoxDetail> boxDetails) {
		this.boxDetails = boxDetails;
	}

}
