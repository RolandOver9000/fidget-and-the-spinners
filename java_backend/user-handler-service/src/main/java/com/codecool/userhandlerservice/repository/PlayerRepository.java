package com.codecool.userhandlerservice.repository;

import com.codecool.userhandlerservice.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, String> {

    Optional<Player> findByUserName(String s);

    @Query("SELECT p FROM players AS p")
    List<Player> findAllPlayers();

}
