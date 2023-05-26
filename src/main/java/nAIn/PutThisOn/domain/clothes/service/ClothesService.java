package nAIn.PutThisOn.domain.clothes.service;

import lombok.RequiredArgsConstructor;
import nAIn.PutThisOn.domain.clothes.dto.ClothesDto;
import nAIn.PutThisOn.domain.clothes.entity.Clothes;
import nAIn.PutThisOn.domain.clothes.repository.ClothesRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClothesService {
    private final ClothesRepository clothesRepository;
    public void save(ClothesDto.Request clothesDto){
        Clothes clothes = new Clothes(clothesDto);

        clothesRepository.save(clothes);
    }
    public ClothesDto.Response read(Long clothesId){
        Clothes clothes = clothesRepository.findById(clothesId).get();
        return new ClothesDto.Response(clothes);
    }
    public void update(Long clothesId, ClothesDto.Request clothesDto){
        Clothes clothes = clothesRepository.findById(clothesId).get();
        clothes.update(clothesDto);
        clothes.update(clothesDto);
        clothesRepository.save(clothes);
    }
    public void delete(Long clothesId){
        clothesRepository.deleteById(clothesId);
    }
}
