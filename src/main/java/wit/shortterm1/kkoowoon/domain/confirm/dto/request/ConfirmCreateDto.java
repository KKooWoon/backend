package wit.shortterm1.kkoowoon.domain.confirm.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ConfirmCreateDto {

    @ApiModelProperty(value = "인증 글 내용", required = true, example = "2022-07-17")
    private String description;

    @ApiModelProperty(value = "인증 사진 URL_1", required = true, example = "photo-url.com/1")
    private String photoUrl1;

    @ApiModelProperty(value = "인증 사진 URL_2", required = true, example = "photo-url.com/2")
    private String photoUrl2;

    @ApiModelProperty(value = "인증 사진 URL_3", required = true, example = "photo-url.com/3")
    private String photoUrl3;

}