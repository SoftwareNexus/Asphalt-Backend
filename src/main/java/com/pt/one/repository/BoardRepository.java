package com.pt.one.repository;

import com.pt.one.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface BoardRepository extends JpaRepository<BoardEntity, BigInteger> {
}
