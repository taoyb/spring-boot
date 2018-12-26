package com.tyb.tybmod.prize.dao;

import com.tyb.tybmod.prize.entity.GamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auth: tyb
 * @Date: 18-8-31 上午10:07
 * @Desc:
 */
public interface GamePlayerDao/* extends JpaRepository<GamePlayer, String> */{

    List<GamePlayer> findByNickName(String nickName);
}
