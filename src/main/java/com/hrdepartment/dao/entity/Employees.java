package com.hrdepartment.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employees extends BaseEntity {
    @Column
    private String name;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeRoles> employeeRoles;

    @OneToMany(mappedBy = "employee2", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<EmployeeRoles> employeeRoles2;
}
