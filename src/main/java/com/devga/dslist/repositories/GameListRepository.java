package com.devga.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devga.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
