package com.hrdepartment.dao.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Roles extends BaseEntity {
//    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
//    private List<EmployeeRoles> employeeRoles;
}
