package nAIn.PutThisOn.domain.clothes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import nAIn.PutThisOn.domain.clothes.entity.Clothes;
import nAIn.PutThisOn.domain.clothes.entity.Color;
import nAIn.PutThisOn.domain.clothes.entity.Size;


public class ClothesDto {
    @Data
    @AllArgsConstructor
    public static class Request{
        String name;
        String imageUrl;
        Long price;
        String siteUrl;
        Size size;
        Color color;
    }
    @Data
    @AllArgsConstructor
    public static class Response{
        private Long id;
        String name;
        String imageUrl;
        Long price;
        String siteUrl;
        Size size;
        Color color;

        public Response(Clothes clothes) {
            this.id = clothes.getId();
            this.name = clothes.getName();
            this.imageUrl = clothes.getImageUrl();
            this.price = clothes.getPrice();
            this.siteUrl = clothes.getSiteUrl();
            this.size = clothes.getSize();
            this.color = clothes.getColor();
        }
    }
}
