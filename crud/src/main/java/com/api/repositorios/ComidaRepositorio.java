package com.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entidades.ComidaEntidade;

public interface ComidaRepositorio extends JpaRepository<ComidaEntidade, Long> {

}
