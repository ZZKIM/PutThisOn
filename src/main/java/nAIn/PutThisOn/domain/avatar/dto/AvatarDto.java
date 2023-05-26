package nAIn.PutThisOn.domain.avatar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import nAIn.PutThisOn.domain.avatar.entity.Avatar;
import nAIn.PutThisOn.domain.avatar.entity.BodyType;
import nAIn.PutThisOn.domain.avatar.entity.SkinTone;
import org.springframework.web.multipart.MultipartFile;


public class AvatarDto {
    @Data
    @AllArgsConstructor
    public static class Request{
        Long height;
        Long weight;
        Long bust;
        Long waist;
        Long hip;
        BodyType bodyType;
        SkinTone skinTone;
        String imageUrl;
    }
    @Data
    @AllArgsConstructor
    public static class Response{
        Long height;
        Long weight;
        Long bust;
        Long waist;
        Long hip;
        BodyType bodyType;
        SkinTone skinTone;
        String imageUrl;

        public Response(Avatar avatar) {
            this.height = avatar.getSizeFit().getHeight();
            this.weight = avatar.getSizeFit().getWeight();
            this.bust = avatar.getSizeFit().getBust();
            this.waist = avatar.getSizeFit().getWaist();
            this.hip = avatar.getSizeFit().getHip();
            this.bodyType = avatar.getBodyType();
            this.skinTone = avatar.getSkinTone();
            this.imageUrl = avatar.getImageUrl();
        }
    }
}
