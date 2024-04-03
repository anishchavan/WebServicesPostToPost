package com.cjc.homerepository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Player;

public interface HomeRepository extends CrudRepository<Player, Integer> {

}
