package nAIn.PutThisOn.domain.avatar.controller;

import lombok.RequiredArgsConstructor;
import nAIn.PutThisOn.domain.avatar.dto.AvatarDto;
import nAIn.PutThisOn.domain.avatar.service.AvatarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AvatarController {
    private final AvatarService avatarService;
    public ResponseEntity<HttpStatus> createAvatar(@RequestBody AvatarDto.Request avatarDto){
        avatarService.save(avatarDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<AvatarDto.Response> readAvatar(@PathVariable Long avatarId){

        return new ResponseEntity<>(avatarService.read(avatarId), HttpStatus.OK);
    }
    public ResponseEntity<HttpStatus> updateAvatar(@PathVariable Long avatarId, @RequestBody AvatarDto.Request avatarDto){
        avatarService.update(avatarId, avatarDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    public ResponseEntity<AvatarDto.Response> deleteAvatar(@PathVariable Long avatarId){
        avatarService.delete(avatarId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
