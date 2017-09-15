/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.research.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sheko
 */
@Entity
@Table(name = "sys_user_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysUserRoles.findAll", query = "SELECT s FROM SysUserRoles s")
    , @NamedQuery(name = "SysUserRoles.findById", query = "SELECT s FROM SysUserRoles s WHERE s.id = :id")
    , @NamedQuery(name = "SysUserRoles.findByCreateDate", query = "SELECT s FROM SysUserRoles s WHERE s.createDate = :createDate")
    , @NamedQuery(name = "SysUserRoles.findByModifyDate", query = "SELECT s FROM SysUserRoles s WHERE s.modifyDate = :modifyDate")
    , @NamedQuery(name = "SysUserRoles.findByRetireDate", query = "SELECT s FROM SysUserRoles s WHERE s.retireDate = :retireDate")
    , @NamedQuery(name = "SysUserRoles.findByRetired", query = "SELECT s FROM SysUserRoles s WHERE s.retired = :retired")
    , @NamedQuery(name = "SysUserRoles.findByName", query = "SELECT s FROM SysUserRoles s WHERE s.name = :name")})
public class SysUserRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "retire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date retireDate;
    @Column(name = "retired")
    private Short retired;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    @ManyToOne
    private Role roleId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    private SysUser userId;

    public SysUserRoles() {
    }

    public SysUserRoles(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(Date retireDate) {
        this.retireDate = retireDate;
    }

    public Short getRetired() {
        return retired;
    }

    public void setRetired(Short retired) {
        this.retired = retired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public SysUser getUserId() {
        return userId;
    }

    public void setUserId(SysUser userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysUserRoles)) {
            return false;
        }
        SysUserRoles other = (SysUserRoles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cassandrarest.SysUserRoles[ id=" + id + " ]";
    }
    
}
