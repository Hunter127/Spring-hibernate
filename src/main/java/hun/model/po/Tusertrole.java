package hun.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * implements java.io.Serializable  对象的生命周期是随着引用丢失而结束。但可以通过序列化将其状态保存，需要时再恢复
 * 序列化后对象可以保存进IO流里面。随时取出。但去了实现接口就不行了。
 * 同时序列化还有一个版本号。当反序列化版本号不对时就会抛出异常。
 * @author hun
 * @Description: TODO
 * @date 2015年11月30日 下午4:40:19
 */
@Entity
@Table(name="QUSERTROLE",schema="")
public class Tusertrole implements java.io.Serializable {
	
	private String cid;
	private Trole trole;
	private Tuser tuser;

	public Tusertrole() {
		super();
	}

	public Tusertrole(String cid) {
		super();
		this.cid = cid;
	}

	public Tusertrole(String cid, Trole trole, Tuser tuser) {
		super();
		this.cid = cid;
		this.trole = trole;
		this.tuser = tuser;
	}

	@Id
	@Column(name = "CID", nullable = false, length = 36)
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CROLEID")
	public Trole getTrole() {
		return trole;
	}

	public void setTrole(Trole trole) {
		this.trole = trole;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSERID")
	public Tuser getTuser() {
		return tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

}
