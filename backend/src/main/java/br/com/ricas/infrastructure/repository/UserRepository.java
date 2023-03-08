package br.com.ricas.infrastructure.repository;

import br.com.ricas.infrastructure.entity.UserEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<UserEntity,Integer> {
}
