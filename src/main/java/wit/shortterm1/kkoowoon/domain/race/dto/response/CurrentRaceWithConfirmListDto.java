package wit.shortterm1.kkoowoon.domain.race.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CurrentRaceWithConfirmListDto {

    @ApiModelProperty(value = "레이스 참여 개수", required = true, example = "2")
    private int count = 0;

    @ApiModelProperty(value = "현재 참여중인 레이스 정보 리스트", required = true, example = "현재 참여중인 레이스 리스트")
    private final List<RaceInfoWithConfirmDto> currentRaceInfoWithConfirmDto = new ArrayList<>();

    public static CurrentRaceWithConfirmListDto createDto() {
        return new CurrentRaceWithConfirmListDto();
    }

    public void addRace(RaceInfoWithConfirmDto raceInfoWithConfirmDto) {
        count++;
        currentRaceInfoWithConfirmDto.add(raceInfoWithConfirmDto);
    }
}
