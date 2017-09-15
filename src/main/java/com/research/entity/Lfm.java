/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.research.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sheko
 */
@Entity
@Table(name = "lfm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lfm.findAll", query = "SELECT l FROM Lfm l")
    , @NamedQuery(name = "Lfm.findById", query = "SELECT l FROM Lfm l WHERE l.id = :id")
    , @NamedQuery(name = "Lfm.findByCreateDate", query = "SELECT l FROM Lfm l WHERE l.createDate = :createDate")
    , @NamedQuery(name = "Lfm.findByModifyDate", query = "SELECT l FROM Lfm l WHERE l.modifyDate = :modifyDate")
    , @NamedQuery(name = "Lfm.findByRetireDate", query = "SELECT l FROM Lfm l WHERE l.retireDate = :retireDate")
    , @NamedQuery(name = "Lfm.findByRetired", query = "SELECT l FROM Lfm l WHERE l.retired = :retired")})
public class Lfm implements Serializable {

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
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne
    private Project projectId;
    @OneToMany(mappedBy = "lfmId")
    private Collection<Tasks> tasksCollection;

    public Lfm() {
    }

    public Lfm(Long id) {
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

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    @XmlTransient
    public Collection<Tasks> getTasksCollection() {
        return tasksCollection;
    }

    public void setTasksCollection(Collection<Tasks> tasksCollection) {
        this.tasksCollection = tasksCollection;
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
        if (!(object instanceof Lfm)) {
            return false;
        }
        Lfm other = (Lfm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cassandrarest.Lfm[ id=" + id + " ]";
    }
    
}
