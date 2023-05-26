package nAIn.PutThisOn.domain.clothes.repository;

import nAIn.PutThisOn.domain.clothes.entity.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
