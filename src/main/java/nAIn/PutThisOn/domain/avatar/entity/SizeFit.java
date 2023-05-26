package nAIn.PutThisOn.domain.avatar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nAIn.PutThisOn.domain.avatar.dto.AvatarDto;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class SizeFit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long height;
    private Long weight;
    private Long bust;
    private Long waist;
    private Long hip;

    public SizeFit(AvatarDto.Request avatarDto) {
        this.height = avatarDto.getHeight();
        this.weight = avatarDto.getWeight();
        this.bust = avatarDto.getBust();
        this.waist = avatarDto.getWaist();
        this.hip = avatarDto.getHip();
    }

    public void update(AvatarDto.Request avatarDto) {
        this.height = avatarDto.getHeight();
        this.weight = avatarDto.getWeight();
        this.bust = avatarDto.getBust();
        this.waist = avatarDto.getWaist();
        this.hip = avatarDto.getHip();
    }
}
