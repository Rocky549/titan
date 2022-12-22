package com.titan.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "POS_TCM_T_IGM",schema = "zapcom")
@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ImportGeneralManifestBO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IGM_UID", updatable = false, nullable = false)
	private long igmid;
	@Column(name = "IGM_NUM")
	private String igmNum;
	@Column(name = "VSL_NAME")
	private String vslName;
	@Column(name = "VCN_NUM")
	private String vcnNum;
	@Column(name = "IMO_CODE_OF_VSL")
	private String imoCode;
	@Column(name = "VOYG_NUM")
	private String voyageNo;
	
	
	
}
