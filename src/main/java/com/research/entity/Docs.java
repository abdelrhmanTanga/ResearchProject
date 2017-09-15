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
@Table(name = "docs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docs.findAll", query = "SELECT d FROM Docs d")
    , @NamedQuery(name = "Docs.findById", query = "SELECT d FROM Docs d WHERE d.id = :id")
    , @NamedQuery(name = "Docs.findByCreateDate", query = "SELECT d FROM Docs d WHERE d.createDate = :createDate")
    , @NamedQuery(name = "Docs.findByModifyDate", query = "SELECT d FROM Docs d WHERE d.modifyDate = :modifyDate")
    , @NamedQuery(name = "Docs.findByRetireDate", query = "SELECT d FROM Docs d WHERE d.retireDate = :retireDate")
    , @NamedQuery(name = "Docs.findByRetired", query = "SELECT d FROM Docs d WHERE d.retired = :retired")
    , @NamedQuery(name = "Docs.findByDocPath", query = "SELECT d FROM Docs d WHERE d.docPath = :docPath")
    , @NamedQuery(name = "Docs.findByIsUploaded", query = "SELECT d FROM Docs d WHERE d.isUploaded = :isUploaded")})
public class Docs implements Serializable {

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
    @Column(name = "doc_path")
    private String docPath;
    @Column(name = "is_uploaded")
    private Short isUploaded;
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne
    private Project projectId;

    public Docs() {
    }

    public Docs(Long id) {
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

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public Short getIsUploaded() {
        return isUploaded;
    }

    public void setIsUploaded(Short isUploaded) {
        this.isUploaded = isUploaded;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
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
        if (!(object instanceof Docs)) {
            return false;
        }
        Docs other = (Docs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cassandrarest.Docs[ id=" + id + " ]";
    }
    
}
