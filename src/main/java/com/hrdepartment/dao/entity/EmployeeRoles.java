package com.hrdepartment.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EmployeeRoles extends BaseEntity {
    @Column
    private Integer roleId;

    @Column
    private Integer employeeId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonIgnore
    private Roles role;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeId", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonIgnore
    private Employees employee;
}
