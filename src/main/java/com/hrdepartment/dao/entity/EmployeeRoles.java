package com.hrdepartment.dao.entity;

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
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId", referencedColumnName = "id")
    @JsonIgnore
    private Roles role;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeId", referencedColumnName = "id")
    @JsonIgnore
    private Employees employee;
}
