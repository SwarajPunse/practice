package com.importcsv.springbootimportcsvfileapp.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "csv_data")
public class CsvToDatabaseEntity {

	@Id
	@Column(name = "sr no")
	private long id;

	@Column(name = "gate_in_date_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dateTime;

	@Column(name = "container")
	private String container;

	@Column(name = "size")
	private double size;

	@Column(name = "type")
	private String type;

	@Column(name = "iso_code")
	private int iso;

	@Column(name = "igm_no")
	private String igm_no;

	@Column(name = "item_no")
	private int item_no;

	@Column(name = "status")
	private String fcl;

	@Column(name = "hold_status", nullable = true)
	private char hold;

	@Column(name = "weight")
	private String Weight;

	@Column(name = "agent_seal")
	private String agent_seal;

	@Column(name = "vessel_name")
	private String vessel_name;

	@Column(name = "vcn_no")
	private String vcn_no;

	@Column(name = "voy_no")
	private String voy_no;

	@Column(name = "port")
	private String port;

	@Column(name = "importer")
	private String importer;

	@Column(name = "container_status", nullable = true)
	private String container_status;

	public CsvToDatabaseEntity(long id, LocalDateTime dateTime, String container, double size, String type, int iso,
			String igm_no, int item_no, String fcl, char hold, String weight, String agent_seal, String vessel_name,
			String vcn_no, String voy_no, String port, String importer, String container_status) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.container = container;
		this.size = size;
		this.type = type;
		this.iso = iso;
		this.igm_no = igm_no;
		this.item_no = item_no;
		this.fcl = fcl;
		this.hold = hold;
		Weight = weight;
		this.agent_seal = agent_seal;
		this.vessel_name = vessel_name;
		this.vcn_no = vcn_no;
		this.voy_no = voy_no;
		this.port = port;
		this.importer = importer;
		this.container_status = container_status;
	}

	public CsvToDatabaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIso() {
		return iso;
	}

	public void setIso(int iso) {
		this.iso = iso;
	}

	public String getIgm_no() {
		return igm_no;
	}

	public void setIgm_no(String igm_no) {
		this.igm_no = igm_no;
	}

	public int getItem_no() {
		return item_no;
	}

	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}

	public String getFcl() {
		return fcl;
	}

	public void setFcl(String fcl) {
		this.fcl = fcl;
	}

	public char getHold() {
		return hold;
	}

	public void setHold(char hold) {
		this.hold = hold;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getAgent_seal() {
		return agent_seal;
	}

	public void setAgent_seal(String agent_seal) {
		this.agent_seal = agent_seal;
	}

	public String getVessel_name() {
		return vessel_name;
	}

	public void setVessel_name(String vessel_name) {
		this.vessel_name = vessel_name;
	}

	public String getVcn_no() {
		return vcn_no;
	}

	public void setVcn_no(String vcn_no) {
		this.vcn_no = vcn_no;
	}

	public String getVoy_no() {
		return voy_no;
	}

	public void setVoy_no(String voy_no) {
		this.voy_no = voy_no;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getImporter() {
		return importer;
	}

	public void setImporter(String importer) {
		this.importer = importer;
	}

	public String getContainer_status() {
		return container_status;
	}

	public void setContainer_status(String container_status) {
		this.container_status = container_status;
	}

	@Override
	public String toString() {
		return "CsvToDatabaseEntity [id=" + id + ", dateTime=" + dateTime + ", container=" + container + ", size="
				+ size + ", type=" + type + ", iso=" + iso + ", igm_no=" + igm_no + ", item_no=" + item_no + ", fcl="
				+ fcl + ", hold=" + hold + ", Weight=" + Weight + ", agent_seal=" + agent_seal + ", vessel_name="
				+ vessel_name + ", vcn_no=" + vcn_no + ", voy_no=" + voy_no + ", port=" + port + ", importer="
				+ importer + ", container_status=" + container_status + "]";
	}

}
