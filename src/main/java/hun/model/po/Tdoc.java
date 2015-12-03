package hun.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author hun
 * @Description: TODO
 * @date 2015年11月30日 下午4:53:22
 */
@Entity
@Table(name = "QDOC", schema = "")
public class Tdoc implements java.io.Serializable {
	private String cid;
	private String cmodel;
	private String cname;
	private String cproducer;
	private Integer cno;
	private String cmanual;

	public Tdoc() {
		super();
	}

	public Tdoc(String cid, String cmodel) {
		super();
		this.cid = cid;
		this.cmodel = cmodel;
	}

	public Tdoc(String cid, String cmodel, String cname, String cproducer,
			Integer cno, String cmanual) {
		super();
		this.cid = cid;
		this.cmodel = cmodel;
		this.cname = cname;
		this.cproducer = cproducer;
		this.cno = cno;
		this.cmanual = cmanual;
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

	/**
	 * （1）precision=10代表有效数字为10位，即从左边第一个不为0的数字开始到最右边的位数， scale=2代表的就是小数点右边的位数。
	 * 
	 * （2）底层数据库的细节对于hibernate来说是透明的，也就是无论什么数据库你都可以按这样子来设置， hibernate会自动帮你完成底层操作。
	 * 
	 * @return
	 */
	@Column(name = "CNO", precision = 8, scale = 0)
	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	@Column(name = "CMANUAL", length = 100)
	public String getCmanual() {
		return cmanual;
	}

	public void setCmanual(String cmanual) {
		this.cmanual = cmanual;
	}

}
