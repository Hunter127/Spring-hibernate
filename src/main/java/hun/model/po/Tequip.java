package hun.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author hun
 * @Description: TODO
 * @date 2015年11月30日 下午5:21:41
 */
@Entity
@Table(name = "QEQUIP", schema = "")
public class Tequip implements java.io.Serializable {
	private String cid;
	private String cmodel;
	private String cname;
	private String cproducer;
	private String cdesc;
	private Integer cno;

	public Tequip() {
		super();
	}

	public Tequip(String cid, String cmodel) {
		super();
		this.cid = cid;
		this.cmodel = cmodel;
	}

	public Tequip(String cid, String cmodel, String cproducer, String cdesc,
			Integer cno) {
		super();
		this.cid = cid;
		this.cmodel = cmodel;
		this.cproducer = cproducer;
		this.cdesc = cdesc;
		this.cno = cno;
	}
	@Id
	@Column(name = "CID", unique = true, nullable = false, length = 36)
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
	@Column(name = "CMODEL", nullable = false, length = 100)
	public String getCmodel() {
		return cmodel;
	}

	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	@Column(name = "CNAME", length = 100)
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column(name = "CPRODUCER", length = 100)
	public String getCproducer() {
		return cproducer;
	}

	public void setCproducer(String cproducer) {
		this.cproducer = cproducer;
	}
	@Column(name = "CDESC", length = 100)
	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	@Column(name = "CNO", precision = 8, scale = 0)
	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

}
