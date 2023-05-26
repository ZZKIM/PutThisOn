package nAIn.PutThisOn.domain.avatar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nAIn.PutThisOn.domain.avatar.dto.AvatarDto;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Avatar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private SizeFit sizeFit;
    @Enumerated(EnumType.STRING)
    private BodyType bodyType;
    @Enumerated(EnumType.STRING)
    private SkinTone skinTone;
    private String imageUrl;

    public Avatar(AvatarDto.Request avatarDto, SizeFit sizeFit) {
        this.sizeFit = sizeFit;
        this.bodyType = avatarDto.getBodyType();
        this.skinTone = avatarDto.getSkinTone();
        this.imageUrl = avatarDto.getImageUrl();
    }

    public void update(AvatarDto.Request avatarDto) {
        this.bodyType = avatarDto.getBodyType();
        this.skinTone = avatarDto.getSkinTone();
        this.imageUrl = avatarDto.getImageUrl();
    }
}
