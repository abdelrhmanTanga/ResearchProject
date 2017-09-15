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
@Table(name = "project_employees")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjectEmployees.findAll", query = "SELECT p FROM ProjectEmployees p")
    , @NamedQuery(name = "ProjectEmployees.findById", query = "SELECT p FROM ProjectEmployees p WHERE p.id = :id")
    , @NamedQuery(name = "ProjectEmployees.findByCreateDate", query = "SELECT p FROM ProjectEmployees p WHERE p.createDate = :createDate")
    , @NamedQuery(name = "ProjectEmployees.findByModifyDate", query = "SELECT p FROM ProjectEmployees p WHERE p.modifyDate = :modifyDate")
    , @NamedQuery(name = "ProjectEmployees.findByRetireDate", query = "SELECT p FROM ProjectEmployees p WHERE p.retireDate = :retireDate")
    , @NamedQuery(name = "ProjectEmployees.findByRetired", query = "SELECT p FROM ProjectEmployees p WHERE p.retired = :retired")
    , @NamedQuery(name = "ProjectEmployees.findByRole", query = "SELECT p FROM ProjectEmployees p WHERE p.role = :role")
    , @NamedQuery(name = "ProjectEmployees.findByParticipation", query = "SELECT p FROM ProjectEmployees p WHERE p.participation = :participation")
    , @NamedQuery(name = "ProjectEmployees.findByMonths", query = "SELECT p FROM ProjectEmployees p WHERE p.months = :months")
    , @NamedQuery(name = "ProjectEmployees.findByBonus", query = "SELECT p FROM ProjectEmployees p WHERE p.bonus = :bonus")})
public class ProjectEmployees implements Serializable {

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
    @Column(name = "role")
    private String role;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "participation")
    private Float participation;
    @Column(name = "months")
    private Integer months;
    @Column(name = "bonus")
    private Double bonus;
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    @ManyToOne
    private Employee employeeId;
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne
    private Project projectId;

    public ProjectEmployees() {
    }

    public ProjectEmployees(Long id) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Float getParticipation() {
        return participation;
    }

    public void setParticipation(Float participation) {
        this.participation = participation;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
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
        if (!(object instanceof ProjectEmployees)) {
            return false;
        }
        ProjectEmployees other = (ProjectEmployees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cassandrarest.ProjectEmployees[ id=" + id + " ]";
    }
    
}
