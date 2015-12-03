package hun.model.po;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author hun
 * @Description: TODO
 * @date 2015年11月30日 下午5:37:49
 */
@Entity
@Table(name = "QMENU", schema = "")
public class Tmenu implements java.io.Serializable {

	private String cid;
	private Tmenu tmenu;
	private String ciconcls;
	private String cname;
	private BigDecimal cseq;
	private String curl;
	private Set<Tmenu> tmenus = new HashSet<Tmenu>(0);
	
	public Tmenu() {
		super();
	}
	public Tmenu(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Tmenu(String cid, Tmenu tmenu, String ciconcls, String cname,
			BigDecimal cseq, String curl, Set<Tmenu> tmenus) {
		super();
		this.cid = cid;
		this.tmenu = tmenu;
		this.ciconcls = ciconcls;
		this.cname = cname;
		this.cseq = cseq;
		this.curl = curl;
		this.tmenus = tmenus;
	}
	@Id
	@Column(name = "CID",  nullable = false, length = 36)
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPID")
	public Tmenu getTmenu() {
		return tmenu;
	}
	public void setTmenu(Tmenu tmenu) {
		this.tmenu = tmenu;
	}
	@Column(name = "CICONCLS", length = 100)
	public String getCiconcls() {
		return ciconcls;
	}
	public void setCiconcls(String ciconcls) {
		this.ciconcls = ciconcls;
	}
	@Column(name = "CNAME", nullable = false, length = 100)
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column(name = "CSEQ", precision = 22, scale = 0)
	public BigDecimal getCseq() {
		return cseq;
	}
	public void setCseq(BigDecimal cseq) {
		this.cseq = cseq;
	}
	@Column(name = "CURL", length = 200)
	public String getCurl() {
		return curl;
	}
	public void setCurl(String curl) {
		this.curl = curl;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tmenu")
	public Set<Tmenu> getTmenus() {
		return tmenus;
	}
	public void setTmenus(Set<Tmenu> tmenus) {
		this.tmenus = tmenus;
	} 
	
	

}
