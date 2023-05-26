package nAIn.PutThisOn.domain.clothes.controller;

import lombok.RequiredArgsConstructor;
import nAIn.PutThisOn.domain.clothes.dto.ClothesDto;
import nAIn.PutThisOn.domain.clothes.service.ClothesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClothesController {
    private final ClothesService clothesService;
    public ResponseEntity<HttpStatus> createAvatar(@RequestBody ClothesDto.Request clothesDto){
        clothesService.save(clothesDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<ClothesDto.Response> readAvatar(@PathVariable Long clothesId){

        return new ResponseEntity<>(clothesService.read(clothesId), HttpStatus.OK);
    }
    public ResponseEntity<HttpStatus> updateAvatar(@PathVariable Long clothesId, @RequestBody ClothesDto.Request clothesDto){
        clothesService.update(clothesId, clothesDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    public ResponseEntity<ClothesDto.Response> deleteAvatar(@PathVariable Long clothesId){
        clothesService.delete(clothesId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
