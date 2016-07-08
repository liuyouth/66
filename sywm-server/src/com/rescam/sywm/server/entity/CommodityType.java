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
 * CommodityType generated by hbm2java
 */
@Entity
@Table(name = "commodity_type", catalog = "sywm")
public class CommodityType implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer commodityTypeId;
	private StorageAreas storageAreas;
	private String commodityTypeCode;
	private String commodityTypeName;
	private int commodityTypeParentId;
	private boolean isDelete;
	private Set<CommodityBase> commodityBases = new HashSet<CommodityBase>(0);

	public CommodityType() {
	}

	public CommodityType(String commodityTypeCode, String commodityTypeName, int commodityTypeParentId,
			boolean isDelete) {
		this.commodityTypeCode = commodityTypeCode;
		this.commodityTypeName = commodityTypeName;
		this.commodityTypeParentId = commodityTypeParentId;
		this.isDelete = isDelete;
	}

	public CommodityType(StorageAreas storageAreas, String commodityTypeCode, String commodityTypeName,
			int commodityTypeParentId, boolean isDelete, Set<CommodityBase> commodityBases) {
		this.storageAreas = storageAreas;
		this.commodityTypeCode = commodityTypeCode;
		this.commodityTypeName = commodityTypeName;
		this.commodityTypeParentId = commodityTypeParentId;
		this.isDelete = isDelete;
		this.commodityBases = commodityBases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "commodity_type_id", unique = true, nullable = false)
	public Integer getCommodityTypeId() {
		return this.commodityTypeId;
	}

	public void setCommodityTypeId(Integer commodityTypeId) {
		this.commodityTypeId = commodityTypeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "storage_areas_id")
	public StorageAreas getStorageAreas() {
		return this.storageAreas;
	}

	public void setStorageAreas(StorageAreas storageAreas) {
		this.storageAreas = storageAreas;
	}

	@Column(name = "commodity_type_code", nullable = false, length = 20)
	public String getCommodityTypeCode() {
		return this.commodityTypeCode;
	}

	public void setCommodityTypeCode(String commodityTypeCode) {
		this.commodityTypeCode = commodityTypeCode;
	}

	@Column(name = "commodity_type_name", nullable = false, length = 50)
	public String getCommodityTypeName() {
		return this.commodityTypeName;
	}

	public void setCommodityTypeName(String commodityTypeName) {
		this.commodityTypeName = commodityTypeName;
	}

	@Column(name = "commodity_type_parent_id", nullable = false)
	public int getCommodityTypeParentId() {
		return this.commodityTypeParentId;
	}

	public void setCommodityTypeParentId(int commodityTypeParentId) {
		this.commodityTypeParentId = commodityTypeParentId;
	}

	@Column(name = "is_delete", nullable = false)
	public boolean isIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "commodityType")
	public Set<CommodityBase> getCommodityBases() {
		return this.commodityBases;
	}

	public void setCommodityBases(Set<CommodityBase> commodityBases) {
		this.commodityBases = commodityBases;
	}

}
