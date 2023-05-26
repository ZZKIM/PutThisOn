package nAIn.PutThisOn.domain.avatar.repository;

import nAIn.PutThisOn.domain.avatar.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}
