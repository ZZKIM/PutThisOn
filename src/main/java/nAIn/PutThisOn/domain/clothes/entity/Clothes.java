package nAIn.PutThisOn.domain.clothes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nAIn.PutThisOn.domain.clothes.dto.ClothesDto;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageUrl;
    private Long price;
    private String siteUrl;
    private Size size;
    private Color color;

    public Clothes(ClothesDto.Request clothesDto) {
        this.name = clothesDto.getName();
        this.imageUrl = clothesDto.getImageUrl();
        this.price = clothesDto.getPrice();
        this.siteUrl = clothesDto.getSiteUrl();
        this.size = clothesDto.getSize();
        this.color = clothesDto.getColor();

    }

    public void update(ClothesDto.Request clothesDto) {
        this.name = clothesDto.getName();
        this.imageUrl = clothesDto.getImageUrl();
        this.price = clothesDto.getPrice();
        this.siteUrl = clothesDto.getSiteUrl();
        this.size = clothesDto.getSize();
        this.color = clothesDto.getColor();
    }
}
