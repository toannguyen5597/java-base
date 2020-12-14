package com.hrdepartment.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EmployeeRoles extends BaseEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    private Roles role;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    @JsonIgnore
    private Roles role2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employeeId")
    private Employees employee2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employeeId")
    @JsonIgnore
    private Employees employee;
}