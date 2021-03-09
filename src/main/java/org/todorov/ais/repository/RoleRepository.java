package org.todorov.ais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.todorov.ais.model.entity.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
