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
@Table(name = "tasks_expected_outcomes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TasksExpectedOutcomes.findAll", query = "SELECT t FROM TasksExpectedOutcomes t")
    , @NamedQuery(name = "TasksExpectedOutcomes.findById", query = "SELECT t FROM TasksExpectedOutcomes t WHERE t.id = :id")
    , @NamedQuery(name = "TasksExpectedOutcomes.findByCreateDate", query = "SELECT t FROM TasksExpectedOutcomes t WHERE t.createDate = :createDate")
    , @NamedQuery(name = "TasksExpectedOutcomes.findByModifyDate", query = "SELECT t FROM TasksExpectedOutcomes t WHERE t.modifyDate = :modifyDate")
    , @NamedQuery(name = "TasksExpectedOutcomes.findByRetireDate", query = "SELECT t FROM TasksExpectedOutcomes t WHERE t.retireDate = :retireDate")
    , @NamedQuery(name = "TasksExpectedOutcomes.findByRetired", query = "SELECT t FROM TasksExpectedOutcomes t WHERE t.retired = :retired")
    , @NamedQuery(name = "TasksExpectedOutcomes.findByExpectation", query = "SELECT t FROM TasksExpectedOutcomes t WHERE t.expectation = :expectation")})
public class TasksExpectedOutcomes implements Serializable {

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
    @Column(name = "expectation")
    private String expectation;
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    @ManyToOne
    private Tasks taskId;

    public TasksExpectedOutcomes() {
    }

    public TasksExpectedOutcomes(Long id) {
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

    public String getExpectation() {
        return expectation;
    }

    public void setExpectation(String expectation) {
        this.expectation = expectation;
    }

    public Tasks getTaskId() {
        return taskId;
    }

    public void setTaskId(Tasks taskId) {
        this.taskId = taskId;
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
        if (!(object instanceof TasksExpectedOutcomes)) {
            return false;
        }
        TasksExpectedOutcomes other = (TasksExpectedOutcomes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cassandrarest.TasksExpectedOutcomes[ id=" + id + " ]";
    }
    
}
