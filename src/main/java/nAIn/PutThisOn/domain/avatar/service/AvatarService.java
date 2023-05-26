package nAIn.PutThisOn.domain.avatar.service;

import lombok.RequiredArgsConstructor;
import nAIn.PutThisOn.domain.avatar.dto.AvatarDto;
import nAIn.PutThisOn.domain.avatar.entity.Avatar;
import nAIn.PutThisOn.domain.avatar.entity.SizeFit;
import nAIn.PutThisOn.domain.avatar.repository.AvatarRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvatarService {
    private final AvatarRepository avatarRepository;
    public void save(AvatarDto.Request avatarDto){
        SizeFit sizeFit = new SizeFit(avatarDto);
        Avatar avatar = new Avatar(avatarDto,sizeFit);

        avatarRepository.save(avatar);
    }
    public AvatarDto.Response read(Long avatarId){
        Avatar avatar = avatarRepository.findById(avatarId).get();
        return new AvatarDto.Response(avatar);
    }
    public void update(Long avatarId, AvatarDto.Request avatarDto){
        Avatar avatar = avatarRepository.findById(avatarId).get();
        avatar.getSizeFit().update(avatarDto);
        avatar.update(avatarDto);
        avatarRepository.save(avatar);
    }
    public void delete(Long avatarId){
        avatarRepository.deleteById(avatarId);
    }
}
