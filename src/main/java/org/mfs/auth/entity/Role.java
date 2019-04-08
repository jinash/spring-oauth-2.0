package org.mfs.auth.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role", catalog = "oauthdb")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "role_authority", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
	private Set<Authority> authorities;
	public Role() {
	}

	public Role(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}