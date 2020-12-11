package com.hrdepartment.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

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
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeRoles> employeeRoles;
}
