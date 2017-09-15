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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sheko
 */
@Entity
@Table(name = "tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t")
    , @NamedQuery(name = "Tasks.findById", query = "SELECT t FROM Tasks t WHERE t.id = :id")
    , @NamedQuery(name = "Tasks.findByName", query = "SELECT t FROM Tasks t WHERE t.name = :name")
    , @NamedQuery(name = "Tasks.findByCreateDate", query = "SELECT t FROM Tasks t WHERE t.createDate = :createDate")
    , @NamedQuery(name = "Tasks.findByModifyDate", query = "SELECT t FROM Tasks t WHERE t.modifyDate = :modifyDate")
    , @NamedQuery(name = "Tasks.findByRetireDate", query = "SELECT t FROM Tasks t WHERE t.retireDate = :retireDate")
    , @NamedQuery(name = "Tasks.findByRetired", query = "SELECT t FROM Tasks t WHERE t.retired = :retired")
    , @NamedQuery(name = "Tasks.findByStartDate", query = "SELECT t FROM Tasks t WHERE t.startDate = :startDate")
    , @NamedQuery(name = "Tasks.findByEndDate", query = "SELECT t FROM Tasks t WHERE t.endDate = :endDate")
    , @NamedQuery(name = "Tasks.findByDuration", query = "SELECT t FROM Tasks t WHERE t.duration = :duration")})
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
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
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "duration")
    private Integer duration;
    @OneToMany(mappedBy = "taskId")
    private Collection<TasksExpectedOutcomes> tasksExpectedOutcomesCollection;
    @JoinColumn(name = "lfm_id", referencedColumnName = "id")
    @ManyToOne
    private Lfm lfmId;

    public Tasks() {
    }

    public Tasks(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @XmlTransient
    public Collection<TasksExpectedOutcomes> getTasksExpectedOutcomesCollection() {
        return tasksExpectedOutcomesCollection;
    }

    public void setTasksExpectedOutcomesCollection(Collection<TasksExpectedOutcomes> tasksExpectedOutcomesCollection) {
        this.tasksExpectedOutcomesCollection = tasksExpectedOutcomesCollection;
    }

    public Lfm getLfmId() {
        return lfmId;
    }

    public void setLfmId(Lfm lfmId) {
        this.lfmId = lfmId;
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
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cassandrarest.Tasks[ id=" + id + " ]";
    }
    
}
