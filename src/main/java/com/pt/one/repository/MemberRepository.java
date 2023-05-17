package com.pt.one.repository;

import com.pt.one.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    @Query(nativeQuery = true,
            value = "SELECT * FROM cement.member WHERE member.member_id = :member_id")
    Optional<MemberEntity> findByMember_id(@Param("member_id") String member_id);
}
