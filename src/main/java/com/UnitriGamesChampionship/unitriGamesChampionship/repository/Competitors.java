package com.UnitriGamesChampionship.unitriGamesChampionship.repository;

import com.UnitriGamesChampionship.unitriGamesChampionship.model.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by joaop on 06/09/2017.
 */
public interface Competitors extends JpaRepository<Competitor,Long> {
}
