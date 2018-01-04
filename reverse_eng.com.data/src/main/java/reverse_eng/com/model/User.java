package reverse_eng.com.model;
// Generated Jan 4, 2018 1:20:52 AM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "reverse_eng")
public class User implements java.io.Serializable {

	private Integer id;
	private String name;
	private String address;
	private Set<UserEmail> userEmails;

	public User() {
	}

	public User(String name, String address, Set<UserEmail> userEmails) {
		this.name = name;
		this.address = address;
		this.userEmails = userEmails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 211)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 211)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserEmail> getUserEmails() {
		return this.userEmails;
	}

	public void setUserEmails(Set<UserEmail> userEmails) {
		this.userEmails = userEmails;
	}

}